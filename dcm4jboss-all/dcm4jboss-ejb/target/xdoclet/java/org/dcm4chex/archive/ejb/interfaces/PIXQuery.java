/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Remota para PIXQuery.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface PIXQuery
   extends javax.ejb.EJBObject
{

   public java.util.List queryCorrespondingPIDs( java.lang.String patientID,java.lang.String issuer,java.lang.String[] domains )
      throws java.rmi.RemoteException;

   public java.util.List queryCorrespondingPIDsByPrimaryPatientID( java.lang.String patientID,java.lang.String issuer,java.lang.String[] domains )
      throws java.rmi.RemoteException;

   public java.util.List queryCorrespondingPIDsByOtherPatientID( java.lang.String patientID,java.lang.String issuer,java.lang.String[] domains )
      throws java.rmi.RemoteException;

}
