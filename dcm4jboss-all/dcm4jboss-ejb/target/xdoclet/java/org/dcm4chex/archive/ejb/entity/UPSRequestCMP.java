/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.entity;

/**
 * Camada CMP para UPSRequest.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public abstract class UPSRequestCMP
   extends org.dcm4chex.archive.ejb.entity.UPSRequestBean
   implements javax.ejb.EntityBean
{

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

   public abstract java.lang.String getRequestedProcedureId() ;

   public abstract void setRequestedProcedureId( java.lang.String requestedProcedureId ) ;

   public abstract java.lang.String getAccessionNumber() ;

   public abstract void setAccessionNumber( java.lang.String accessionNumber ) ;

   public abstract java.lang.String getConfidentialityCode() ;

   public abstract void setConfidentialityCode( java.lang.String confidentialityCode ) ;

   public abstract java.lang.String getRequestingService() ;

   public abstract void setRequestingService( java.lang.String requestingService ) ;

}
