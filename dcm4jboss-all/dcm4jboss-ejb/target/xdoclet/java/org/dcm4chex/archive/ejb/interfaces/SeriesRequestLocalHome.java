/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para SeriesRequest.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface SeriesRequestLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/SeriesRequestLocal";
   public static final String JNDI_NAME="ejb/SeriesRequest";

   public org.dcm4chex.archive.ejb.interfaces.SeriesRequestLocal create(org.dcm4che.data.Dataset ds , org.dcm4chex.archive.ejb.interfaces.SeriesLocal series)
      throws javax.ejb.CreateException;

   public java.util.Collection findAll()
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.SeriesRequestLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

}
