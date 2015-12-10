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

package org.dcm4chee.web.war.folder.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.dcm4che2.data.DicomObject;
import org.dcm4che2.data.Tag;
import org.dcm4chee.archive.entity.File;
import org.dcm4chee.archive.entity.Instance;
import org.dcm4chee.archive.util.JNDIUtils;
import org.dcm4chee.web.dao.folder.StudyListLocal;
import org.dcm4chee.web.war.common.model.AbstractDicomModel;
import org.dcm4chee.web.war.common.model.AbstractEditableDicomModel;

/**
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Revision: 15552 $ $Date: 2011-06-07 12:05:40 -0300 (ter, 07 jun 2011) $
 * @since Dec 12, 2008
 */
public class InstanceModel extends AbstractEditableDicomModel implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private List<FileModel> files = new ArrayList<FileModel>();

    public InstanceModel(Instance inst, SeriesModel seriesModel, Date createdTime) {
        setPk(inst.getPk());
        this.dataset = inst.getAttributes(true);
        this.createdTime = createdTime;
        setSeries(seriesModel);
    }

    private void setSeries(SeriesModel m) {
        setParent(m);
    }
    
    public SeriesModel getSeries() {
        return (SeriesModel) getParent();
    }

    public String getSOPInstanceUID() {
        return dataset.getString(Tag.SOPInstanceUID, "");
    }
    
    private static String toDescription(DicomObject dataset) {
        String pmi = dataset.getString(Tag.PhotometricInterpretation);
        if (pmi != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(pmi);
            sb.append(", ");
            sb.append(dataset.getString(Tag.BitsAllocated));
            sb.append(" bits, ");
            sb.append(dataset.getInt(Tag.Columns));
            sb.append("x");
            sb.append(dataset.getInt(Tag.Rows));
            sb.append("x");
            sb.append(dataset.getInt(Tag.NumberOfFrames, 1));
            return sb.toString();
        }
        String s;
        if ((s = dataset.getString(Tag.ContentDescription)) != null) {
            return s;
        }
        if ((s = dataset.getString(Tag.DocumentTitle)) != null) {
            return s;
        }
        return dataset.getString(
                new int[] { Tag.ConceptNameCodeSequence, 0, Tag.CodeMeaning });
    }

    public Date getDatetime() {
        return isPresentationState(getSopClassUID())
                ? toDate(Tag.PresentationCreationDate, Tag.PresentationCreationTime)
                : toDate(Tag.ContentDate, Tag.ContentTime);
    }

    private boolean isPresentationState(String cuid) {
        return cuid.startsWith("1.2.840.10008.5.1.4.1.1.11.");
    }

    public String getInstanceNumber() {
        return dataset.getString(Tag.InstanceNumber, "");
    }

    public String getSopClassUID() {
        return dataset.getString(Tag.SOPClassUID);
    }

    public String getDescription() {
        return toDescription(dataset);
    }

    public String getAvailability() {
        return dataset.getString(Tag.InstanceAvailability);
    }

    public List<FileModel> getFiles() {
        return files;
    }

    @Override
    public int getRowspan() {
        int rowspan = isDetails() ? 2 : 1;
        for (FileModel file : files) {
            rowspan += file.getRowspan();
        }
        return rowspan;
    }

    @Override
    public void collapse() {
        files.clear();
    }

    @Override
    public boolean isCollapsed() {
        return files.isEmpty();
    }

    public void retainSelectedFiles() {
        for (int i = 0; i < files.size(); i++) {
            FileModel file = files.get(i);
            if (!file.isSelected()) {
                files.remove(i);
                i--;
            }
        }
    }

    @Override
    public void expand() {
        files.clear();
        StudyListLocal dao = (StudyListLocal)
                JNDIUtils.lookup(StudyListLocal.JNDI_NAME);
        for (File file : dao.findFilesOfInstance(getPk())) 
            this.files.add(new FileModel(file));
    }

    @Override
    public int levelOfModel() {
        return INSTANCE_LEVEL;
    }

    @Override
    public List<? extends AbstractDicomModel> getDicomModelsOfNextLevel() {
        return null; //instance is the last DICOM level.
    }

    @Override
    public void update(DicomObject dicomObject) {
        StudyListLocal dao = (StudyListLocal)
                JNDIUtils.lookup(StudyListLocal.JNDI_NAME);
        dataset = dao.updateInstance(getPk(), dicomObject).getAttributes(true);
    }
    
    @Override
    public AbstractEditableDicomModel refresh() {
        StudyListLocal dao = (StudyListLocal)
            JNDIUtils.lookup(StudyListLocal.JNDI_NAME);
        dataset = dao.getInstance(getPk()).getAttributes(true);
        return this;
    }

    @Override
    public String toString() {
        return "Instance: "+getSOPInstanceUID();
    }
}
