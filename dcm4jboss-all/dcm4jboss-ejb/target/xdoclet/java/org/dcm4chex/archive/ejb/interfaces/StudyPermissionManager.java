/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Remota para StudyPermissionManager.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface StudyPermissionManager
   extends javax.ejb.EJBObject
{

   public java.util.Collection findByPatientPk( java.lang.Long pk )
      throws java.rmi.RemoteException;

   public java.util.Collection findByStudyIuid( java.lang.String suid )
      throws java.rmi.RemoteException;

   public java.util.Collection findByStudyIuidAndAction( java.lang.String suid,java.lang.String action )
      throws java.rmi.RemoteException;

   public boolean hasPermission( java.lang.String suid,java.lang.String action,java.lang.String role )
      throws java.rmi.RemoteException;

   public boolean hasPermission( java.lang.String suid,java.lang.String action,javax.security.auth.Subject subject )
      throws java.rmi.RemoteException;

   public boolean grant( java.lang.String suid,java.lang.String action,java.lang.String role )
      throws java.rmi.RemoteException;

   public int grant( java.lang.String suid,java.lang.String[] actions,java.lang.String role )
      throws java.rmi.RemoteException;

   public boolean revoke( org.dcm4chex.archive.ejb.interfaces.StudyPermissionDTO dto )
      throws java.rmi.RemoteException;

   public boolean revoke( java.lang.String suid,java.lang.String action,java.lang.String role )
      throws java.rmi.RemoteException;

   public int revoke( java.lang.String suid,java.lang.String[] actions,java.lang.String role )
      throws java.rmi.RemoteException;

   public java.util.Collection grantForPatient( long patPk,java.lang.String[] actions,java.lang.String role )
      throws java.rmi.RemoteException;

   public java.util.Collection revokeForPatient( long patPk,java.lang.String[] actions,java.lang.String role )
      throws java.rmi.RemoteException;

   public java.util.Collection grantForPatient( java.lang.String pid,java.lang.String issuer,java.lang.String[] actions,java.lang.String role )
      throws java.rmi.RemoteException;

   public java.util.Collection revokeForPatient( java.lang.String pid,java.lang.String issuer,java.lang.String[] actions,java.lang.String role )
      throws java.rmi.RemoteException;

   public int countStudiesOfPatient( java.lang.Long patPk )
      throws java.rmi.RemoteException;

}
