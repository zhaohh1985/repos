/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.entity;

/**
 * Camada CMP para Patient.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public abstract class PatientCMP
   extends org.dcm4chex.archive.ejb.entity.PatientBean
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

   public abstract java.lang.String getPatientId() ;

   public abstract void setPatientId( java.lang.String patientId ) ;

   public abstract java.lang.String getIssuerOfPatientId() ;

   public abstract void setIssuerOfPatientId( java.lang.String issuerOfPatientId ) ;

   public abstract java.lang.String getPatientName() ;

   public abstract void setPatientName( java.lang.String patientName ) ;

   public abstract java.lang.String getPatientFamilyNameSoundex() ;

   public abstract void setPatientFamilyNameSoundex( java.lang.String patientFamilyNameSoundex ) ;

   public abstract java.lang.String getPatientGivenNameSoundex() ;

   public abstract void setPatientGivenNameSoundex( java.lang.String patientGivenNameSoundex ) ;

   public abstract java.lang.String getPatientIdeographicName() ;

   public abstract void setPatientIdeographicName( java.lang.String patientIdeographicName ) ;

   public abstract java.lang.String getPatientPhoneticName() ;

   public abstract void setPatientPhoneticName( java.lang.String patientPhoneticName ) ;

   public abstract java.lang.String getPatientBirthDate() ;

   public abstract void setPatientBirthDate( java.lang.String patientBirthDate ) ;

   public abstract java.lang.String getPatientSex() ;

   public abstract void setPatientSex( java.lang.String patientSex ) ;

   public abstract java.lang.String getPatientCustomAttribute1() ;

   public abstract void setPatientCustomAttribute1( java.lang.String patientCustomAttribute1 ) ;

   public abstract java.lang.String getPatientCustomAttribute2() ;

   public abstract void setPatientCustomAttribute2( java.lang.String patientCustomAttribute2 ) ;

   public abstract java.lang.String getPatientCustomAttribute3() ;

   public abstract void setPatientCustomAttribute3( java.lang.String patientCustomAttribute3 ) ;

   public abstract byte[] getEncodedAttributes() ;

   public abstract void setEncodedAttributes( byte[] encodedAttributes ) ;

}
