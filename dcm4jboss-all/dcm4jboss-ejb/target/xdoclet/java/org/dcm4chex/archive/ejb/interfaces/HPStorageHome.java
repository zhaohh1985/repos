/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home para HPStorage.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface HPStorageHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/HPStorage";
   public static final String JNDI_NAME="ejb/HPStorage";

   public org.dcm4chex.archive.ejb.interfaces.HPStorage create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
