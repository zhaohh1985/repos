/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para StudyPermission.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface StudyPermissionLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/StudyPermissionLocal";
   public static final String JNDI_NAME="ejb/StudyPermission";

   public org.dcm4chex.archive.ejb.interfaces.StudyPermissionLocal create(java.lang.String suid , java.lang.String action , java.lang.String role)
      throws javax.ejb.CreateException;

   public org.dcm4chex.archive.ejb.interfaces.StudyPermissionLocal find(java.lang.String suid, java.lang.String action, java.lang.String role)
      throws javax.ejb.FinderException;

   public java.util.Collection findByStudyIuidAndAction(java.lang.String suid, java.lang.String action)
      throws javax.ejb.FinderException;

   public java.util.Collection findByStudyIuid(java.lang.String suid)
      throws javax.ejb.FinderException;

   public java.util.Collection findByPatientPk(java.lang.Long pk)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.StudyPermissionLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

   public java.util.Collection selectStudyIuidsByPatientPk(java.lang.Long pk) 
      throws javax.ejb.FinderException;

   public java.util.Collection selectStudyIuidsByPatientId(java.lang.String pid , java.lang.String issuer) 
      throws javax.ejb.FinderException;

}
