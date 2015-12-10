/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Remota para MWLManager.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface MWLManager
   extends javax.ejb.EJBObject
{

   public org.dcm4che.data.Dataset removeWorklistItem( java.lang.String rpid,java.lang.String spsid )
      throws java.rmi.RemoteException;

   public org.dcm4che.data.Dataset removeWorklistItem( org.dcm4che.data.Dataset ds,org.dcm4chex.archive.common.PatientMatching matching )
      throws org.dcm4chex.archive.exceptions.PatientMismatchException, javax.ejb.FinderException, javax.ejb.RemoveException, java.rmi.RemoteException;

   public boolean updateSPSStatus( java.lang.String rpid,java.lang.String spsid,java.lang.String status )
      throws java.rmi.RemoteException;

   public boolean updateSPSStatus( org.dcm4che.data.Dataset ds,org.dcm4chex.archive.common.PatientMatching matching )
      throws org.dcm4chex.archive.exceptions.PatientMismatchException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset addWorklistItem( org.dcm4che.data.Dataset ds,org.dcm4chex.archive.common.PatientMatching matching )
      throws javax.ejb.CreateException, javax.ejb.FinderException, java.rmi.RemoteException;

   public boolean updateWorklistItem( org.dcm4che.data.Dataset ds,org.dcm4chex.archive.common.PatientMatching matching )
      throws org.dcm4chex.archive.exceptions.PatientMismatchException, java.rmi.RemoteException;

}
