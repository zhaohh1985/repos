/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para GPSPSPerformer.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface GPSPSPerformerLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/GPSPSPerformerLocal";
   public static final String JNDI_NAME="ejb/GPSPSPerformer";

   public org.dcm4chex.archive.ejb.interfaces.GPSPSPerformerLocal create(org.dcm4che.data.Dataset ds , org.dcm4chex.archive.ejb.interfaces.GPSPSLocal gpsps)
      throws javax.ejb.CreateException;

   public java.util.Collection findAll()
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.GPSPSPerformerLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

}