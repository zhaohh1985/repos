/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home para FileSystemMgt2.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface FileSystemMgt2Home
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/FileSystemMgt2";
   public static final String JNDI_NAME="ejb/FileSystemMgt2";

   public org.dcm4chex.archive.ejb.interfaces.FileSystemMgt2 create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
