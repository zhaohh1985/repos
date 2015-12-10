/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para PrivateSeries.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface PrivateSeriesLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/PrivateSeriesLocal";
   public static final String JNDI_NAME="ejb/PrivateSeries";

   public org.dcm4chex.archive.ejb.interfaces.PrivateSeriesLocal create(int type , org.dcm4che.data.Dataset ds , org.dcm4chex.archive.ejb.interfaces.PrivateStudyLocal study)
      throws javax.ejb.CreateException;

   public java.util.Collection findByPrivateType(int privateType)
      throws javax.ejb.FinderException;

   public java.util.Collection findBySeriesIuid(int privateType, java.lang.String uid)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.PrivateSeriesLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

}
