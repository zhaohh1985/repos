/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home para AEManager.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface AEManagerHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/AEManager";
   public static final String JNDI_NAME="ejb/AEManager";

   public org.dcm4chex.archive.ejb.interfaces.AEManager create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
