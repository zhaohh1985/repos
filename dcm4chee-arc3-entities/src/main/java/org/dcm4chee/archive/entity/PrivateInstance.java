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
 * Accurate Software Design, LLC.
 * Portions created by the Initial Developer are Copyright (C) 2006-2008
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
package org.dcm4chee.archive.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.dcm4che2.data.DicomObject;
import org.dcm4che2.data.Tag;
import org.dcm4che2.data.UID;
import org.dcm4chee.archive.util.DicomObjectUtils;

/**
 * @author Damien Evans <damien.daddy@gmail.com>
 * @author Justin Falk <jfalkmu@gmail.com>
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Revision$ $Date$
 * @since Mar 3, 2008
 */
@Entity
@Table(name = "priv_instance")
public class PrivateInstance extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -7577387511052455446L;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "priv_type", nullable = false)
    private int privateType;

    @Column(name = "sop_iuid", nullable = false)
    private String sopInstanceUID;

    // JPA definition in orm.xml
    private byte[] encodedAttributes;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "series_fk")
    private PrivateSeries series;
    
    @OneToMany(mappedBy = "instance", fetch=FetchType.LAZY)
    private Set<PrivateFile> files;

    public Date getCreatedTime() {
        return createdTime;
    }

    public int getPrivateType() {
        return privateType;
    }

    public void setPrivateType(int privateType) {
        this.privateType = privateType;
    }

    public String getSopInstanceUID() {
        return sopInstanceUID;
    }

    public byte[] getEncodedAttributes() {
        return encodedAttributes;
    }

    public PrivateSeries getSeries() {
        return series;
    }

    public void setSeries(PrivateSeries series) {
        this.series = series;
    }

    public Set<PrivateFile> getFiles() {
        return files;
    }

    @Override
    public String toString() {
        return "PrivateInstance[pk=" + pk
                + ", uid=" + sopInstanceUID
                + "]";
    }

    @PrePersist
    public void onPrePersist() {
        createdTime = new Date();
    }

    public DicomObject getAttributes() {
        return DicomObjectUtils.decode(encodedAttributes);
    }

    public void setAttributes(DicomObject attrs) {
        this.sopInstanceUID = attrs.getString(Tag.SOPInstanceUID);
        this.encodedAttributes = DicomObjectUtils.encode(attrs,
                UID.DeflatedExplicitVRLittleEndian);
    }
}
