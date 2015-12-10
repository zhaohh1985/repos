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

package org.dcm4chee.web.dao.trash;

import java.util.List;

import javax.ejb.Local;

import org.dcm4che2.data.DicomObject;
import org.dcm4chee.archive.entity.BaseEntity;
import org.dcm4chee.archive.entity.PrivateFile;
import org.dcm4chee.archive.entity.PrivateInstance;
import org.dcm4chee.archive.entity.PrivatePatient;
import org.dcm4chee.archive.entity.PrivateSeries;
import org.dcm4chee.archive.entity.PrivateStudy;
import org.dcm4chee.archive.entity.Study;

/**
 * @author Franz Willer <franz.willer@gmail.com>
 * @version $Revision$ $Date$
 * @since May 10, 2010
 */
@Local
public interface TrashListLocal {

    String JNDI_NAME = "dcm4chee-web-ear/TrashListBean/local";

    int count(TrashListFilter filter, List<String> roles);

    List<PrivatePatient> findPatients(TrashListFilter filter, int pagesize, int offset, List<String> roles);
    public int countStudiesOfPatient(long pk, List<String> roles);
    List<PrivateStudy> findStudiesOfPatient(long pk, List<String> roles);
    List<PrivateSeries> findSeriesOfStudy(long pk);
    List<PrivateInstance> findInstancesOfSeries(long pk);

    PrivatePatient getPatient(long pk);
    PrivateStudy getStudy(long pk);
    PrivateSeries getSeries(long pk);
    PrivateInstance getInstance(long pk);
    
    public void removeTrashEntities(List<Long> pks, Class<? extends BaseEntity> clazz, boolean removeFile);

    public void removeTrashAll();
    
    public List<PrivateFile> getFilesForEntity(long pk, Class<? extends BaseEntity> clazz);
    public List<Study> getStudiesInFolder(String[] suids);
    List<Study> getStudiesInFolder(long privPatPk);
    
    public DicomObject getDicomAttributes(long filePk);

    public Long getNumberOfSeriesOfStudy(long studyPk);
    public Long getNumberOfInstancesOfStudy(long studyPk);
    public Long getNumberOfInstancesOfSeries(long seriesPk);
}
