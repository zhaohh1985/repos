/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para StudyOnFileSystem.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface StudyOnFileSystemLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/StudyOnFileSystemLocal";
   public static final String JNDI_NAME="ejb/StudyOnFileSystem";

   public org.dcm4chex.archive.ejb.interfaces.StudyOnFileSystemLocal create(org.dcm4chex.archive.ejb.interfaces.StudyLocal study , org.dcm4chex.archive.ejb.interfaces.FileSystemLocal fs)
      throws javax.ejb.CreateException;

   public org.dcm4chex.archive.ejb.interfaces.StudyOnFileSystemLocal findByStudyAndFileSystem(java.lang.String suid, java.lang.String dirPath)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.StudyOnFileSystemLocal findByStudyAndFileSystem(org.dcm4chex.archive.ejb.interfaces.StudyLocal study, org.dcm4chex.archive.ejb.interfaces.FileSystemLocal filesystem)
      throws javax.ejb.FinderException;

   public java.util.Collection findByStudyIUIDAndFSGroup(java.lang.String siuid, java.lang.String groupId)
      throws javax.ejb.FinderException;

   public java.util.Collection findByFSGroupAndAccessedBetween(java.lang.String groupId, java.sql.Timestamp tsAfter, java.sql.Timestamp tsBefore, int limit )
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.StudyOnFileSystemLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

}
