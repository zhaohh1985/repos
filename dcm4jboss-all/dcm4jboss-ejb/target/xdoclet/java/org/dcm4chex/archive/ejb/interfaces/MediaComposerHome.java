/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home para MediaComposer.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface MediaComposerHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/MediaComposer";
   public static final String JNDI_NAME="ejb/MediaComposer";

   public org.dcm4chex.archive.ejb.interfaces.MediaComposer create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
