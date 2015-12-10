/*
 * Gerado pelo XDoclet - Não edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para GPSPSRequest.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface GPSPSRequestLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Auto-generated Primary Key
    */
   public java.lang.Long getPk(  ) ;

   public java.lang.String getRequestedProcedureId(  ) ;

   public java.lang.String getAccessionNumber(  ) ;

   public org.dcm4chex.archive.ejb.interfaces.GPSPSLocal getGpsps(  ) ;

}
