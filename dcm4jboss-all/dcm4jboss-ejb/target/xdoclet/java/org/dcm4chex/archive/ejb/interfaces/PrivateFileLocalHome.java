/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para PrivateFile.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface PrivateFileLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/PrivateFileLocal";
   public static final String JNDI_NAME="ejb/PrivateFile";

   public org.dcm4chex.archive.ejb.interfaces.PrivateFileLocal create(java.lang.String path , java.lang.String tsuid , long size , byte[] md5 , int status , org.dcm4chex.archive.ejb.interfaces.PrivateInstanceLocal instance , org.dcm4chex.archive.ejb.interfaces.FileSystemLocal filesystem)
      throws javax.ejb.CreateException;

   public java.util.Collection findDereferencedInFileSystem(java.lang.String dirPath, int limit)
      throws javax.ejb.FinderException;

   public java.util.Collection findOrphanedOnFSGroup(java.lang.String groupId, int limit)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.PrivateFileLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

}
