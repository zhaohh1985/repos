/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.entity;

/**
 * Camada CMP para Instance.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public abstract class InstanceCMP
   extends org.dcm4chex.archive.ejb.entity.InstanceBean
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

   public abstract java.sql.Timestamp getCreatedTime() ;

   public abstract void setCreatedTime( java.sql.Timestamp createdTime ) ;

   public abstract java.sql.Timestamp getUpdatedTime() ;

   public abstract void setUpdatedTime( java.sql.Timestamp updatedTime ) ;

   public abstract java.lang.String getSopIuid() ;

   public abstract void setSopIuid( java.lang.String sopIuid ) ;

   public abstract java.lang.String getSopCuid() ;

   public abstract void setSopCuid( java.lang.String sopCuid ) ;

   public abstract java.lang.String getInstanceNumber() ;

   public abstract void setInstanceNumber( java.lang.String instanceNumber ) ;

   public abstract java.sql.Timestamp getContentDateTime() ;

   public abstract void setContentDateTime( java.sql.Timestamp contentDateTime ) ;

   public abstract java.lang.String getSrCompletionFlag() ;

   public abstract void setSrCompletionFlag( java.lang.String srCompletionFlag ) ;

   public abstract java.lang.String getSrVerificationFlag() ;

   public abstract void setSrVerificationFlag( java.lang.String srVerificationFlag ) ;

   public abstract java.lang.String getInstanceCustomAttribute1() ;

   public abstract void setInstanceCustomAttribute1( java.lang.String instanceCustomAttribute1 ) ;

   public abstract java.lang.String getInstanceCustomAttribute2() ;

   public abstract void setInstanceCustomAttribute2( java.lang.String instanceCustomAttribute2 ) ;

   public abstract java.lang.String getInstanceCustomAttribute3() ;

   public abstract void setInstanceCustomAttribute3( java.lang.String instanceCustomAttribute3 ) ;

   public abstract byte[] getEncodedAttributes() ;

   public abstract void setEncodedAttributes( byte[] encodedAttributes ) ;

   public abstract java.lang.String getExternalRetrieveAET() ;

   public abstract void setExternalRetrieveAET( java.lang.String externalRetrieveAET ) ;

   public abstract java.lang.String getRetrieveAETs() ;

   public abstract void setRetrieveAETs( java.lang.String retrieveAETs ) ;

   public abstract int getAvailability() ;

   public abstract void setAvailability( int availability ) ;

   public abstract int getInstanceStatus() ;

   public abstract void setInstanceStatus( int instanceStatus ) ;

   public abstract boolean getArchived() ;

   public abstract void setArchived( boolean archived ) ;

   public abstract boolean getAllAttributes() ;

   public abstract void setAllAttributes( boolean allAttributes ) ;

   public abstract boolean getCommitment() ;

   public abstract void setCommitment( boolean commitment ) ;

}
