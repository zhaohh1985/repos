/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para HP.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface HPLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/HPLocal";
   public static final String JNDI_NAME="ejb/HP";

   public org.dcm4chex.archive.ejb.interfaces.HPLocal create(org.dcm4che.data.Dataset ds)
      throws javax.ejb.CreateException;

   public org.dcm4chex.archive.ejb.interfaces.HPLocal findBySopIuid(java.lang.String uid)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.HPLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

}
