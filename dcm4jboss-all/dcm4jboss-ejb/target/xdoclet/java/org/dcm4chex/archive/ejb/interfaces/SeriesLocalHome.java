/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para Series.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface SeriesLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/SeriesLocal";
   public static final String JNDI_NAME="ejb/Series";

   public org.dcm4chex.archive.ejb.interfaces.SeriesLocal create(org.dcm4che.data.Dataset ds , org.dcm4chex.archive.ejb.interfaces.StudyLocal study)
      throws javax.ejb.CreateException;

   public java.util.Collection findAll()
      throws javax.ejb.FinderException;

   public java.util.Collection findSeriesOnMedia(org.dcm4chex.archive.ejb.interfaces.MediaLocal media)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.SeriesLocal findBySeriesIuid(java.lang.String uid)
      throws javax.ejb.FinderException;

   public java.util.Collection findByPpsIuid(java.lang.String uid)
      throws javax.ejb.FinderException;

   public java.util.Collection findWithNoPpsIuidFromSrcAETReceivedLastOfStudyBefore(java.lang.String srcAET, java.sql.Timestamp receivedBefore)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.SeriesLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

   public java.util.Collection getSeriesPksWithStatusAndUpdatedBefore(int status , java.sql.Timestamp updatedBefore) 
      throws javax.ejb.FinderException;

   public java.util.Collection getSeriesWithStatusAndUpdatedBefore(int status , java.sql.Timestamp updatedBefore) 
      throws javax.ejb.FinderException;

   public java.util.Collection seriesIuidsForAttributesUpdate(int availability , java.lang.String modality , java.lang.String srcAET , java.sql.Timestamp updatedAfter , java.sql.Timestamp updatedBefore , int offset , int limit) 
      throws javax.ejb.FinderException;

   public int countSeriesForAttributesUpdate(int availability , java.lang.String modality , java.lang.String srcAET , java.sql.Timestamp updatedAfter , java.sql.Timestamp updatedBefore) 
      throws javax.ejb.FinderException;

   public java.util.Collection listPriorOfPatient(org.dcm4chex.archive.ejb.interfaces.PatientLocal pat , java.lang.String ignoreStudyIUID , java.sql.Timestamp createdAfter , int minAvail , java.lang.String[] modalities) 
      throws javax.ejb.FinderException;

   public java.util.Collection listBySeriesIUIDsWithoutPPS(java.lang.String[] seriesIUIDs) 
      throws javax.ejb.FinderException;

   public java.util.Collection listByIUIDs(java.lang.String[] iuids) 
      throws javax.ejb.FinderException;

}
