/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home para StudyMgt.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface StudyMgtHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/StudyMgt";
   public static final String JNDI_NAME="ejb/StudyMgt";

   public org.dcm4chex.archive.ejb.interfaces.StudyMgt create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
