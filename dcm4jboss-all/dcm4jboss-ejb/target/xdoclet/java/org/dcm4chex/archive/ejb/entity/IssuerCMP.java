/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.entity;

/**
 * Camada CMP para Issuer.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public abstract class IssuerCMP
   extends org.dcm4chex.archive.ejb.entity.IssuerBean
   implements javax.ejb.EntityBean
{

   /**
    * ejbPostCreate gerado para o m�todo ejbCreate correspondente.
    *
    * @see #ejbCreate(java.lang.String id,java.lang.String uid,java.lang.String type)
    */
   public void ejbPostCreate(java.lang.String id,java.lang.String uid,java.lang.String type)
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

   public abstract java.lang.String getLocalNamespaceEntityID() ;

   public abstract void setLocalNamespaceEntityID( java.lang.String localNamespaceEntityID ) ;

   public abstract java.lang.String getUniversalEntityID() ;

   public abstract void setUniversalEntityID( java.lang.String universalEntityID ) ;

   public abstract java.lang.String getUniversalEntityIDType() ;

   public abstract void setUniversalEntityIDType( java.lang.String universalEntityIDType ) ;

}
