/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home para CodeToDeviceMapping.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface CodeToDeviceMappingHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/CodeToDeviceMapping";
   public static final String JNDI_NAME="ejb/CodeToDeviceMapping";

   public org.dcm4chex.archive.ejb.interfaces.CodeToDeviceMapping create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
