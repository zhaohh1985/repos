/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Remota para ContentManager.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface ContentManager
   extends javax.ejb.EJBObject
{

   public org.dcm4che.data.Dataset getPatient( long pk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset getPatientByID( java.lang.String pid,java.lang.String issuer )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset getStudy( long studyPk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset getStudyByIUID( java.lang.String studyIUID )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   /**
    * get Dataset objects for 'prior' studies of patient, referenced by current study IUID.
    */
   public java.util.Set getPriorInfos( java.lang.String studyIUID,boolean instanceLevel,int minAvail,java.lang.Long createdAfter,java.lang.String[] retrAETs,java.lang.String[] modalities )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset getSeries( long seriesPk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset getSeriesByIUID( java.lang.String seriesIUID )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset getInstance( long instancePk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset getInstanceByIUID( java.lang.String sopiuid )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   /**
    * Get the Info of an instance. <p> Info means the Dataset with all attributes stored in DB for the instance (instance, series, study and patient attributes)
    */
   public org.dcm4che.data.Dataset getInstanceInfo( java.lang.String iuid,boolean supplement )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   /**
    * Get the Info of an instance. <p> Info means the Dataset with all attributes stored in DB for the instance (instance, series, study and patient attributes)
    */
   public java.util.List listInstanceInfos( java.lang.String[] iuids,boolean supplement )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   /**
    * Get the Info of an instance. <p> Info means the Dataset with all attributes stored in DB for the instance (instance, series, study and patient attributes)
    */
   public java.util.List listInstanceInfosByPatientAndSRCode( java.lang.String pid,java.lang.String issuer,java.util.Collection codes,java.util.Collection cuids )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   /**
    * Get the Info of an instance. <p> Info means the Dataset with all attributes stored in DB for the instance (instance, series, study and patient attributes)
    */
   public java.util.List listInstanceInfosByStudyAndSRCode( java.lang.String suid,java.lang.String cuid,java.lang.String code,java.lang.String designator,boolean supplement )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public java.util.List listStudiesOfPatient( long patientPk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public java.util.List listSeriesOfStudy( long studyPk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public java.util.List listInstancesOfSeries( long seriesPk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public java.util.List listFilesOfInstance( long instancePk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public java.util.List listStudiesOfPrivatePatient( long patientPk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public java.util.List listSeriesOfPrivateStudy( long studyPk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public java.util.List listInstancesOfPrivateSeries( long seriesPk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public java.util.List listFilesOfPrivateInstance( long instancePk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public java.util.List[] listInstanceFilesToRecover( long pk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public java.util.List[] listSeriesFilesToRecover( long pk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public java.util.List[] listStudyFilesToRecover( long pk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public java.util.List[] listPatientFilesToRecover( long pk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset getSOPInstanceRefMacro( long studyPk,boolean insertModality )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   /**
    * Get a collection of SOP Instance Reference Macro Datasets. <p> The parameter <code>instanceUIDs</code> can either use SOP Instance UIDs (String) or Instance.pk values (Long).
    * @throws FinderException
    */
   public java.util.Collection getSOPInstanceRefMacros( java.util.Collection instanceUIDs )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset getPatientForStudy( long studyPk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset getPatientForStudy( java.lang.String studyIUID )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public boolean isStudyAvailable( long studyPk,int availability )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset getHeaderInfo( long patPk,long studyPk,long seriesPk,long instancePk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset getXDSManifestInfo( org.dcm4che.data.Dataset manifest )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

}
