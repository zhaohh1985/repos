/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Remota para UserManager.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface UserManager
   extends javax.ejb.EJBObject
{

   public java.util.Collection getUsers(  )
      throws java.rmi.RemoteException;

   public void addUser( java.lang.String user,java.lang.String passwd )
      throws java.rmi.RemoteException;

   public void addUser( java.lang.String user,java.lang.String passwd,java.util.Collection roles )
      throws java.rmi.RemoteException;

   public boolean removeUser( java.lang.String user )
      throws java.rmi.RemoteException;

   public java.lang.String getPasswordForUser( java.lang.String user )
      throws java.rmi.RemoteException;

   public boolean setPasswordForUser( java.lang.String user,java.lang.String passwd )
      throws java.rmi.RemoteException;

   public boolean changePasswordForUser( java.lang.String user,java.lang.String oldPasswd,java.lang.String newPasswd )
      throws java.rmi.RemoteException;

   public java.util.Collection getRolesOfUser( java.lang.String user )
      throws java.rmi.RemoteException;

   public void addRoleToUser( java.lang.String user,java.lang.String role )
      throws java.rmi.RemoteException;

   public boolean removeRoleFromUser( java.lang.String user,java.lang.String role )
      throws java.rmi.RemoteException;

   public void updateUser( java.lang.String user,java.util.Collection roles )
      throws java.rmi.RemoteException;

}
