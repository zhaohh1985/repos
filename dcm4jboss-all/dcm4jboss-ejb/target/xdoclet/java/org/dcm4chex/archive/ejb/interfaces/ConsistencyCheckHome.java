/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home para ConsistencyCheck.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface ConsistencyCheckHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/ConsistencyCheck";
   public static final String JNDI_NAME="ejb/ConsistencyCheck";

   public org.dcm4chex.archive.ejb.interfaces.ConsistencyCheck create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
