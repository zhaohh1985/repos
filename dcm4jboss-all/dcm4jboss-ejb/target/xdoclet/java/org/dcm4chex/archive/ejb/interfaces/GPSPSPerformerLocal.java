/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para GPSPSPerformer.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface GPSPSPerformerLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Auto-generated Primary Key
    */
   public java.lang.Long getPk(  ) ;

   public java.lang.String getHumanPerformerName(  ) ;

   public java.lang.String getHumanPerformerFamilyNameSoundex(  ) ;

   public void setHumanPerformerFamilyNameSoundex( java.lang.String name ) ;

   public java.lang.String getHumanPerformerGivenNameSoundex(  ) ;

   public void setHumanPerformerGivenNameSoundex( java.lang.String name ) ;

   public java.lang.String getHumanPerformerIdeographicName(  ) ;

   public java.lang.String getHumanPerformerPhoneticName(  ) ;

   public org.dcm4chex.archive.ejb.interfaces.GPSPSLocal getGpsps(  ) ;

}
