/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home para PatientUpdate.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface PatientUpdateHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/PatientUpdate";
   public static final String JNDI_NAME="ejb/PatientUpdate";

   public org.dcm4chex.archive.ejb.interfaces.PatientUpdate create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
