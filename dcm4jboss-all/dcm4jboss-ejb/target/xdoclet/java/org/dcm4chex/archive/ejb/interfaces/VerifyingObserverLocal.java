/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para VerifyingObserver.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface VerifyingObserverLocal
   extends javax.ejb.EJBLocalObject
{

   public java.lang.Long getPk(  ) ;

   public java.sql.Timestamp getVerificationDateTime(  ) ;

   public java.lang.String getVerifyingObserverName(  ) ;

   public java.lang.String getVerifyingObserverFamilyNameSoundex(  ) ;

   public void setVerifyingObserverFamilyNameSoundex( java.lang.String name ) ;

   public java.lang.String getVerifyingObserverGivenNameSoundex(  ) ;

   public void setVerifyingObserverGivenNameSoundex( java.lang.String name ) ;

   public java.lang.String getVerifyingObserverIdeographicName(  ) ;

   public java.lang.String getVerifyingObserverPhoneticName(  ) ;

}
