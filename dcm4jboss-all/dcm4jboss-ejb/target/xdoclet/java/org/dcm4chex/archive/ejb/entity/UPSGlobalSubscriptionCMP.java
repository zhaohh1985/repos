/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.entity;

/**
 * Camada CMP para UPSGlobalSubscription.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public abstract class UPSGlobalSubscriptionCMP
   extends org.dcm4chex.archive.ejb.entity.UPSGlobalSubscriptionBean
   implements javax.ejb.EntityBean
{

   /**
    * ejbPostCreate gerado para o m�todo ejbCreate correspondente.
    *
    * @see #ejbCreate(java.lang.String aet,boolean deletionLock)
    */
   public void ejbPostCreate(java.lang.String aet,boolean deletionLock)
   {
   }

   public void ejbLoad() 
   {
   }

   public void ejbStore() 
   {
   }

   public void ejbActivate() 
   {
   }

   public void ejbPassivate() 
   {

   }

   public void setEntityContext(javax.ejb.EntityContext ctx) 
   {
   }

   public void unsetEntityContext() 
   {
   }

   public void ejbRemove() throws javax.ejb.RemoveException
   {
      super.ejbRemove();

   }

   public abstract java.lang.Long getPk() ;

   public abstract void setPk( java.lang.Long pk ) ;

   public abstract java.lang.String getReceivingAETitle() ;

   public abstract void setReceivingAETitle( java.lang.String receivingAETitle ) ;

   public abstract boolean getDeletionLock() ;

   public abstract void setDeletionLock( boolean deletionLock ) ;

}
