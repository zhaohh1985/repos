/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para PrivateInstance.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface PrivateInstanceLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/PrivateInstanceLocal";
   public static final String JNDI_NAME="ejb/PrivateInstance";

   public org.dcm4chex.archive.ejb.interfaces.PrivateInstanceLocal create(int type , org.dcm4che.data.Dataset ds , org.dcm4chex.archive.ejb.interfaces.PrivateSeriesLocal series)
      throws javax.ejb.CreateException;

   public java.util.Collection findByPrivateType(int privateType)
      throws javax.ejb.FinderException;

   public java.util.Collection findBySopIuid(int privateType, java.lang.String uid)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.PrivateInstanceLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

}
