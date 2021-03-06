/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.entity;

/**
 * Camada CMP para Study.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public abstract class StudyCMP
   extends org.dcm4chex.archive.ejb.entity.StudyBean
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

   public abstract java.lang.String getStudyIuid() ;

   public abstract void setStudyIuid( java.lang.String studyIuid ) ;

   public abstract java.lang.String getStudyId() ;

   public abstract void setStudyId( java.lang.String studyId ) ;

   public abstract java.sql.Timestamp getStudyDateTime() ;

   public abstract void setStudyDateTime( java.sql.Timestamp studyDateTime ) ;

   public abstract java.lang.String getAccessionNumber() ;

   public abstract void setAccessionNumber( java.lang.String accessionNumber ) ;

   public abstract java.lang.String getReferringPhysicianName() ;

   public abstract void setReferringPhysicianName( java.lang.String referringPhysicianName ) ;

   public abstract java.lang.String getReferringPhysicianFamilyNameSoundex() ;

   public abstract void setReferringPhysicianFamilyNameSoundex( java.lang.String referringPhysicianFamilyNameSoundex ) ;

   public abstract java.lang.String getReferringPhysicianGivenNameSoundex() ;

   public abstract void setReferringPhysicianGivenNameSoundex( java.lang.String referringPhysicianGivenNameSoundex ) ;

   public abstract java.lang.String getReferringPhysicianIdeographicName() ;

   public abstract void setReferringPhysicianIdeographicName( java.lang.String referringPhysicianIdeographicName ) ;

   public abstract java.lang.String getReferringPhysicianPhoneticName() ;

   public abstract void setReferringPhysicianPhoneticName( java.lang.String referringPhysicianPhoneticName ) ;

   public abstract java.lang.String getStudyDescription() ;

   public abstract void setStudyDescription( java.lang.String studyDescription ) ;

   public abstract java.lang.String getStudyCustomAttribute1() ;

   public abstract void setStudyCustomAttribute1( java.lang.String studyCustomAttribute1 ) ;

   public abstract java.lang.String getStudyCustomAttribute2() ;

   public abstract void setStudyCustomAttribute2( java.lang.String studyCustomAttribute2 ) ;

   public abstract java.lang.String getStudyCustomAttribute3() ;

   public abstract void setStudyCustomAttribute3( java.lang.String studyCustomAttribute3 ) ;

   public abstract int getStudyStatus() ;

   public abstract void setStudyStatus( int studyStatus ) ;

   public abstract java.lang.String getStudyStatusId() ;

   public abstract void setStudyStatusId( java.lang.String studyStatusId ) ;

   public abstract int getNumberOfStudyRelatedSeries() ;

   public abstract void setNumberOfStudyRelatedSeries( int numberOfStudyRelatedSeries ) ;

   public abstract int getNumberOfStudyRelatedInstances() ;

   public abstract void setNumberOfStudyRelatedInstances( int numberOfStudyRelatedInstances ) ;

   public abstract byte[] getEncodedAttributes() ;

   public abstract void setEncodedAttributes( byte[] encodedAttributes ) ;

   public abstract java.lang.String getFilesetIuid() ;

   public abstract void setFilesetIuid( java.lang.String filesetIuid ) ;

   public abstract java.lang.String getFilesetId() ;

   public abstract void setFilesetId( java.lang.String filesetId ) ;

   public abstract java.lang.String getExternalRetrieveAET() ;

   public abstract void setExternalRetrieveAET( java.lang.String externalRetrieveAET ) ;

   public abstract java.lang.String getRetrieveAETs() ;

   public abstract void setRetrieveAETs( java.lang.String retrieveAETs ) ;

   public abstract int getAvailability() ;

   public abstract void setAvailability( int availability ) ;

   public abstract java.lang.String getModalitiesInStudy() ;

   public abstract void setModalitiesInStudy( java.lang.String modalitiesInStudy ) ;

   public abstract java.lang.String getSopClassesInStudy() ;

   public abstract void setSopClassesInStudy( java.lang.String sopClassesInStudy ) ;

   public abstract java.sql.Timestamp getTimeOfLastConsistencyCheck() ;

   public abstract void setTimeOfLastConsistencyCheck( java.sql.Timestamp timeOfLastConsistencyCheck ) ;

}
