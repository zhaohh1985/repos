/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para Instance.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface InstanceLocal
   extends javax.ejb.EJBLocalObject
{

   public java.lang.Long getPk(  ) ;

   public java.sql.Timestamp getCreatedTime(  ) ;

   public java.sql.Timestamp getUpdatedTime(  ) ;

   public java.lang.String getSopIuid(  ) ;

   public java.lang.String getSopCuid(  ) ;

   public java.lang.String getInstanceNumber(  ) ;

   public java.sql.Timestamp getContentDateTime(  ) ;

   public java.lang.String getSrCompletionFlag(  ) ;

   public java.lang.String getSrVerificationFlag(  ) ;

   public java.lang.String getInstanceCustomAttribute1(  ) ;

   public java.lang.String getExternalRetrieveAET(  ) ;

   public void setExternalRetrieveAET( java.lang.String aet ) ;

   public java.lang.String getRetrieveAETs(  ) ;

   public int getAvailabilitySafe(  ) ;

   public void setAvailability( int availability ) ;

   public int getInstanceStatus(  ) ;

   public void setInstanceStatus( int status ) ;

   public boolean getArchived(  ) ;

   public void setArchived( boolean b ) ;

   public void setAllAttributes( boolean allAttributes ) ;

   public boolean getCommitmentSafe(  ) ;

   public void setCommitment( boolean commitment ) ;

   public void setSeries( org.dcm4chex.archive.ejb.interfaces.SeriesLocal series ) ;

   public org.dcm4chex.archive.ejb.interfaces.SeriesLocal getSeries(  ) ;

   public java.util.Collection getFiles(  ) ;

   public java.util.Collection getFiles( java.lang.Long fsPk ) throws javax.ejb.FinderException;

   public java.util.Collection getDuplicateFiles( java.lang.Long fsPk,java.lang.String md5 ) throws javax.ejb.FinderException;

   public int getNumberOfFiles( java.lang.Long fsPk ) throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.MediaLocal getMedia(  ) ;

   public void setMedia( org.dcm4chex.archive.ejb.interfaces.MediaLocal media ) ;

   public org.dcm4chex.archive.ejb.interfaces.CodeLocal getSrCode(  ) ;

   public java.util.Collection getVerifyingObservers(  ) ;

   public void addRetrieveAET( java.lang.String aet ) ;

   public boolean updateRetrieveAETs(  ) ;

   public boolean updateAvailability( int availabilityOfExternalRetrieveable ) ;

   public void updateRetrieveAETs( java.lang.String oldAET,java.lang.String newAET ) ;

   public boolean updateAttributes( org.dcm4che.data.Dataset newAttrs,org.dcm4che.data.Dataset modifiedAttrs ) ;

   public org.dcm4che.data.Dataset getAttributes( boolean supplement ) ;

   public void setAttributes( org.dcm4che.data.Dataset ds ) ;

   public void coerceAttributes( org.dcm4che.data.Dataset ds,org.dcm4che.data.Dataset coercedElements ) throws org.dcm4che.net.DcmServiceException;

   public java.lang.String asString(  ) ;

}
