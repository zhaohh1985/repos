/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home para GPPPSManager.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface GPPPSManagerHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/GPPPSManager";
   public static final String JNDI_NAME="ejb/GPPPSManager";

   public org.dcm4chex.archive.ejb.interfaces.GPPPSManager create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
