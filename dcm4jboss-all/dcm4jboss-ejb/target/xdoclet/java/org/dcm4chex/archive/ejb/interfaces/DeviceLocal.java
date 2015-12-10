/*
 * Gerado pelo XDoclet - Não edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para Device.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface DeviceLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Auto-generated Primary Key
    */
   public java.lang.Long getPk(  ) ;

   public java.lang.String getStationName(  ) ;

   public java.lang.String getStationAET(  ) ;

   public java.lang.String getModality(  ) ;

   public java.util.Collection getProtocolCodes(  ) ;

   public void setProtocolCodes( java.util.Collection codes ) ;

}
