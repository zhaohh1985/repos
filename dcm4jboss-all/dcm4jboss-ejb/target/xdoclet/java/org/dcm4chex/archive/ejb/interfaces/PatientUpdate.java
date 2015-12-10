/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Remota para PatientUpdate.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface PatientUpdate
   extends javax.ejb.EJBObject
{

   public void changePatientIdentifierList( org.dcm4che.data.Dataset correct,org.dcm4che.data.Dataset prior,org.dcm4chex.archive.common.PatientMatching matching,boolean keepPrior )
      throws javax.ejb.CreateException, javax.ejb.FinderException, org.dcm4chex.archive.exceptions.PatientAlreadyExistsException, javax.ejb.RemoveException, java.rmi.RemoteException;

   public void mergePatient( org.dcm4che.data.Dataset dominant,org.dcm4che.data.Dataset prior,org.dcm4chex.archive.common.PatientMatching matching,boolean keepPrior )
      throws javax.ejb.CreateException, javax.ejb.FinderException, javax.ejb.RemoveException, java.rmi.RemoteException;

   public void updatePatient( org.dcm4chex.archive.ejb.interfaces.StudyLocal study,org.dcm4che.data.Dataset attrs,org.dcm4chex.archive.common.PatientMatching matching )
      throws javax.ejb.FinderException, javax.ejb.CreateException, java.rmi.RemoteException;

   /**
    * Update patient data as well as relink study with the patient if the patient is different than original one.
    * @throws CreateException
    */
   public void updatePatient( org.dcm4chex.archive.ejb.interfaces.StudyLocal study,org.dcm4che.data.Dataset attrs,org.dcm4che.data.Dataset modified,org.dcm4chex.archive.common.PatientMatching matching )
      throws javax.ejb.FinderException, javax.ejb.CreateException, java.rmi.RemoteException;

   public void updatePatient( org.dcm4che.data.Dataset attrs,org.dcm4chex.archive.common.PatientMatching matching )
      throws javax.ejb.CreateException, javax.ejb.FinderException, java.rmi.RemoteException;

   public void updatePatient( org.dcm4che.data.Dataset attrs,org.dcm4che.data.Dataset modified,org.dcm4chex.archive.common.PatientMatching matching )
      throws javax.ejb.CreateException, javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.PatientLocal createPatient( org.dcm4che.data.Dataset ds )
      throws javax.ejb.CreateException, java.rmi.RemoteException;

   public boolean deletePatient( org.dcm4che.data.Dataset ds,org.dcm4chex.archive.common.PatientMatching matching )
      throws javax.ejb.RemoveException, javax.ejb.FinderException, java.rmi.RemoteException;

   public void patientArrived( org.dcm4che.data.Dataset ds,org.dcm4chex.archive.common.PatientMatching matching )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public void updateOtherPatientIDsOrCreate( org.dcm4che.data.Dataset ds,org.dcm4chex.archive.common.PatientMatching matching )
      throws javax.ejb.FinderException, javax.ejb.CreateException, java.rmi.RemoteException;

}
