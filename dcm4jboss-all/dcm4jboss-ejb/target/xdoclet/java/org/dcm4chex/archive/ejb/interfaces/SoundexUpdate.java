/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Remota para SoundexUpdate.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface SoundexUpdate
   extends javax.ejb.EJBObject
{

   public int updatePatientNameSoundex(  )
      throws java.rmi.RemoteException;

   public int updateReferringPhysicianNameSoundex(  )
      throws java.rmi.RemoteException;

   public int updatePerformingPhysicianNameSoundex(  )
      throws java.rmi.RemoteException;

   public int updateRequestingPhysicianNameSoundex(  )
      throws java.rmi.RemoteException;

   public int updateVerifyingObserverNameSoundex(  )
      throws java.rmi.RemoteException;

   public int updateMWLPerformingPhysicianNameSoundex(  )
      throws java.rmi.RemoteException;

   public int updateGPSPSHumanPerformerNameSoundex(  )
      throws java.rmi.RemoteException;

}
