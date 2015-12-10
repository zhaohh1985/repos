/*
 * Gerado pelo XDoclet - Não edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para UPSRequest.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface UPSRequestLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Auto-generated Primary Key
    */
   public java.lang.Long getPk(  ) ;

   public java.lang.String getRequestedProcedureId(  ) ;

   public java.lang.String getAccessionNumber(  ) ;

   public java.lang.String getConfidentialityCode(  ) ;

   public java.lang.String getRequestingService(  ) ;

   public org.dcm4chex.archive.ejb.interfaces.UPSLocal getUPS(  ) ;

}
