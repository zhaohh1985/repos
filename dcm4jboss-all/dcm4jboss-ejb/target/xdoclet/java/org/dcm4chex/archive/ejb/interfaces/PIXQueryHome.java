/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home para PIXQuery.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface PIXQueryHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/PIXQuery";
   public static final String JNDI_NAME="ejb/PIXQuery";

   public org.dcm4chex.archive.ejb.interfaces.PIXQuery create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
