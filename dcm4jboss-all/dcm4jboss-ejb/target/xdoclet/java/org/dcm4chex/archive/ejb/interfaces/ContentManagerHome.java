/*
 * Gerado pelo XDoclet - Não edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home para ContentManager.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface ContentManagerHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/ContentManager";
   public static final String JNDI_NAME="ejb/ContentManager";

   public org.dcm4chex.archive.ejb.interfaces.ContentManager create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
