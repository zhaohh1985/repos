/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home para PrivateManager.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface PrivateManagerHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/PrivateManager";
   public static final String JNDI_NAME="ejb/PrivateManager";

   public org.dcm4chex.archive.ejb.interfaces.PrivateManager create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
