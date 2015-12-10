/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para PrivateManager.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface PrivateManagerLocal
   extends javax.ejb.EJBLocalObject
{

   public void deletePrivateSeries( long series_pk ) throws javax.ejb.FinderException;

   public java.util.Collection deletePrivateStudy( long study_pk ) throws javax.ejb.FinderException;

   public void deletePrivatePatient( long patient_pk ) ;

   public void deletePrivateInstance( long instance_pk ) throws javax.ejb.FinderException;

   public void deletePrivateFile( long file_pk ) ;

   public void deletePrivateFiles( java.util.Collection fileDTOs ) ;

   public void deleteAll( int privateType ) ;

   /**
    * Delete a list of instances, i.e., move them to trash bin
    * @param iuids A list of instance uid
    * @param cascading True to delete the series/study if there's no instance/series
    * @return a collection of Dataset containing the actuall detetion information per study    */
   public java.util.Collection moveInstancesToTrash( java.lang.String[] iuids,boolean cascading ) ;

   public org.dcm4che.data.Dataset moveInstanceToTrash( long instance_pk ) ;

   public org.dcm4che.data.Dataset moveSeriesToTrash( long series_pk ) ;

   public java.util.Collection moveSeriesToTrash( java.lang.String[] uids ) ;

   public void moveSeriesOfPPSToTrash( java.lang.String ppsIUID,boolean removeEmptyParents ) ;

   public org.dcm4che.data.Dataset moveStudyToTrash( java.lang.String iuid ) throws javax.ejb.ObjectNotFoundException;

   public org.dcm4che.data.Dataset moveStudyToTrash( long study_pk ) throws javax.ejb.ObjectNotFoundException;

   public org.dcm4che.data.Dataset purgeStudy( java.lang.String suid ) ;

   public java.util.Collection movePatientToTrash( long pat_pk ) throws javax.ejb.ObjectNotFoundException;

   public java.util.Collection movePatientToTrash( org.dcm4che.data.Dataset patAttrs,org.dcm4chex.archive.common.PatientMatching matching ) throws javax.ejb.ObjectNotFoundException;

   public java.util.Collection moveFilesToTrash( java.util.Collection files ) throws javax.ejb.CreateException;

   public void moveFilesToTrash( org.dcm4chex.archive.ejb.interfaces.PrivateInstanceLocal privInstance,java.util.Collection files ) throws javax.ejb.CreateException;

   public java.util.Collection findByStudyIuid( java.lang.String studyIUID ) throws javax.ejb.FinderException;

   public java.util.Collection findByStudyIuid( int privateType,java.lang.String studyIUID ) throws javax.ejb.FinderException;

}
