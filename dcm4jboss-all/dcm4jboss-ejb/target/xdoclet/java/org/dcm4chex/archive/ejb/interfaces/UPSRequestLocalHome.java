/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para UPSRequest.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface UPSRequestLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/UPSRequestLocal";
   public static final String JNDI_NAME="ejb/UPSRequest";

   public org.dcm4chex.archive.ejb.interfaces.UPSRequestLocal create(org.dcm4che.data.Dataset ds , org.dcm4chex.archive.ejb.interfaces.UPSLocal ups)
      throws javax.ejb.CreateException;

   public org.dcm4chex.archive.ejb.interfaces.UPSRequestLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

}
