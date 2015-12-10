/*
 * Gerado pelo XDoclet - Não edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Remota para HPStorage.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface HPStorage
   extends javax.ejb.EJBObject
{

   public void store( org.dcm4che.data.Dataset ds )
      throws org.dcm4che.net.DcmServiceException, java.rmi.RemoteException;

}
