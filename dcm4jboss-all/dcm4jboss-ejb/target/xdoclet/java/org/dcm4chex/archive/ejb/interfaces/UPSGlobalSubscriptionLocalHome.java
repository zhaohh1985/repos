/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para UPSGlobalSubscription.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface UPSGlobalSubscriptionLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/UPSGlobalSubscriptionLocal";
   public static final String JNDI_NAME="ejb/UPSGlobalSubscription";

   public org.dcm4chex.archive.ejb.interfaces.UPSGlobalSubscriptionLocal create(java.lang.String aet , boolean deletionLock)
      throws javax.ejb.CreateException;

   public org.dcm4chex.archive.ejb.interfaces.UPSGlobalSubscriptionLocal findByReceivingAET(java.lang.String aet)
      throws javax.ejb.FinderException;

   public java.util.Collection findAll()
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.UPSGlobalSubscriptionLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

}
