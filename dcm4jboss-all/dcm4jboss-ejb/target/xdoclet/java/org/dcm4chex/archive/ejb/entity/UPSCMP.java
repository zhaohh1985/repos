/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.entity;

/**
 * Camada CMP para UPS.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public abstract class UPSCMP
   extends org.dcm4chex.archive.ejb.entity.UPSBean
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
      super.setEntityContext(ctx);
   }

   public void unsetEntityContext() 
   {
      super.unsetEntityContext();
   }

   public void ejbRemove() throws javax.ejb.RemoveException
   {
      super.ejbRemove();

   }

   public abstract java.lang.Long getPk() ;

   public abstract void setPk( java.lang.Long pk ) ;

   public abstract java.lang.String getSopInstanceUID() ;

   public abstract void setSopInstanceUID( java.lang.String sopInstanceUID ) ;

   public abstract java.lang.String getTransactionUID() ;

   public abstract void setTransactionUID( java.lang.String transactionUID ) ;

   public abstract java.lang.String getAdmissionID() ;

   public abstract void setAdmissionID( java.lang.String admissionID ) ;

   public abstract java.lang.String getIssuerOfAdmissionIDLocalNamespaceEntityID() ;

   public abstract void setIssuerOfAdmissionIDLocalNamespaceEntityID( java.lang.String issuerOfAdmissionIDLocalNamespaceEntityID ) ;

   public abstract java.lang.String getIssuerOfAdmissionIDUniversialEntityID() ;

   public abstract void setIssuerOfAdmissionIDUniversialEntityID( java.lang.String issuerOfAdmissionIDUniversialEntityID ) ;

   public abstract java.lang.String getProcedureStepLabel() ;

   public abstract void setProcedureStepLabel( java.lang.String procedureStepLabel ) ;

   public abstract java.lang.String getWorklistLabel() ;

   public abstract void setWorklistLabel( java.lang.String worklistLabel ) ;

   public abstract java.sql.Timestamp getScheduledStartDateTime() ;

   public abstract void setScheduledStartDateTime( java.sql.Timestamp scheduledStartDateTime ) ;

   public abstract java.sql.Timestamp getExpectedCompletionDateTime() ;

   public abstract void setExpectedCompletionDateTime( java.sql.Timestamp expectedCompletionDateTime ) ;

   public abstract int getStateAsInt() ;

   public abstract void setStateAsInt( int stateAsInt ) ;

   public abstract int getPriorityAsInt() ;

   public abstract void setPriorityAsInt( int priorityAsInt ) ;

   public abstract java.sql.Timestamp getCreatedTime() ;

   public abstract void setCreatedTime( java.sql.Timestamp createdTime ) ;

   public abstract java.sql.Timestamp getUpdatedTime() ;

   public abstract void setUpdatedTime( java.sql.Timestamp updatedTime ) ;

   public abstract byte[] getEncodedAttributes() ;

   public abstract void setEncodedAttributes( byte[] encodedAttributes ) ;

}