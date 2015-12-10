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
 * Java(TM), available at http://sourceforge.net/projects/dcm4che.
 *
 * The Initial Developer of the Original Code is
 * TIANI Medgraph AG.
 * Portions created by the Initial Developer are Copyright (C) 2003-2005
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 * Gunter Zeilinger <gunter.zeilinger@tiani.com>
 * Franz Willer <franz.willer@gwi-ag.com>
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

package org.dcm4chex.archive.web.maverick;

import org.dcm4chex.archive.ejb.interfaces.StudyPermissionDTO;
import org.dcm4chex.archive.web.maverick.model.PatientModel;
import org.dcm4chex.archive.web.maverick.model.SeriesModel;
import org.dcm4chex.archive.web.maverick.model.StudyModel;

/**
 * @author gunter.zeilinger@tiani.com
 * @version $Revision: 11261 $ $Date: 2009-05-08 05:15:19 -0300 (sex, 08 mai 2009) $
 * @since 7.10.2004
 *
 */
public class SeriesEditCtrl extends Dcm4cheeFormController {

    private long patPk;
    private long studyPk;
    private long seriesPk;

    private StudyModel study;

    public final long getPatPk() {
        return patPk;
    }

    public final void setPatPk(long pk) {
        this.patPk = pk;
    }

    public final long getStudyPk() {
        return studyPk;
    }

    public final void setStudyPk(long pk) {
        this.studyPk = pk;
    }

    public final long getSeriesPk() {
        return seriesPk;
    }

    public final void setSeriesPk(long seriesPk) {
        this.seriesPk = seriesPk;
    }

    public PatientModel getPatient() {
        return FolderForm.getFolderForm(getCtx()).getPatientByPk(
                patPk);
    }

    public StudyModel getStudy() {
        return getStudyModel();
    }

    public SeriesModel getSeries() {
        return seriesPk == -1 ? newSeries() :  FolderForm.getFolderForm(getCtx())
                .getSeriesByPk(patPk, studyPk, seriesPk);
    }

    public boolean isUpdateAllowed() {
        return (studyPk == -1 || isStudyPermissionCheckDisabled() ) ? true :
            FolderForm.getFolderForm(getCtx()).hasPermission(getStudyModel().getStudyIUID(), StudyPermissionDTO.UPDATE_ACTION);
    }

    protected String perform() throws Exception {
        return isUpdateAllowed() ? SUCCESS : "view";
    }

    private SeriesModel newSeries() {
        SeriesModel seriesModel = new SeriesModel();
        seriesModel.setSpecificCharacterSet("ISO_IR 100");
        return seriesModel;
    }

    private StudyModel getStudyModel() {
        if ( study == null)
            study = FolderForm.getFolderForm(getCtx()).getStudyByPk(patPk, studyPk);
        return study;
    }
}