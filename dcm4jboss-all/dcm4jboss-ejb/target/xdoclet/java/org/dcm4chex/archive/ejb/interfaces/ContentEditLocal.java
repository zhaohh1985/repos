/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para ContentEdit.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface ContentEditLocal
   extends javax.ejb.EJBLocalObject
{

   public org.dcm4che.data.Dataset createPatient( org.dcm4che.data.Dataset ds ) throws javax.ejb.CreateException;

   public java.util.Map mergePatients( long patPk,long[] mergedPks,boolean keepPrior ) throws javax.ejb.EJBException, javax.ejb.RemoveException;

   public org.dcm4che.data.Dataset createStudy( org.dcm4che.data.Dataset ds,long patPk ) throws javax.ejb.CreateException;

   public org.dcm4che.data.Dataset createSeries( org.dcm4che.data.Dataset ds,long studyPk ) throws javax.ejb.CreateException;

   public java.util.Collection updatePatient( org.dcm4che.data.Dataset ds ) ;

   public org.dcm4che.data.Dataset updateStudy( org.dcm4che.data.Dataset ds ) ;

   public org.dcm4che.data.Dataset updateSeries( org.dcm4che.data.Dataset ds ) ;

   public java.util.Collection moveStudies( long[] study_pks,long patient_pk ) throws javax.ejb.FinderException;

   public org.dcm4che.data.Dataset moveSeries( long[] series_pks,long study_pk ) throws javax.ejb.FinderException;

   public org.dcm4che.data.Dataset moveInstances( long[] instance_pks,long series_pk ) throws javax.ejb.FinderException;

   public org.dcm4che.data.Dataset[] getStudyMgtDatasetForStudies( long[] study_pks ) throws javax.ejb.FinderException;

   public org.dcm4che.data.Dataset getStudyMgtDatasetForStudy( long study_pk ) throws javax.ejb.FinderException;

   public org.dcm4che.data.Dataset getStudyMgtDatasetForSeries( long[] seriesPks ) throws javax.ejb.FinderException;

   public org.dcm4che.data.Dataset getStudyMgtDatasetForInstances( long[] instancePks ) throws javax.ejb.FinderException;

   public void commitPublishedStudy( long studyPk,java.lang.String docUID,java.lang.String docEntryUID,java.lang.String repUID ) throws javax.ejb.CreateException, javax.ejb.FinderException;

   public void removePublishedStudy( long publishedStudyPk ) throws javax.ejb.FinderException, javax.ejb.EJBException, javax.ejb.RemoveException;

   public void markPublishedStudyChanged( java.lang.String studyIUID ) throws javax.ejb.FinderException;

   public void markPublishedStudyDeleted( java.lang.String studyIUID ) throws javax.ejb.FinderException, javax.ejb.RemoveException;

   public void setXDSDocumentStatus( long publishedStudyPk,int status ) throws javax.ejb.FinderException;

}
