/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para GPSPSRequest.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface GPSPSRequestLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/GPSPSRequestLocal";
   public static final String JNDI_NAME="ejb/GPSPSRequest";

   public org.dcm4chex.archive.ejb.interfaces.GPSPSRequestLocal create(org.dcm4che.data.Dataset ds , org.dcm4chex.archive.ejb.interfaces.GPSPSLocal gpsps)
      throws javax.ejb.CreateException;

   public org.dcm4chex.archive.ejb.interfaces.GPSPSRequestLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

}
