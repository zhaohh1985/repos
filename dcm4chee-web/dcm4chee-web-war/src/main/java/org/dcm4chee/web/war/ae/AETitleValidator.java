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

package org.dcm4chee.web.war.ae;

import java.util.Map;

import org.apache.wicket.validation.IValidatable;
import org.apache.wicket.validation.validator.StringValidator;

/**
 * @author Franz Willer <franz.willer@gmail.com>
 * @version $Revision: 15552 $ $Date: 2011-06-07 12:05:40 -0300 (ter, 07 jun 2011) $
 * @since June 16, 2009
 */
public class AETitleValidator extends StringValidator {

    private static final long serialVersionUID = 1L;

    private static final int MAX_AET_LEN = 16;
    private static final int MAX_HL7_LEN = 250;
    
    /**
     * Check AET constrains (1-16 chars, ISO 646/G0 exclude 5C(backslash)).
     * <p>
     * Note: When AET contains a '^' this AE entity is not a DICOM AET but a HL7 receiving application/facility!<br/>
     * In this case we check max length of 250 (DB field len).
     * </p><p>
     * We use resourceKey 'StringValidator.range' and 'PatternValidator' with corresponding variable maps 
     * to get international messages for free.
     * </p>
     */
    @Override
    protected void onValidate(IValidatable<String> v) {
        String s = v.getValue();
        if ( s.indexOf('^') == -1 ) {
            if ( s.length() > MAX_AET_LEN || s.trim().length() < 1) {
                error(v,"StringValidator.range", getLengthVarMap(v, MAX_AET_LEN));
            }
            if ( ! validateAEChars(s) ) {
                error(v,"PatternValidator", getPatternVarMap(v));
            }
        } else { //HL7 Target Application^Facility for HL7 Send (ST) max 250 chars (see DB AE.aet)
            if ( s.length() > MAX_HL7_LEN ) {
                error(v,"StringValidator.maximum", getLengthVarMap(v, MAX_HL7_LEN));
            }
        }
    }
    /*
     * AE valid characters: DICOM DEFAULT CHARACTER REPERTOIRE ENCODING without backslash(5C), LF, FF, CR and ESC
     * (i.e. ISO 646 G0 excluding '\')
     */
    private boolean validateAEChars(String s) {
        for ( char c : s.toCharArray() ) {
            if ( c < 0x20 || c > 0x7e || c == 0x5c ) {
                return false;
            }
        }
        return true;
    }

    private Map<String, Object> getLengthVarMap(IValidatable<String> validatable, int max) {
        final Map<String, Object> map = super.variablesMap(validatable);
        map.put("maximum", new Integer(max));
        map.put("minimum", new Integer(1));
        map.put("length", new Integer(((String) validatable.getValue()).length()));
        return map;
    }
    
    private Map<String, Object> getPatternVarMap(IValidatable<String> validatable) {
        final Map<String, Object> map = super.variablesMap(validatable);
        map.put("pattern", "DICOM DEFAULT CHARACTER REPERTOIRE exclude '\\', LF, FF, CR and ESC");
        return map;
    }
}
