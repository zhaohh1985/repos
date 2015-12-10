/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para Instance.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface InstanceLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/InstanceLocal";
   public static final String JNDI_NAME="ejb/Instance";

   public org.dcm4chex.archive.ejb.interfaces.InstanceLocal create(org.dcm4che.data.Dataset ds , org.dcm4chex.archive.ejb.interfaces.SeriesLocal series)
      throws javax.ejb.CreateException;

   public org.dcm4chex.archive.ejb.interfaces.InstanceLocal findBySopIuid(java.lang.String uid)
      throws javax.ejb.FinderException;

   public java.util.Collection findNotOnMediaAndStudyReceivedBefore(java.sql.Timestamp receivedBefore)
      throws javax.ejb.FinderException;

   public java.util.Collection findByPatientAndSopCuid(org.dcm4chex.archive.ejb.interfaces.PatientLocal patient, java.lang.String uid)
      throws javax.ejb.FinderException;

   public java.util.Collection findByPatientAndSrCode(org.dcm4chex.archive.ejb.interfaces.PatientLocal patient, org.dcm4chex.archive.ejb.interfaces.CodeLocal srcode)
      throws javax.ejb.FinderException;

   public java.util.Collection findByStudyAndSrCode(java.lang.String suid, java.lang.String cuid, java.lang.String code, java.lang.String designator)
      throws javax.ejb.FinderException;

   public java.util.Collection findBySeriesPk(java.lang.Long seriesPk)
      throws javax.ejb.FinderException;

   public java.util.Collection findBySeriesIuid(java.lang.String seriesIuid)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.InstanceLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

   public java.util.Collection listByIUIDs(java.lang.String[] iuids) 
      throws javax.ejb.FinderException;

   public java.util.Collection listByPatientAndSRCode(org.dcm4chex.archive.ejb.interfaces.PatientLocal pat , java.util.Collection srCodes , java.util.Collection cuids) 
      throws javax.ejb.FinderException;

   public java.util.Collection selectSopIuidsByStudyIuid(java.lang.String studyIuid) 
      throws javax.ejb.FinderException;

}
