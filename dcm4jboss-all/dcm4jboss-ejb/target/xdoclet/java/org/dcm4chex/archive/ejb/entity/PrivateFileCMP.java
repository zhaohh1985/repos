/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.entity;

/**
 * Camada CMP para PrivateFile.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public abstract class PrivateFileCMP
   extends org.dcm4chex.archive.ejb.entity.PrivateFileBean
   implements javax.ejb.EntityBean
{

   public void ejbLoad() 
   {
   }

   public void ejbStore() 
   {
   }

   public void ejbActivate() 
   {
   }

   public void ejbPassivate() 
   {

   }

   public void setEntityContext(javax.ejb.EntityContext ctx) 
   {
   }

   public void unsetEntityContext() 
   {
   }

   public void ejbRemove() throws javax.ejb.RemoveException
   {

   }

   public abstract java.lang.Long getPk() ;

   public abstract void setPk( java.lang.Long pk ) ;

   public abstract java.lang.String getFilePath() ;

   public abstract void setFilePath( java.lang.String filePath ) ;

   public abstract java.lang.String getFileTsuid() ;

   public abstract void setFileTsuid( java.lang.String fileTsuid ) ;

   public abstract java.lang.String getFileMd5Field() ;

   public abstract void setFileMd5Field( java.lang.String fileMd5Field ) ;

   public abstract int getFileStatus() ;

   public abstract void setFileStatus( int fileStatus ) ;

   public abstract long getFileSize() ;

   public abstract void setFileSize( long fileSize ) ;

}