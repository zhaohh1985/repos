/*
 * Gerado pelo XDoclet - Não edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home para MWLManager.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface MWLManagerHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/MWLManager";
   public static final String JNDI_NAME="ejb/MWLManager";

   public org.dcm4chex.archive.ejb.interfaces.MWLManager create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
