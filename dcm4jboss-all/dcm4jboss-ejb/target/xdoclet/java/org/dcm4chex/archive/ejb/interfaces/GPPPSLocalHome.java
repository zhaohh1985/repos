/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para GPPPS.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface GPPPSLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/GPPPSLocal";
   public static final String JNDI_NAME="ejb/GPPPS";

   public org.dcm4chex.archive.ejb.interfaces.GPPPSLocal create(org.dcm4che.data.Dataset ds , org.dcm4chex.archive.ejb.interfaces.PatientLocal patient)
      throws javax.ejb.CreateException;

   public java.util.Collection findAll()
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.GPPPSLocal findBySopIuid(java.lang.String uid)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.GPPPSLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

}
