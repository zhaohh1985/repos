/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is part of dcm4che, an implementation of DICOM(TM) in
 * Java(TM), hosted at http://sourceforge.net/projects/dcm4che.
 *
 * The Initial Developer of the Original Code is
 * Agfa-Gevaert AG.
 * Portions created by the Initial Developer are Copyright (C) 2008
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 * See listed authors below.
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 *
 * ***** END LICENSE BLOCK ***** */

package org.dcm4chee.web.common.behaviours;

import org.apache.wicket.Application;
import org.apache.wicket.Component;
import org.apache.wicket.Localizer;
import org.apache.wicket.behavior.AbstractBehavior;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;
import org.dcm4chee.web.common.markup.BaseForm;

/**
 * @author Franz Willer <franz.willer@gmail.com>
 * @version $Revision$ $Date$
 * @since Oct 31, 2009
 */
public class TooltipBehaviour extends AbstractBehavior {

    private static final long serialVersionUID = 1L;
    
    private static final String POSTFIX = ".tooltip";
    private String prefix, id;
    
    private transient Localizer localizer;

    private IModel<?> substitutionModel;
    private AbstractReadOnlyModel<Boolean> showTooltipModel;
    
    private boolean generateComponentTreePrefix;
    /*
     * Create a TooltipBehaviour with given prefix.
     * <p>
     * Format of resource key: <prefix><component id>.tooltip
     */
    public TooltipBehaviour(String prefix) {
        this.prefix = prefix;
    }

    /*
     * Create a TooltipBehaviour with given prefix and a fixed id.
     * <p>
     * Format of resource key: <prefix><id>.tooltip
     */
    public TooltipBehaviour(String prefix, String id) {
        this.prefix = prefix;
        this.id = id;
    }

    public TooltipBehaviour(String prefix, String id, IModel<?> substitutionModel) {
        this(prefix, id);
        this.substitutionModel = substitutionModel;
    }

    public TooltipBehaviour(String prefix, String id, AbstractReadOnlyModel<Boolean> showTooltipModel) {
        this(prefix, id);
        this.showTooltipModel = showTooltipModel;
    }

    public TooltipBehaviour setGenerateComponentTreePrefix() {
        this.generateComponentTreePrefix = true;
        return this;
    }

    public void onComponentTag(Component c, ComponentTag tag) {
        String currentTitle = tag.getAttribute("title");
        tag.put("title", currentTitle != null ? (currentTitle + " ") : "" + 
            getLocalizer().getStringIgnoreSettings(getResourceKey(c), c, substitutionModel, ""));
    }

    String getResourceKey(Component c) {
        if (generateComponentTreePrefix)
            prefix = generateComponentTreePrefix(c);
        StringBuilder sb = new StringBuilder();
        if ( prefix != null ) 
            sb.append(prefix);
        sb.append(id == null ? c.getId() : id);
        sb.append(this.showTooltipModel == null ? "" 
                : "."
                    + (this.showTooltipModel.getObject() ?  "hide" : "show")
        );
        sb.append(POSTFIX);
        return sb.toString();
    }

    private String generateComponentTreePrefix(Component c) {
        generateComponentTreePrefix = false;
        StringBuilder sb = new StringBuilder("");
        Component parent = c.getParent();
        while ((parent != null) && !parent.equals("") && !(parent instanceof BaseForm)) {
            sb.insert(0, ".");
            sb.insert(0, parent.getId());
            parent = parent.getParent();
        }
        if ((prefix != null) && (!prefix.equals(""))) 
            sb.insert(0, prefix);
        return sb.toString();
    }

    public Localizer getLocalizer() {
        if ( localizer == null )
            localizer = Application.get().getResourceSettings().getLocalizer();
        return localizer;
    }

    public String getPrefix() {
        return prefix;
    }
    
    public TooltipBehaviour newWithSubstitution(IModel<?> model) {
        return new TooltipBehaviour(prefix, id, model);
    }
    
    public String getTooltip(Component c) {
        return getLocalizer().getStringIgnoreSettings(getResourceKey(c), c, substitutionModel, "");
    }
}
