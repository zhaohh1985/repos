/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home para AttributesModification.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface AttributesModificationHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/AttributesModification";
   public static final String JNDI_NAME="ejb/AttributesModification";

   public org.dcm4chex.archive.ejb.interfaces.AttributesModification create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
