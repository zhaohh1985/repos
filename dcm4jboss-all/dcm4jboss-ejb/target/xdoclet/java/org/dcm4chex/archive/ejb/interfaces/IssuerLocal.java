/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para Issuer.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface IssuerLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Auto-generated Primary Key
    */
   public java.lang.Long getPk(  ) ;

   /**
    * Local Namespace Entity ID
    */
   public java.lang.String getLocalNamespaceEntityID(  ) ;

   public void setLocalNamespaceEntityID( java.lang.String id ) ;

   /**
    * Universal Entity ID
    */
   public java.lang.String getUniversalEntityID(  ) ;

   public void setUniversalEntityID( java.lang.String uid ) ;

   /**
    * Universal Entity ID Type
    */
   public java.lang.String getUniversalEntityIDType(  ) ;

   public void setUniversalEntityIDType( java.lang.String type ) ;

   public java.lang.String asString(  ) ;

}
