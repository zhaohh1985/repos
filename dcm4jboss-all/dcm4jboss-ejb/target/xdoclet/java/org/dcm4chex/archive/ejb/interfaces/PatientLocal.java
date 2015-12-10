/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para Patient.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface PatientLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Auto-generated Primary Key
    */
   public java.lang.Long getPk(  ) ;

   public java.sql.Timestamp getCreatedTime(  ) ;

   public java.sql.Timestamp getUpdatedTime(  ) ;

   /**
    * Patient ID
    */
   public java.lang.String getPatientId(  ) ;

   /**
    * Patient ID Issuer
    */
   public java.lang.String getIssuerOfPatientId(  ) ;

   public void setIssuerOfPatientId( java.lang.String issuer ) ;

   public java.lang.String getPatientName(  ) ;

   public java.lang.String getPatientFamilyNameSoundex(  ) ;

   public void setPatientFamilyNameSoundex( java.lang.String name ) ;

   public java.lang.String getPatientGivenNameSoundex(  ) ;

   public void setPatientGivenNameSoundex( java.lang.String name ) ;

   public java.lang.String getPatientIdeographicName(  ) ;

   public void setPatientIdeographicName( java.lang.String name ) ;

   public java.lang.String getPatientPhoneticName(  ) ;

   /**
    * Patient Birth Date
    */
   public java.lang.String getPatientBirthDate(  ) ;

   public void setPatientBirthDate( java.lang.String dateString ) ;

   /**
    * Patient Sex
    */
   public java.lang.String getPatientSex(  ) ;

   public void setPatientSex( java.lang.String sex ) ;

   public java.util.Collection getOtherPatientIds(  ) ;

   public org.dcm4chex.archive.ejb.interfaces.PatientLocal getMergedWith(  ) ;

   public void setMergedWith( org.dcm4chex.archive.ejb.interfaces.PatientLocal mergedWith ) ;

   public java.util.Collection getMerged(  ) ;

   public void setStudies( java.util.Collection studies ) ;

   public java.util.Collection getStudies(  ) ;

   public void setMwlItems( java.util.Collection mwlItems ) ;

   public java.util.Collection getMwlItems(  ) ;

   public void setMpps( java.util.Collection mpps ) ;

   public java.util.Collection getMpps(  ) ;

   public void setGppps( java.util.Collection mpps ) ;

   public java.util.Collection getGppps(  ) ;

   public java.util.Collection getGsps(  ) ;

   public void setGsps( java.util.Collection gsps ) ;

   public java.util.Collection getUPS(  ) ;

   public void setUPS( java.util.Collection ups ) ;

   public org.dcm4che.data.Dataset getAttributes( boolean supplement ) ;

   public void setAttributes( org.dcm4che.data.Dataset ds ) ;

   public void coerceAttributes( org.dcm4che.data.Dataset ds,org.dcm4che.data.Dataset coercedElements ) throws org.dcm4che.net.DcmServiceException;

   public boolean updateAttributes( org.dcm4che.data.Dataset ds ) ;

   public boolean updateAttributes( org.dcm4che.data.Dataset attrs,org.dcm4che.data.Dataset modifiedAttrs ) ;

   public boolean updateOtherPatientIDs( org.dcm4che.data.Dataset ds ) ;

   public java.lang.String asString(  ) ;

}
