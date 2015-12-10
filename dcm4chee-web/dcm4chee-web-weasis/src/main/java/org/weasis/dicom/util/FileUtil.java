/*******************************************************************************
 * Copyright (c) 2014 Weasis Team.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Roduit - initial API and implementation
 *******************************************************************************/
package org.weasis.dicom.util;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.ObjectOutput;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Deque;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import javax.imageio.stream.ImageInputStream;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class FileUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(FileUtil.class);

    public static final int FILE_BUFFER = 4096;
    private static final double BASE = 1024, KB = BASE, MB = KB * BASE, GB = MB * BASE;
    private static final DecimalFormat DEC_FORMAT = new DecimalFormat("#.##"); //$NON-NLS-1$
    private static final int[] ILLEGAL_CHARS = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
        20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 34, 42, 47, 58, 60, 62, 63, 92, 124 };

    private FileUtil() {
    }

    /**
     * Transform a string into a writable string for all the operating system. All the special and control characters
     * are excluded.
     * 
     * @param fileName
     *            a filename or directory name
     * @return a writable filename
     */
    public static String getValidFileName(String fileName) {
        StringBuilder cleanName = new StringBuilder();
        if (fileName != null) {
            for (int i = 0; i < fileName.length(); i++) {
                char c = fileName.charAt(i);
                if (!(Arrays.binarySearch(ILLEGAL_CHARS, c) >= 0 || (c < '\u0020') // ctrls
                || (c > '\u007e' && c < '\u00a0'))) { // ctrls
                    cleanName.append(c);
                }
            }
        }
        return cleanName.toString().trim();
    }

    public static String getValidFileNameWithoutHTML(String fileName) {
        String val = null;
        if (fileName != null) {
            // Force to remove html tags
            val = fileName.replaceAll("\\<.*?>", ""); //$NON-NLS-1$ //$NON-NLS-2$
        }
        return getValidFileName(val);
    }

    public static void safeClose(final Closeable object) {
        if (object != null) {
            try {
                object.close();
            } catch (IOException e) {
                LOGGER.debug(e.getMessage());
            }
        }
    }

    public static void safeClose(ImageInputStream stream) {
        if (stream != null) {
            try {
                stream.flush();
                stream.close();
            } catch (IOException e) {
                LOGGER.debug(e.getMessage());
            }
        }
    }

    public static void safeClose(ObjectOutput stream) {
        if (stream != null) {
            try {
                stream.flush();
                stream.close();
            } catch (IOException e) {
                LOGGER.debug(e.getMessage());
            }
        }
    }

    public static File createTempDir(File baseDir) {
        if (baseDir != null) {
            String baseName = String.valueOf(System.currentTimeMillis());
            for (int counter = 0; counter < 1000; counter++) {
                File tempDir = new File(baseDir, baseName + counter);
                if (tempDir.mkdir()) {
                    return tempDir;
                }
            }
        }
        throw new IllegalStateException("Failed to create directory"); //$NON-NLS-1$
    }

    public static final void deleteDirectoryContents(final File dir, int deleteDirLevel, int level) {
        if ((dir == null) || !dir.isDirectory()) {
            return;
        }
        final File[] files = dir.listFiles();
        if (files != null) {
            for (final File f : files) {
                if (f.isDirectory()) {
                    deleteDirectoryContents(f, deleteDirLevel, level + 1);
                } else {
                    try {
                        if (!f.delete()) {
                            LOGGER.warn("Cannot delete {}", f.getPath()); //$NON-NLS-1$
                        }
                    } catch (Exception e) {
                        LOGGER.error(e.getMessage());
                    }
                }
            }
        }
        if (level >= deleteDirLevel) {
            try {
                if (!dir.delete()) {
                    LOGGER.warn("Cannot delete {}", dir.getPath()); //$NON-NLS-1$
                }
            } catch (Exception e) {
                LOGGER.error(e.getMessage());
            }
        }
    }

    public static boolean delete(File fileOrDirectory) {
        if (fileOrDirectory == null || !fileOrDirectory.exists()) {
            return false;
        }

        if (fileOrDirectory.isDirectory()) {
            final File[] files = fileOrDirectory.listFiles();
            if (files != null) {
                for (File child : files) {
                    delete(child);
                }
            }
        }
        return fileOrDirectory.delete();
    }

    public static void recursiveDelete(File rootDir) {
        recursiveDelete(rootDir, true);
    }

    public static void recursiveDelete(File rootDir, boolean deleteRoot) {
        if ((rootDir == null) || !rootDir.isDirectory()) {
            return;
        }
        File[] childDirs = rootDir.listFiles();
        if (childDirs != null) {
            for (File f : childDirs) {
                if (f.isDirectory()) {
                    recursiveDelete(f, deleteRoot);
                    f.delete();
                } else {
                    try {
                        if (!f.delete()) {
                            LOGGER.info("Cannot delete {}", f.getPath()); //$NON-NLS-1$
                        }
                    } catch (Exception e) {
                        LOGGER.error(e.getMessage());
                    }
                }
            }
        }
        if (deleteRoot) {
            rootDir.delete();
        }
    }

    public static void safeClose(XMLStreamWriter writer) {
        if (writer != null) {
            try {
                writer.close();
            } catch (XMLStreamException e) {
                LOGGER.debug(e.getMessage());
            }
        }
    }

    public static void safeClose(XMLStreamReader xmler) {
        if (xmler != null) {
            try {
                xmler.close();
            } catch (XMLStreamException e) {
                LOGGER.debug(e.getMessage());
            }
        }
    }

    public static void prepareToWriteFile(File file) throws IOException {
        if (!file.exists()) {
            // Check the file that doesn't exist yet.
            // Create a new file. The file is writable if the creation succeeds.
            File outputDir = file.getParentFile();
            // necessary to check exists otherwise mkdirs() is false when dir exists
            if (outputDir != null && !outputDir.exists() && !outputDir.mkdirs()) {
                throw new IOException("Cannot write parent directory of " + file.getPath()); //$NON-NLS-1$
            }
        }
    }

    public static String nameWithoutExtension(String fn) {
        if (fn == null) {
            return null;
        }
        int i = fn.lastIndexOf('.');
        if (i > 0) {
            return fn.substring(0, i);
        }
        return fn;
    }

    public static String getExtension(String fn) {
        if (fn == null) {
            return ""; //$NON-NLS-1$
        }
        int i = fn.lastIndexOf('.');
        if (i > 0) {
            return fn.substring(i);
        }
        return ""; //$NON-NLS-1$
    }

    public static boolean isFileExtensionMatching(File file, String[] extensions) {
        if (file != null && extensions != null) {
            String fileExt = getExtension(file.getName());
            if (StringUtil.hasLength(fileExt)) {
                for (String ext : extensions) {
                    if (fileExt.endsWith(ext)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * @param inputStream
     * @param out
     * @return bytes transferred. O = error, -1 = all bytes has been transferred, other = bytes transferred before
     *         interruption
     */
    public static int writeFile(URL url, File outFilename) {
        InputStream input;
        try {
            input = url.openStream();
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
            return 0;
        }
        FileOutputStream outputStream;
        try {
            outputStream = new FileOutputStream(outFilename);
        } catch (FileNotFoundException e) {
            LOGGER.error(e.getMessage());
            return 0;
        }
        return writeStream(input, outputStream);
    }

    /**
     * @param inputStream
     * @param out
     * @return bytes transferred. O = error, -1 = all bytes has been transferred, other = bytes transferred before
     *         interruption
     */
    public static int writeStream(InputStream inputStream, OutputStream out) {
        if (inputStream == null || out == null) {
            return 0;
        }
        try {
            byte[] buf = new byte[FILE_BUFFER];
            int offset;
            while ((offset = inputStream.read(buf)) > 0) {
                out.write(buf, 0, offset);
            }
            out.flush();
            return -1;
        } catch (InterruptedIOException e) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.error("Error when writing file", e); //$NON-NLS-1$
            } else {
                LOGGER.error(e.getMessage());
            }
            return e.bytesTransferred;
        } catch (IOException e) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.error("Error when writing file", e); //$NON-NLS-1$
            } else {
                LOGGER.error(e.getMessage());
            }
            return 0;
        }

        finally {
            FileUtil.safeClose(inputStream);
            FileUtil.safeClose(out);
        }
    }

    public static boolean nioWriteFile(FileInputStream inputStream, FileOutputStream out) {
        if (inputStream == null || out == null) {
            return false;
        }
        try {
            FileChannel fci = inputStream.getChannel();
            FileChannel fco = out.getChannel();
            fco.transferFrom(fci, 0, fci.size());
            return true;
        } catch (Exception e) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.error("nio exception", e); //$NON-NLS-1$
            } else {
                LOGGER.error(e.getMessage());
            }
            return false;
        } finally {
            FileUtil.safeClose(inputStream);
            FileUtil.safeClose(out);
        }
    }

    public static boolean nioWriteFile(InputStream in, OutputStream out, final int bufferSize) {
        if (in == null || out == null) {
            return false;
        }
        try {
            ReadableByteChannel readChannel = Channels.newChannel(in);
            WritableByteChannel writeChannel = Channels.newChannel(out);
            ByteBuffer buffer = ByteBuffer.allocate(bufferSize);

            while (readChannel.read(buffer) != -1) {
                buffer.flip();
                writeChannel.write(buffer);
                buffer.clear();
            }
            return true;
        } catch (IOException e) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.error("nio exception", e); //$NON-NLS-1$
            } else {
                LOGGER.error(e.getMessage());
            }
            return false;
        } finally {
            FileUtil.safeClose(in);
            FileUtil.safeClose(out);
        }
    }

    public static boolean nioCopyFile(File source, File destination) {
        if (source == null || destination == null) {
            return false;
        }
        FileChannel in = null;
        FileChannel out = null;
        try {
            in = new FileInputStream(source).getChannel();
            out = new FileOutputStream(destination).getChannel();
            in.transferTo(0, in.size(), out);
            return true;
        } catch (IOException e) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.error("nio exception", e); //$NON-NLS-1$
            } else {
                LOGGER.error(e.getMessage());
            }
            return false;
        } finally {
            FileUtil.safeClose(in);
            FileUtil.safeClose(out);
        }

    }

    public static Properties readProperties(File propsFile, Properties props) {
        Properties p = props == null ? new Properties() : props;
        if (propsFile != null && propsFile.canRead()) {
            FileInputStream fileStream = null;
            try {
                fileStream = new FileInputStream(propsFile);
                p.load(fileStream);
            } catch (IOException e) {
                LOGGER.error("Error when reading properties: {}", propsFile); //$NON-NLS-1$
                LOGGER.error(e.getMessage());
            } finally {
                FileUtil.safeClose(fileStream);
            }
        }
        return p;
    }

    public static void storeProperties(File propsFile, Properties props, String comments) {
        if (props != null && propsFile != null) {
            FileOutputStream fout = null;
            try {
                fout = new FileOutputStream(propsFile);
                props.store(fout, comments);
            } catch (IOException e) {
                LOGGER.error("Error when writing properties: {}", propsFile); //$NON-NLS-1$
                LOGGER.error(e.getMessage());
            } finally {
                FileUtil.safeClose(fout);
            }
        }
    }

    public static boolean isZipFile(File file) {
        boolean isZip = false;
        if (file != null) {
            byte[] magicDirEnd = { 0x50, 0x4b, 0x03, 0x04 };
            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream(file);
                byte[] buffer = new byte[4];

                if ((inputStream.read(buffer)) == 4) {
                    for (int k = 0; k < magicDirEnd.length; k++) {
                        if (buffer[k] != magicDirEnd[k]) {
                            return false;
                        }
                    }
                    isZip = true;
                }
            } catch (IOException e) {
                LOGGER.error("Error when reading zip file: {}", file);
                LOGGER.error(e.getMessage());
            } finally {
                FileUtil.safeClose(inputStream);
            }
        }
        return isZip;
    }

    public static void zip(File directory, File zipfile) throws IOException {
        if (zipfile == null || directory == null) {
            return;
        }
        URI base = directory.toURI();
        Deque<File> queue = new LinkedList<File>();
        queue.push(directory);
        OutputStream out = null;
        ZipOutputStream zout = null;
        try {
            out = new FileOutputStream(zipfile);
            zout = new ZipOutputStream(out);
            while (!queue.isEmpty()) {
                directory = queue.pop();
                for (File entry : directory.listFiles()) {
                    String name = base.relativize(entry.toURI()).getPath();
                    if (entry.isDirectory()) {
                        queue.push(entry);
                        if (entry.list().length == 0) {
                            name = name.endsWith("/") ? name : name + "/"; //$NON-NLS-1$ //$NON-NLS-2$
                            zout.putNextEntry(new ZipEntry(name));
                        }
                    } else {
                        zout.putNextEntry(new ZipEntry(name));
                        copyZip(entry, zout);
                        zout.closeEntry();
                    }
                }
            }
        } finally {
            // Zip stream must be close before out stream.
            safeClose(zout);
            safeClose(out);
        }
    }

    public static void unzip(InputStream inputStream, File directory) throws IOException {
        if (inputStream == null || directory == null) {
            return;
        }
        ZipInputStream zis = new ZipInputStream(new BufferedInputStream(inputStream));
        try {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                File file = new File(directory, entry.getName());
                if (entry.isDirectory()) {
                    file.mkdirs();
                } else {
                    file.getParentFile().mkdirs();
                    copyZip(zis, file);
                }
            }
        } finally {
            safeClose(zis);
        }

    }

    public static void unzip(File zipfile, File directory) throws IOException {
        if (zipfile == null || directory == null) {
            return;
        }
        ZipFile zfile = new ZipFile(zipfile);
        Enumeration<? extends ZipEntry> entries = zfile.entries();
        while (entries.hasMoreElements()) {
            ZipEntry entry = entries.nextElement();
            File file = new File(directory, entry.getName());
            if (entry.isDirectory()) {
                file.mkdirs();
            } else {
                file.getParentFile().mkdirs();
                InputStream in = zfile.getInputStream(entry);
                try {
                    copyZip(in, file);
                } finally {
                    in.close();
                }
            }
        }
    }

    private static void copy(InputStream in, OutputStream out) throws IOException {
        if (in == null || out == null) {
            return;
        }
        byte[] buf = new byte[FILE_BUFFER];
        int offset;
        while ((offset = in.read(buf)) > 0) {
            out.write(buf, 0, offset);
        }
        out.flush();
    }

    private static void copyZip(File file, OutputStream out) throws IOException {
        InputStream in = new FileInputStream(file);
        try {
            copy(in, out);
        } finally {
            in.close();
        }
    }

    private static void copyZip(InputStream in, File file) throws IOException {
        OutputStream out = new FileOutputStream(file);
        try {
            copy(in, out);
        } finally {
            out.close();
        }
    }

    public static Integer getIntegerTagAttribute(XMLStreamReader xmler, String attribute, Integer defaultValue) {
        if (attribute != null) {
            try {
                String val = xmler.getAttributeValue(null, attribute);
                if (val != null) {
                    return Integer.valueOf(val);
                }
            } catch (NumberFormatException e) {
            }
        }
        return defaultValue;
    }

    public static File getTemporaryDirectory(String folder) {
        String tempDir = System.getProperty("java.io.tmpdir");
        File tdir;
        if (tempDir == null || tempDir.length() == 1) {
            String dir = System.getProperty("user.home", "");
            tdir = new File(dir);
        } else {
            tdir = new File(tempDir);
        }

        return new File(tdir, folder);
    }
}
