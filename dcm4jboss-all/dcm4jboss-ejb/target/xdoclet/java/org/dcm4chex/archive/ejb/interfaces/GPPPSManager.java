/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Remota para GPPPSManager.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface GPPPSManager
   extends javax.ejb.EJBObject
{

   public void createGPPPS( org.dcm4che.data.Dataset ds,org.dcm4chex.archive.common.PatientMatching matching )
      throws org.dcm4che.net.DcmServiceException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset getGPPPS( java.lang.String iuid )
      throws org.dcm4che.net.DcmServiceException, java.rmi.RemoteException;

   public void updateGPPPS( org.dcm4che.data.Dataset ds )
      throws org.dcm4che.net.DcmServiceException, java.rmi.RemoteException;

   public void removeGPPPS( java.lang.String iuid )
      throws javax.ejb.RemoveException, javax.ejb.FinderException, java.rmi.RemoteException;

}
