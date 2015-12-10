/*
 * Gerado pelo XDoclet - Não edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para UPSSubscription.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface UPSSubscriptionLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Auto-generated Primary Key
    */
   public java.lang.Long getPk(  ) ;

   public java.lang.String getReceivingAETitle(  ) ;

   public boolean getDeletionLock(  ) ;

   public void setDeletionLock( boolean dellock ) ;

   public org.dcm4chex.archive.ejb.interfaces.UPSLocal getUPS(  ) ;

}
