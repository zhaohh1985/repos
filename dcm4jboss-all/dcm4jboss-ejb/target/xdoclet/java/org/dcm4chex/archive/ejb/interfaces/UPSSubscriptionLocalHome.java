/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para UPSSubscription.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface UPSSubscriptionLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/UPSSubscriptionLocal";
   public static final String JNDI_NAME="ejb/UPSSubscription";

   public org.dcm4chex.archive.ejb.interfaces.UPSSubscriptionLocal create(java.lang.String aet , boolean dellock , org.dcm4chex.archive.ejb.interfaces.UPSLocal ups)
      throws javax.ejb.CreateException;

   public org.dcm4chex.archive.ejb.interfaces.UPSSubscriptionLocal findByReceivingAETAndUPSInstanceUID(java.lang.String aet, java.lang.String iuid)
      throws javax.ejb.FinderException;

   public java.util.Collection findByReceivingAET(java.lang.String aet)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.UPSSubscriptionLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

   public boolean hasDeletionLocks(org.dcm4chex.archive.ejb.interfaces.UPSLocal ups) 
      throws javax.ejb.FinderException;

   public java.util.Collection getReceivingAETs(java.lang.String iuid) 
      throws javax.ejb.FinderException;

}