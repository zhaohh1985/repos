/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para UPSRelatedPS.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface UPSRelatedPSLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Auto-generated Primary Key
    */
   public java.lang.Long getPk(  ) ;

   public java.lang.String getRefSOPInstanceUID(  ) ;

   public java.lang.String getRefSOPClassUID(  ) ;

   public org.dcm4chex.archive.ejb.interfaces.UPSLocal getUPS(  ) ;

}
