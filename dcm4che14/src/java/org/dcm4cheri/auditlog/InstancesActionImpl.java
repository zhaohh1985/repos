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
 * TIANI Medgraph AG.
 * Portions created by the Initial Developer are Copyright (C) 2002-2005
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 * Gunter Zeilinger <gunter.zeilinger@tiani.com>
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

package org.dcm4cheri.auditlog;

import org.dcm4che.auditlog.InstancesAction;
import org.dcm4che.auditlog.Patient;
import org.dcm4che.auditlog.User;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * <description>
 *
 * @see <related>
 * @author  <a href="mailto:gunter@tiani.com">gunter zeilinger</a>
 * @version $Revision: 3922 $ $Date: 2005-10-05 13:26:16 -0300 (qua, 05 out 2005) $
 * @since August 27, 2002
 *
 * <p><b>Revisions:</b>
 *
 * <p><b>yyyymmdd author:</b>
 * <ul>
 * <li> explicit fix description (no line numbers but methods) go
 *            beyond the cvs commit message
 * </ul>
 */
class InstancesActionImpl implements InstancesAction {
    
    // Constants -----------------------------------------------------
    
    // Variables -----------------------------------------------------
    private String action;
    private String accessionNumber;
    private LinkedHashSet suids = new LinkedHashSet(3);
    private Patient patient;
    private User user;
    private LinkedHashSet cuids = new LinkedHashSet(7);
    private int numberOfInstances = 0;
    private String mppsUID;
    
    // Constructors --------------------------------------------------
    public InstancesActionImpl(String action, String suid, Patient patient) {
        this.action = action;
        addStudyInstanceUID(suid);
        this.patient = patient;
    }
    
    // Methods -------------------------------------------------------
    public final void setAccessionNumber(String accessionNumber) {
        this.accessionNumber = accessionNumber;
    }
    
    public final void addStudyInstanceUID(String suid) {
        suids.add(suid);
    }

    public final String[] listStudyInstanceUIDs() {
        return (String[]) suids.toArray(new String[suids.size()]);
    }
    
    public final void addSOPClassUID(String cuid) {
        cuids.add(cuid);
    }
    
    public final void clearSOPClassUIDs() {
        cuids.clear();
    }
    
    public final String[] listSOPClassUIDs() {
        return (String[]) cuids.toArray(new String[cuids.size()]);
    }
    
    public final void setUser(User user) {
        this.user = user;
    }
    
    public final void setNumberOfInstances(int numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
    }
    
    public final void incNumberOfInstances(int inc) {
        this.numberOfInstances += inc;
    }
    
    public final void setMPPSInstanceUID(String mppsUID) {
        this.mppsUID = mppsUID;
    }
    
    public final String getMPPSInstanceUID() {
        return mppsUID;
    }

    public void writeTo(StringBuffer sb) {
        sb.append("<ObjectAction>")
          .append(action)
          .append("</ObjectAction>");
        if (accessionNumber != null) {
            sb.append("<AccessionNumber><![CDATA[")
              .append(accessionNumber)
              .append("]]></AccessionNumber>");
        }
        for (Iterator it = suids.iterator(); it.hasNext();) {
            sb.append("<SUID>")
              .append(it.next())
              .append("</SUID>");
        }
        patient.writeTo(sb);
        if (user != null) {
            user.writeTo(sb);
        }
        for (Iterator it = cuids.iterator(); it.hasNext();) {
            sb.append("<CUID>")
              .append(it.next())
              .append("</CUID>");
        }
            
        if (numberOfInstances > 0) {
            sb.append("<NumberOfInstances>")
              .append(numberOfInstances)
              .append("</NumberOfInstances>");
        }
        if (mppsUID != null) {
            sb.append("<MPPSUID>")
              .append(mppsUID)
              .append("</MPPSUID>");
        }
    }
}
