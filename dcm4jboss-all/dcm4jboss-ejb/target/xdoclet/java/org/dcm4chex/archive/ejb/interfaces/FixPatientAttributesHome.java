/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home para FixPatientAttributes.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface FixPatientAttributesHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/FixPatientAttributes";
   public static final String JNDI_NAME="ejb/FixPatientAttributes";

   public org.dcm4chex.archive.ejb.interfaces.FixPatientAttributes create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
