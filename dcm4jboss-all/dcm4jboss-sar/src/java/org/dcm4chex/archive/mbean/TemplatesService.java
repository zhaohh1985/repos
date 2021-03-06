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
 * Agfa-Gevaert Group.
 * Portions created by the Initial Developer are Copyright (C) 2003-2005
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 * See @authors listed below.
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

package org.dcm4chex.archive.mbean;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.xml.transform.Templates;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;

import org.dcm4chex.archive.util.FileUtils;
import org.jboss.system.ServiceMBeanSupport;

/**
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Revision: 14795 $ $Date: 2011-01-31 12:15:13 -0300 (seg, 31 jan 2011) $
 * @since May 2, 2007
 */
public class TemplatesService extends ServiceMBeanSupport {
    
    private static final class CacheEntry {
        final Templates templates;
        final long lastModified;
        CacheEntry(Templates templates, long lastModified) {
            this.templates = templates;
            this.lastModified = lastModified;
        }
    }
    
    private final Map cache = Collections.synchronizedMap(new HashMap());
    
    public Templates getTemplates(File f) {
        long lastModified = f.lastModified();
        if (lastModified == 0L) { // file does not exist
            return null;
        }
        CacheEntry entry = (CacheEntry) cache.get(f);
        if (entry != null && entry.lastModified == lastModified) {
            return entry.templates;
        }
        try {
            log.info("Compiling Stylesheet " + f);
            Templates templates = TransformerFactory.newInstance()
                    .newTemplates(new StreamSource(f));
            cache.put(f, new CacheEntry(templates, lastModified));
            return templates;
        } catch (Exception e) {
            log.error("Compiling Stylesheet " + f + " failed:", e);
            return null;
        }        
    }

    public Templates getTemplatesForAET(String dir, String aet, String fname) {
        return getTemplates(getFile(dir, aet, fname));
    }

    private File getFile(String dir, String aet, String fname) {
        if (aet != null) {
            File f =  FileUtils.resolve(new File(new File(dir, aet), fname));
            if (f.exists()) {
                return f;
            }
        }
        return FileUtils.resolve(new File(dir, fname));
    }

    public Templates findTemplates(String dir, String[] subdirs, String prefix, String[] fnames, String postfix) {
        return getTemplates(findFile(dir, subdirs, prefix, fnames, postfix));
    }

    private File findFile(String dir, String[] subdirs, String prefix, String[] fnames, String postfix) {
        String fn;
        File f = null;
        loop: for (int i = 0 ; i < fnames.length ; i++) {
            fn = getFilename(prefix, fnames[i], postfix);
            if (subdirs != null) {
                for (int j = 0 ; j < subdirs.length ; j++) {
                    f = FileUtils.resolve(new File(new File(dir, subdirs[j]), fn));
                    if (f.exists())
                        break loop;
                    if (log.isDebugEnabled()) log.debug("Style sheet file "+f+" does not exist!");
                }
            }
            f = FileUtils.resolve(new File(dir, fn));
            if (f.exists())
                break loop;
            if (log.isDebugEnabled()) log.debug("Style sheet file "+fn+" does not exist in any subfolder!");
        }
        if (f.exists())
            log.info("Style sheet found:"+f);
        return f;
    }
    
    private String getFilename(String prefix, String filename, String postfix) {
        StringBuilder sb = new StringBuilder(filename.length()+15);
        if (prefix != null)
            sb.append(prefix);
        sb.append(filename);
        if (postfix != null)
            sb.append(postfix);
        return sb.toString();
    }

    public void clearCache() {
        cache.clear();
    }
}
