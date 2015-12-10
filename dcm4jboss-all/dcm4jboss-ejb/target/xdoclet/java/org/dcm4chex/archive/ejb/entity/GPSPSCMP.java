/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.entity;

/**
 * Camada CMP para GPSPS.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public abstract class GPSPSCMP
   extends org.dcm4chex.archive.ejb.entity.GPSPSBean
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

   public abstract java.lang.String getSopIuid() ;

   public abstract void setSopIuid( java.lang.String sopIuid ) ;

   public abstract java.lang.String getTransactionUid() ;

   public abstract void setTransactionUid( java.lang.String transactionUid ) ;

   public abstract java.sql.Timestamp getSpsStartDateTime() ;

   public abstract void setSpsStartDateTime( java.sql.Timestamp spsStartDateTime ) ;

   public abstract java.sql.Timestamp getExpectedCompletionDateTime() ;

   public abstract void setExpectedCompletionDateTime( java.sql.Timestamp expectedCompletionDateTime ) ;

   public abstract int getGpspsStatusAsInt() ;

   public abstract void setGpspsStatusAsInt( int gpspsStatusAsInt ) ;

   public abstract int getGpspsPriorityAsInt() ;

   public abstract void setGpspsPriorityAsInt( int gpspsPriorityAsInt ) ;

   public abstract int getInputAvailabilityFlagAsInt() ;

   public abstract void setInputAvailabilityFlagAsInt( int inputAvailabilityFlagAsInt ) ;

   public abstract byte[] getEncodedAttributes() ;

   public abstract void setEncodedAttributes( byte[] encodedAttributes ) ;

}