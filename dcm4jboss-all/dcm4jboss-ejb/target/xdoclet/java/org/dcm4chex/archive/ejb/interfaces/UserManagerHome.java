/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home para UserManager.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface UserManagerHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/UserManager";
   public static final String JNDI_NAME="ejb/UserManager";

   public org.dcm4chex.archive.ejb.interfaces.UserManager create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
