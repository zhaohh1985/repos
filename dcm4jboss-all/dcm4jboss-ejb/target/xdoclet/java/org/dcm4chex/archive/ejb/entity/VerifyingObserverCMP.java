/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.entity;

/**
 * Camada CMP para VerifyingObserver.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public abstract class VerifyingObserverCMP
   extends org.dcm4chex.archive.ejb.entity.VerifyingObserverBean
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

   }

   public abstract java.lang.Long getPk() ;

   public abstract void setPk( java.lang.Long pk ) ;

   public abstract java.sql.Timestamp getVerificationDateTime() ;

   public abstract void setVerificationDateTime( java.sql.Timestamp verificationDateTime ) ;

   public abstract java.lang.String getVerifyingObserverName() ;

   public abstract void setVerifyingObserverName( java.lang.String verifyingObserverName ) ;

   public abstract java.lang.String getVerifyingObserverFamilyNameSoundex() ;

   public abstract void setVerifyingObserverFamilyNameSoundex( java.lang.String verifyingObserverFamilyNameSoundex ) ;

   public abstract java.lang.String getVerifyingObserverGivenNameSoundex() ;

   public abstract void setVerifyingObserverGivenNameSoundex( java.lang.String verifyingObserverGivenNameSoundex ) ;

   public abstract java.lang.String getVerifyingObserverIdeographicName() ;

   public abstract void setVerifyingObserverIdeographicName( java.lang.String verifyingObserverIdeographicName ) ;

   public abstract java.lang.String getVerifyingObserverPhoneticName() ;

   public abstract void setVerifyingObserverPhoneticName( java.lang.String verifyingObserverPhoneticName ) ;

}
