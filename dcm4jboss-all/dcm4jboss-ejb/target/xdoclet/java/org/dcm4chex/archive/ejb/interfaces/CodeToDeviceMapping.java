/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Remota para CodeToDeviceMapping.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface CodeToDeviceMapping
   extends javax.ejb.EJBObject
{

   public void createMapping( org.dcm4che.data.Dataset ds )
      throws javax.ejb.CreateException, javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset addScheduledStationInfo( org.dcm4che.data.Dataset ds )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public boolean deleteDevice( java.lang.String stationName )
      throws javax.ejb.FinderException, javax.ejb.RemoveException, java.rmi.RemoteException;

   public boolean deleteMapping(  )
      throws javax.ejb.FinderException, javax.ejb.RemoveException, java.rmi.RemoteException;

}
