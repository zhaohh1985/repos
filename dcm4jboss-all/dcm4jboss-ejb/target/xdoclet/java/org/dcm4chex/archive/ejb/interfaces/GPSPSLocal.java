/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para GPSPS.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface GPSPSLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Auto-generated Primary Key
    */
   public java.lang.Long getPk(  ) ;

   public java.lang.String getSopIuid(  ) ;

   public java.lang.String getTransactionUid(  ) ;

   public void setTransactionUid( java.lang.String iuid ) ;

   public java.sql.Timestamp getSpsStartDateTime(  ) ;

   public java.sql.Timestamp getExpectedCompletionDateTime(  ) ;

   public int getGpspsStatusAsInt(  ) ;

   public java.lang.String getGpspsStatus(  ) ;

   public boolean isScheduled(  ) ;

   public boolean isInProgress(  ) ;

   public boolean isSuspended(  ) ;

   public boolean isCompleted(  ) ;

   public boolean isDiscontinued(  ) ;

   public java.lang.String getGpspsPriority(  ) ;

   public java.lang.String getInputAvailabilityFlag(  ) ;

   public void setPatient( org.dcm4chex.archive.ejb.interfaces.PatientLocal patient ) ;

   public org.dcm4chex.archive.ejb.interfaces.PatientLocal getPatient(  ) ;

   public void setGppps( java.util.Collection gpsps ) ;

   public java.util.Collection getGppps(  ) ;

   public java.util.Collection getRefRequests(  ) ;

   public org.dcm4che.data.Dataset getAttributes(  ) ;

   public void setAttributes( org.dcm4che.data.Dataset ds ) ;

   public java.lang.String asString(  ) ;

}
