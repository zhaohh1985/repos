/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Remota para PrivateManager.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface PrivateManager
   extends javax.ejb.EJBObject
{

   public void deletePrivateSeries( long series_pk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public java.util.Collection deletePrivateStudy( long study_pk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public void deletePrivatePatient( long patient_pk )
      throws java.rmi.RemoteException;

   public void deletePrivateInstance( long instance_pk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public void deletePrivateFile( long file_pk )
      throws java.rmi.RemoteException;

   public void deletePrivateFiles( java.util.Collection fileDTOs )
      throws java.rmi.RemoteException;

   public void deleteAll( int privateType )
      throws java.rmi.RemoteException;

   /**
    * Delete a list of instances, i.e., move them to trash bin
    * @param iuids A list of instance uid
    * @param cascading True to delete the series/study if there's no instance/series
    * @return a collection of Dataset containing the actuall detetion information per study    */
   public java.util.Collection moveInstancesToTrash( java.lang.String[] iuids,boolean cascading )
      throws java.rmi.RemoteException;

   public org.dcm4che.data.Dataset moveInstanceToTrash( long instance_pk )
      throws java.rmi.RemoteException;

   public org.dcm4che.data.Dataset moveSeriesToTrash( long series_pk )
      throws java.rmi.RemoteException;

   public java.util.Collection moveSeriesToTrash( java.lang.String[] uids )
      throws java.rmi.RemoteException;

   public void moveSeriesOfPPSToTrash( java.lang.String ppsIUID,boolean removeEmptyParents )
      throws java.rmi.RemoteException;

   public org.dcm4che.data.Dataset moveStudyToTrash( java.lang.String iuid )
      throws javax.ejb.ObjectNotFoundException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset moveStudyToTrash( long study_pk )
      throws javax.ejb.ObjectNotFoundException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset purgeStudy( java.lang.String suid )
      throws java.rmi.RemoteException;

   public java.util.Collection movePatientToTrash( long pat_pk )
      throws javax.ejb.ObjectNotFoundException, java.rmi.RemoteException;

   public java.util.Collection movePatientToTrash( org.dcm4che.data.Dataset patAttrs,org.dcm4chex.archive.common.PatientMatching matching )
      throws javax.ejb.ObjectNotFoundException, java.rmi.RemoteException;

   public java.util.Collection moveFilesToTrash( java.util.Collection files )
      throws javax.ejb.CreateException, java.rmi.RemoteException;

   public void moveFilesToTrash( org.dcm4chex.archive.ejb.interfaces.PrivateInstanceLocal privInstance,java.util.Collection files )
      throws javax.ejb.CreateException, java.rmi.RemoteException;

   public java.util.Collection findByStudyIuid( java.lang.String studyIUID )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public java.util.Collection findByStudyIuid( int privateType,java.lang.String studyIUID )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

}
