/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para PrivateStudy.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface PrivateStudyLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/PrivateStudyLocal";
   public static final String JNDI_NAME="ejb/PrivateStudy";

   public org.dcm4chex.archive.ejb.interfaces.PrivateStudyLocal create(int type , org.dcm4che.data.Dataset ds , org.dcm4chex.archive.ejb.interfaces.PrivatePatientLocal patient)
      throws javax.ejb.CreateException;

   public java.util.Collection findByPrivateType(int privateType)
      throws javax.ejb.FinderException;

   public java.util.Collection findByStudyIuid(int privateType, java.lang.String uid)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.PrivateStudyLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

}
