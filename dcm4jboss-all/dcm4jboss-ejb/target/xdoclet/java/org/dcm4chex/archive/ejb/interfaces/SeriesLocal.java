/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para Series.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface SeriesLocal
   extends javax.ejb.EJBLocalObject
{

   public java.lang.Long getPk(  ) ;

   public java.sql.Timestamp getCreatedTime(  ) ;

   public java.sql.Timestamp getUpdatedTime(  ) ;

   public void setUpdatedTime( java.sql.Timestamp time ) ;

   public java.lang.String getSeriesIuid(  ) ;

   public java.lang.String getSeriesNumber(  ) ;

   public java.lang.String getModality(  ) ;

   public java.lang.String getBodyPartExamined(  ) ;

   public java.lang.String getLaterality(  ) ;

   public java.lang.String getSeriesDescription(  ) ;

   public java.lang.String getInstitutionalDepartmentName(  ) ;

   public java.lang.String getInstitutionName(  ) ;

   public java.lang.String getStationName(  ) ;

   public java.lang.String getPerformingPhysicianName(  ) ;

   public java.lang.String getPerformingPhysicianFamilyNameSoundex(  ) ;

   public void setPerformingPhysicianFamilyNameSoundex( java.lang.String name ) ;

   public java.lang.String getPerformingPhysicianGivenNameSoundex(  ) ;

   public void setPerformingPhysicianGivenNameSoundex( java.lang.String name ) ;

   public java.sql.Timestamp getPpsStartDateTime(  ) ;

   public java.lang.String getPpsIuid(  ) ;

   public java.lang.String getSeriesCustomAttribute1(  ) ;

   public java.lang.String getSeriesCustomAttribute2(  ) ;

   public java.lang.String getSeriesCustomAttribute3(  ) ;

   public int getNumberOfSeriesRelatedInstances(  ) ;

   public java.lang.String getFilesetIuid(  ) ;

   public java.lang.String getFilesetId(  ) ;

   public java.lang.String getSourceAET(  ) ;

   public java.lang.String getExternalRetrieveAET(  ) ;

   public void setExternalRetrieveAET( java.lang.String aet ) ;

   public java.lang.String getRetrieveAETs(  ) ;

   public int getAvailabilitySafe(  ) ;

   public int getSeriesStatus(  ) ;

   public void setSeriesStatus( int status ) ;

   public org.dcm4chex.archive.ejb.interfaces.StudyLocal getStudy(  ) ;

   public void setStudy( org.dcm4chex.archive.ejb.interfaces.StudyLocal study ) ;

   public org.dcm4chex.archive.ejb.interfaces.MPPSLocal getMpps(  ) ;

   public java.util.Collection getRequestAttributes(  ) ;

   public java.util.Collection getInstances(  ) ;

   /**
    * Update series attributes and SeriesRequest. <p> Deletes SeriesRequest objects if RequestAttributesSeq in newAttrs is empty.
    * @param ds Dataset with series attributes.
    * @throws CreateException
    */
   public boolean updateAttributes( org.dcm4che.data.Dataset newAttrs,boolean overwriteReqAttrSQ,org.dcm4che.data.Dataset modifiedAttrs ) ;

   public boolean updateRetrieveAETs(  ) ;

   public boolean updateExternalRetrieveAET(  ) ;

   public boolean updateAvailability(  ) ;

   public boolean updateNumberOfSeriesRelatedInstances(  ) ;

   public void updateDerivedFields(  ) ;

   public java.sql.Timestamp getMaxUpdatedTimeOfSeriesRelatedInstances(  ) ;

   public boolean updateFilesetId(  ) ;

   public void updateRetrieveAETs( java.lang.String oldAET,java.lang.String newAET ) ;

   public void removeMPPS(  ) ;

   public void setAttributes( org.dcm4che.data.Dataset ds ) ;

   public void coerceAttributes( org.dcm4che.data.Dataset ds,org.dcm4che.data.Dataset coercedElements ) throws org.dcm4che.net.DcmServiceException;

   public org.dcm4che.data.Dataset getAttributes( boolean supplement ) ;

   public java.lang.String asString(  ) ;

   public java.util.Collection getFiles( java.lang.Long fsPk ) throws javax.ejb.FinderException;

   public int getNumberOfFiles( java.lang.Long fsPk ) throws javax.ejb.FinderException;

   public java.util.Collection getInstances( java.lang.Long fsPk ) throws javax.ejb.FinderException;

   public java.util.Collection getAllFiles(  ) throws javax.ejb.FinderException;

}
