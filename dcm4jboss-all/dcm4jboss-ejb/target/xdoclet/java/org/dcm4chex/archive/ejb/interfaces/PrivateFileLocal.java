/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para PrivateFile.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface PrivateFileLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Auto-generated Primary Key
    */
   public java.lang.Long getPk(  ) ;

   /**
    * File Path (relative path to Directory).
    */
   public java.lang.String getFilePath(  ) ;

   /**
    * Transfer Syntax UID
    */
   public java.lang.String getFileTsuid(  ) ;

   /**
    * MD5 checksum as hex string
    */
   public java.lang.String getFileMd5Field(  ) ;

   public int getFileStatus(  ) ;

   public void setFileStatus( int status ) ;

   /**
    * MD5 checksum in binary format
    */
   public byte[] getFileMd5(  ) ;

   public long getFileSize(  ) ;

   public org.dcm4chex.archive.ejb.interfaces.PrivateInstanceLocal getInstance(  ) ;

   public org.dcm4chex.archive.ejb.interfaces.FileSystemLocal getFileSystem(  ) ;

   public org.dcm4chex.archive.ejb.interfaces.FileDTO getFileDTO(  ) ;

}
