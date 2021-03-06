/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para GPSPS.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface GPSPSLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/GPSPSLocal";
   public static final String JNDI_NAME="ejb/GPSPS";

   public org.dcm4chex.archive.ejb.interfaces.GPSPSLocal create(org.dcm4che.data.Dataset ds , org.dcm4chex.archive.ejb.interfaces.PatientLocal patient)
      throws javax.ejb.CreateException;

   public org.dcm4chex.archive.ejb.interfaces.GPSPSLocal findBySopIuid(java.lang.String uid)
      throws javax.ejb.FinderException;

   public java.util.Collection findByReqProcId(int status, java.lang.String codeValue, java.lang.String codingScheme, java.lang.String rpid)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.GPSPSLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

}
