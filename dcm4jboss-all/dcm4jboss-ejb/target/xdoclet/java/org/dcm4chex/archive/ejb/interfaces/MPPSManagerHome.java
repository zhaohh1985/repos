/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home para MPPSManager.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface MPPSManagerHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/MPPSManager";
   public static final String JNDI_NAME="ejb/MPPSManager";

   public org.dcm4chex.archive.ejb.interfaces.MPPSManager create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
