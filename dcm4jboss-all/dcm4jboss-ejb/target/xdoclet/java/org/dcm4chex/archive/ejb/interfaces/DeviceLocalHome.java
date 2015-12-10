/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para Device.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface DeviceLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/DeviceLocal";
   public static final String JNDI_NAME="ejb/Device";

   public org.dcm4chex.archive.ejb.interfaces.DeviceLocal create(java.lang.String stationName , java.lang.String aet , java.lang.String md)
      throws javax.ejb.CreateException;

   public java.util.Collection findAll()
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.DeviceLocal findByStationName(java.lang.String name)
      throws javax.ejb.FinderException;

   public java.util.Collection findByProtocolCode( org.dcm4chex.archive.ejb.interfaces.CodeLocal code)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.DeviceLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

}
