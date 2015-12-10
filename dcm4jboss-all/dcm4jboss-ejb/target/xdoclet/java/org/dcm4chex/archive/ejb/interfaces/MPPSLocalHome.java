/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para MPPS.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface MPPSLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/MPPSLocal";
   public static final String JNDI_NAME="ejb/MPPS";

   public org.dcm4chex.archive.ejb.interfaces.MPPSLocal create(org.dcm4che.data.Dataset ds , org.dcm4chex.archive.ejb.interfaces.PatientLocal patient)
      throws javax.ejb.CreateException;

   public java.util.Collection findAll()
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.MPPSLocal findBySopIuid(java.lang.String uid)
      throws javax.ejb.FinderException;

   public java.util.Collection findByStudyIuid(java.lang.String suid)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.MPPSLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

   public java.util.Collection mppsIuidsByStudyIuid(java.lang.String suid) 
      throws javax.ejb.FinderException;

   public java.util.Collection mppsByStudyIuid(java.lang.String suid) 
      throws javax.ejb.FinderException;

}
