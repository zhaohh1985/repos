/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Remota para StudyReconciliation.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface StudyReconciliation
   extends javax.ejb.EJBObject
{

   public java.util.Collection getStudyIuidsWithStatus( int status,java.sql.Timestamp createdBefore,int limit )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public void updateStatus( java.util.Collection studyIuids,int status )
      throws javax.ejb.FinderException, org.dcm4che.net.DcmServiceException, java.rmi.RemoteException;

   public void updateStatus( java.lang.String studyIuid,int status )
      throws javax.ejb.FinderException, org.dcm4che.net.DcmServiceException, java.rmi.RemoteException;

   public void updatePatient( org.dcm4che.data.Dataset attrs )
      throws javax.ejb.FinderException, javax.ejb.CreateException, java.rmi.RemoteException;

   public void mergePatient( org.dcm4che.data.Dataset dominant,org.dcm4che.data.Dataset prior,boolean keepPrior )
      throws javax.ejb.FinderException, javax.ejb.CreateException, javax.ejb.RemoveException, java.rmi.RemoteException;

   public void updateStudyAndSeries( java.lang.String studyIuid,int studyStatus,java.util.Map map )
      throws javax.ejb.FinderException, org.dcm4che.net.DcmServiceException, java.rmi.RemoteException;

}
