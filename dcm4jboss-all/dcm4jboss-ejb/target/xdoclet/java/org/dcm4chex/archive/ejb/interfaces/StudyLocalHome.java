/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para Study.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface StudyLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/StudyLocal";
   public static final String JNDI_NAME="ejb/Study";

   public org.dcm4chex.archive.ejb.interfaces.StudyLocal create(org.dcm4che.data.Dataset ds , org.dcm4chex.archive.ejb.interfaces.PatientLocal patient)
      throws javax.ejb.CreateException;

   public java.util.Collection findAll()
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.StudyLocal findByStudyIuid(java.lang.String uid)
      throws javax.ejb.FinderException;

   public java.util.Collection findStudiesOnMedia(org.dcm4chex.archive.ejb.interfaces.MediaLocal media)
      throws javax.ejb.FinderException;

   public java.util.Collection findStudiesNotOnMedia(java.sql.Timestamp minCreatedTime)
      throws javax.ejb.FinderException;

   public java.util.Collection findStudyToCheck(java.sql.Timestamp minCreatedTime, java.sql.Timestamp maxCreatedTime, java.sql.Timestamp checkedBefore, int limit)
      throws javax.ejb.FinderException;

   public java.util.Collection findStudiesWithStatus(int status, java.sql.Timestamp createdBefore, int limit)
      throws javax.ejb.FinderException;

   public java.util.Collection findStudiesFromAE(java.lang.String sourceAET, int limit)
      throws javax.ejb.FinderException;

   public java.util.Collection findStudiesWithStatusFromAE(int status, java.lang.String sourceAET, int limit)
      throws javax.ejb.FinderException;

   public java.util.Collection findStudiesWithFilesOnFileSystem(org.dcm4chex.archive.ejb.interfaces.FileSystemLocal fs, int offset, int limit)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.StudyLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

   public long selectStudySize(java.lang.Long studyPk , java.lang.Long fsPk) 
      throws javax.ejb.FinderException;

   public java.util.Collection selectWithMissingPpsIuidFromSrcAETReceivedLastOfStudyBefore(java.lang.String srcAET , java.sql.Timestamp receivedBefore) 
      throws javax.ejb.FinderException;

}