/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home para ContentEdit.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface ContentEditHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/ContentEdit";
   public static final String JNDI_NAME="ejb/ContentEdit";

   public org.dcm4chex.archive.ejb.interfaces.ContentEdit create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
