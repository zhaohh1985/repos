/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para ContentItem.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface ContentItemLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/ContentItemLocal";
   public static final String JNDI_NAME="ejb/ContentItem";

   public org.dcm4chex.archive.ejb.interfaces.ContentItemLocal create(org.dcm4che.data.Dataset item)
      throws javax.ejb.CreateException;

   public org.dcm4chex.archive.ejb.interfaces.ContentItemLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

}
