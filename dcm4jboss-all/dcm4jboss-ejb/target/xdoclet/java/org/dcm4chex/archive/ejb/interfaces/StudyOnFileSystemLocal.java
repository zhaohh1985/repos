/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para StudyOnFileSystem.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface StudyOnFileSystemLocal
   extends javax.ejb.EJBLocalObject
{

   public java.lang.Long getPk(  ) ;

   public java.sql.Timestamp getAccessTime(  ) ;

   public org.dcm4chex.archive.ejb.interfaces.StudyLocal getStudy(  ) ;

   public org.dcm4chex.archive.ejb.interfaces.FileSystemLocal getFileSystem(  ) ;

   public boolean getMarkedForDeletion(  ) ;

   public void setMarkedForDeletion( boolean b ) ;

   public void touch(  ) ;

   public java.lang.String asString(  ) ;

   public boolean matchDeleteConstrains( boolean externalRetrieveable,boolean storageNotCommited,boolean copyOnMedia,java.lang.String copyOnFSGroup,boolean copyArchived,boolean copyOnReadOnlyFS ) throws javax.ejb.FinderException;

}
