/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para AE.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface AELocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/AELocal";
   public static final String JNDI_NAME="ejb/AE";

   public org.dcm4chex.archive.ejb.interfaces.AELocal create(org.dcm4chex.archive.ejb.interfaces.AEDTO dto)
      throws javax.ejb.CreateException;

   public java.util.Collection findAll()
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.AELocal findByAET(java.lang.String aet)
      throws javax.ejb.FinderException;

   public java.util.Collection findByHostName(java.lang.String hostName)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.AELocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

}
