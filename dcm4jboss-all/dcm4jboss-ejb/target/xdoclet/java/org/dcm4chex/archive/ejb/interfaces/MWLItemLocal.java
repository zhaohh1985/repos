/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para MWLItem.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface MWLItemLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Auto-generated Primary Key
    */
   public java.lang.Long getPk(  ) ;

   public java.lang.String getPerformingPhysicianName(  ) ;

   public java.lang.String getPerformingPhysicianFamilyNameSoundex(  ) ;

   public void setPerformingPhysicianFamilyNameSoundex( java.lang.String name ) ;

   public java.lang.String getPerformingPhysicianGivenNameSoundex(  ) ;

   public void setPerformingPhysicianGivenNameSoundex( java.lang.String name ) ;

   public org.dcm4chex.archive.ejb.interfaces.PatientLocal getPatient(  ) ;

   public org.dcm4che.data.Dataset getAttributes(  ) ;

   public void setAttributes( org.dcm4che.data.Dataset ds ) ;

   public int getSpsStatusAsInt(  ) ;

   public java.lang.String getSpsStatus(  ) ;

   public void updateSpsStatus( int status ) ;

   public java.lang.String asString(  ) ;

}
