/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Remota para GPWLManager.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface GPWLManager
   extends javax.ejb.EJBObject
{

   public org.dcm4che.data.Dataset getWorklistItem( java.lang.String spsid )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset removeWorklistItem( java.lang.String iuid )
      throws javax.ejb.RemoveException, javax.ejb.FinderException, java.rmi.RemoteException;

   public java.lang.String addWorklistItem( org.dcm4che.data.Dataset ds )
      throws java.rmi.RemoteException;

   public void updateWorklistItem( org.dcm4che.data.Dataset ds )
      throws java.rmi.RemoteException;

   public void modifyStatus( java.lang.String iuid,org.dcm4che.data.Dataset ds )
      throws org.dcm4che.net.DcmServiceException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset getOutputInformation( java.lang.String iuid )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public void addWorklistItem( org.dcm4che.data.Dataset wkitem,boolean checkPGP,boolean checkAppend )
      throws java.rmi.RemoteException;

}
