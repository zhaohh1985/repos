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
package org.dcm4chee.archive.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.dcm4che2.data.BasicDicomObject;
import org.dcm4che2.data.DicomObject;
import org.dcm4che2.data.Tag;
import org.dcm4che2.data.TransferSyntax;
import org.dcm4che2.data.VR;
import org.dcm4che2.io.DicomInputStream;
import org.dcm4che2.io.DicomOutputStream;
import org.dcm4chee.archive.exceptions.BlobCorruptedException;

/**
 * @author Damien Evans <damien.daddy@gmail.com>
 * @author Justin Falk <jfalkmu@gmail.com>
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Revision$ $Date$
 * @since Feb 26, 2008
 */

public class DicomObjectUtils {

    public static byte[] encode(DicomObject attrs, String tsuid) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            DicomOutputStream dos = new DicomOutputStream(baos);
            if (tsuid == null) {
                dos.writeDataset(attrs, TransferSyntax.ExplicitVRLittleEndian);
            } else {
                dos.setPreamble(null);
                attrs.putString(Tag.TransferSyntaxUID, VR.UI, tsuid);
                try {
                    dos.writeDicomFile(attrs);
                } finally {
                    attrs.remove(Tag.TransferSyntaxUID);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return baos.toByteArray();
    }

    public static DicomObject decode(byte[] b) {
        BasicDicomObject dest = new BasicDicomObject();
        decode(b, dest);
        return dest;
    }

    public static void decode(byte[] b, DicomObject dest) {
        try {
            new DicomInputStream(new ByteArrayInputStream(b))
                    .readDicomObject(dest, -1);
        } catch (IOException e) {
            throw new BlobCorruptedException(e);
        }
        dest.remove(Tag.TransferSyntaxUID);
    }

}
