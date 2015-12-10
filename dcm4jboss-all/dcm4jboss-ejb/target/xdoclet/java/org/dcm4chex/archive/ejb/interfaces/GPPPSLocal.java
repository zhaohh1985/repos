/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para GPPPS.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface GPPPSLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Auto-generated Primary Key
    */
   public java.lang.Long getPk(  ) ;

   public java.sql.Timestamp getCreatedTime(  ) ;

   public java.sql.Timestamp getUpdatedTime(  ) ;

   /**
    * SOP Instance UID
    */
   public java.lang.String getSopIuid(  ) ;

   /**
    * PPS Start Datetime
    */
   public java.sql.Timestamp getPpsStartDateTime(  ) ;

   public void setPpsStartDateTime( java.util.Date date ) ;

   public int getPpsStatusAsInt(  ) ;

   public void setPatient( org.dcm4chex.archive.ejb.interfaces.PatientLocal patient ) ;

   public org.dcm4chex.archive.ejb.interfaces.PatientLocal getPatient(  ) ;

   public void setGpsps( java.util.Collection gpsps ) ;

   public java.util.Collection getGpsps(  ) ;

   public boolean isInProgress(  ) ;

   public boolean isCompleted(  ) ;

   public boolean isDiscontinued(  ) ;

   public java.lang.String getPpsStatus(  ) ;

   public org.dcm4che.data.Dataset getAttributes(  ) ;

   public void setAttributes( org.dcm4che.data.Dataset ds ) ;

}
