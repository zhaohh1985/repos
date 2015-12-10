/*
 * Gerado pelo XDoclet - Não edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home para Storage.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface StorageHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/Storage";
   public static final String JNDI_NAME="ejb/Storage";

   public org.dcm4chex.archive.ejb.interfaces.Storage create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
