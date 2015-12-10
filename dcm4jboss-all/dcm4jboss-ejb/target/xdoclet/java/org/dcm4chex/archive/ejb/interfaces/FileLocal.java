/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para File.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface FileLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Auto-generated Primary Key
    */
   public java.lang.Long getPk(  ) ;

   public java.sql.Timestamp getCreatedTime(  ) ;

   public java.sql.Timestamp getTimeOfLastMd5Check(  ) ;

   public void setTimeOfLastMd5Check( java.sql.Timestamp time ) ;

   /**
    * File Path (relative path to Directory).
    */
   public java.lang.String getFilePath(  ) ;

   public void setFilePath( java.lang.String path ) ;

   /**
    * Transfer Syntax UID
    */
   public java.lang.String getFileTsuid(  ) ;

   public void setFileTsuid( java.lang.String tsuid ) ;

   /**
    * MD5 checksum as hex string
    */
   public java.lang.String getFileMd5Field(  ) ;

   /**
    * MD5 checksum of the original file (as it was received, before compression) as hex string
    */
   public java.lang.String getOrigMd5Field(  ) ;

   public int getFileStatus(  ) ;

   public void setFileStatus( int status ) ;

   /**
    * MD5 checksum in binary format
    */
   public byte[] getFileMd5(  ) ;

   public void setFileMd5( byte[] md5 ) ;

   /**
    * Original MD5 checksum in binary format
    */
   public byte[] getOrigMd5(  ) ;

   public void setOrigMd5( byte[] md5 ) ;

   /**
    * File Size
    */
   public long getFileSize(  ) ;

   public void setFileSize( long size ) ;

   public void setInstance( org.dcm4chex.archive.ejb.interfaces.InstanceLocal inst ) ;

   public org.dcm4chex.archive.ejb.interfaces.InstanceLocal getInstance(  ) ;

   public void setFileSystem( org.dcm4chex.archive.ejb.interfaces.FileSystemLocal fs ) ;

   public org.dcm4chex.archive.ejb.interfaces.FileSystemLocal getFileSystem(  ) ;

   public boolean isRedundant(  ) ;

   public org.dcm4chex.archive.ejb.interfaces.FileDTO getFileDTO(  ) ;

   public java.lang.String asString(  ) ;

}
