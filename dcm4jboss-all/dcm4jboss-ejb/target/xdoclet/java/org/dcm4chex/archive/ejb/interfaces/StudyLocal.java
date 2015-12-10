/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para Study.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface StudyLocal
   extends javax.ejb.EJBLocalObject
{

   public java.lang.Long getPk(  ) ;

   public java.sql.Timestamp getCreatedTime(  ) ;

   public java.sql.Timestamp getUpdatedTime(  ) ;

   public java.lang.String getStudyIuid(  ) ;

   public java.lang.String getStudyId(  ) ;

   public java.sql.Timestamp getStudyDateTime(  ) ;

   /**
    * Accession Number
    */
   public java.lang.String getAccessionNumber(  ) ;

   public java.lang.String getReferringPhysicianName(  ) ;

   public java.lang.String getReferringPhysicianFamilyNameSoundex(  ) ;

   public void setReferringPhysicianFamilyNameSoundex( java.lang.String name ) ;

   public java.lang.String getReferringPhysicianGivenNameSoundex(  ) ;

   public void setReferringPhysicianGivenNameSoundex( java.lang.String name ) ;

   public java.lang.String getReferringPhysicianIdeographicName(  ) ;

   public java.lang.String getReferringPhysicianPhoneticName(  ) ;

   /**
    * Study Description
    */
   public java.lang.String getStudyDescription(  ) ;

   public java.lang.String getStudyCustomAttribute1(  ) ;

   /**
    * Study Status
    */
   public int getStudyStatus(  ) ;

   public void setStudyStatus( int status ) ;

   /**
    * Study Status ID
    */
   public java.lang.String getStudyStatusId(  ) ;

   public void setStudyStatusId( java.lang.String statusId ) ;

   /**
    * Number Of Study Related Series
    */
   public int getNumberOfStudyRelatedSeries(  ) ;

   /**
    * Number Of Study Related Instances
    */
   public int getNumberOfStudyRelatedInstances(  ) ;

   public java.lang.String getFilesetIuid(  ) ;

   public java.lang.String getFilesetId(  ) ;

   public java.lang.String getExternalRetrieveAET(  ) ;

   public void setExternalRetrieveAET( java.lang.String aet ) ;

   /**
    * Retrieve AETs
    */
   public java.lang.String getRetrieveAETs(  ) ;

   public int getAvailabilitySafe(  ) ;

   /**
    * Modalities In Study
    */
   public java.lang.String getModalitiesInStudy(  ) ;

   /**
    * SOP Classes In Study
    */
   public java.lang.String getSopClassesInStudy(  ) ;

   public java.sql.Timestamp getTimeOfLastConsistencyCheck(  ) ;

   public void setTimeOfLastConsistencyCheck( java.sql.Timestamp time ) ;

   public void setPatient( org.dcm4chex.archive.ejb.interfaces.PatientLocal patient ) ;

   public org.dcm4chex.archive.ejb.interfaces.PatientLocal getPatient(  ) ;

   public void setSeries( java.util.Collection series ) ;

   public java.util.Collection getSeries(  ) ;

   public int getNumberOfCommitedInstances(  ) throws javax.ejb.FinderException;

   public int getNumberOfReceivingSeries(  ) throws javax.ejb.FinderException;

   public boolean updateRetrieveAETs(  ) ;

   public boolean updateExternalRetrieveAET(  ) ;

   public boolean updateAvailability(  ) ;

   public boolean updateNumberOfStudyRelatedSeries(  ) ;

   public boolean updateNumberOfStudyRelatedInstances(  ) ;

   public void updateDerivedFields(  ) ;

   public boolean updateFilesetId(  ) ;

   public boolean updateModalitiesInStudy(  ) ;

   public boolean updateSOPClassesInStudy(  ) ;

   public void updateRetrieveAETs( java.lang.String oldAET,java.lang.String newAET ) ;

   public boolean isStudyAvailableOnMedia(  ) throws javax.ejb.FinderException;

   public boolean isStudyAvailableOnROFs( int validFileStatus ) throws javax.ejb.FinderException;

   public boolean isStudyAvailable( int availability ) throws javax.ejb.FinderException;

   public org.dcm4che.data.Dataset getAttributes( boolean supplement ) ;

   public void setAttributes( org.dcm4che.data.Dataset ds ) ;

   public boolean updateAttributes( org.dcm4che.data.Dataset newAttrs,org.dcm4che.data.Dataset modifiedAttrs ) ;

   public void coerceAttributes( org.dcm4che.data.Dataset ds,org.dcm4che.data.Dataset coercedElements ) throws org.dcm4che.net.DcmServiceException;

   public java.lang.String asString(  ) ;

   public java.util.Collection getFiles( java.lang.Long fsPk ) throws javax.ejb.FinderException;

   public int getNumberOfFiles( java.lang.Long fsPk ) throws javax.ejb.FinderException;

   public java.util.Collection getSeries( java.lang.Long fsPk ) throws javax.ejb.FinderException;

   public java.util.Collection getAllFiles(  ) throws javax.ejb.FinderException;

   public java.util.Collection getSeriesPks(  ) throws javax.ejb.FinderException;

   public java.util.Collection getInstancesNotOnMedia(  ) throws javax.ejb.FinderException;

}
