/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Remota para StudyMgt.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface StudyMgt
   extends javax.ejb.EJBObject
{

   public void createStudy( org.dcm4che.data.Dataset ds,org.dcm4chex.archive.common.PatientMatching matching )
      throws org.dcm4che.net.DcmServiceException, javax.ejb.CreateException, javax.ejb.FinderException, java.rmi.RemoteException;

   public void updateStudy( java.lang.String iuid,org.dcm4che.data.Dataset ds,org.dcm4chex.archive.common.PatientMatching matching )
      throws org.dcm4che.net.DcmServiceException, java.rmi.RemoteException;

   public void updatePatientOnly( java.lang.String iuid,org.dcm4che.data.Dataset ds,org.dcm4che.data.Dataset modAttrs )
      throws org.dcm4che.net.DcmServiceException, java.rmi.RemoteException;

   public void updateStudyOnly( java.lang.String iuid,org.dcm4che.data.Dataset ds,org.dcm4che.data.Dataset modAttrs )
      throws org.dcm4che.net.DcmServiceException, java.rmi.RemoteException;

   public void updateStudyStatusId( java.lang.String iuid,java.lang.String statusId )
      throws javax.ejb.FinderException, org.dcm4che.net.DcmServiceException, java.rmi.RemoteException;

   public java.lang.String getStudyStatusId( java.lang.String iuid,java.lang.String statusId )
      throws javax.ejb.FinderException, org.dcm4che.net.DcmServiceException, java.rmi.RemoteException;

}
