/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para AE.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface AELocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Auto-generated Primary Key
    */
   public java.lang.Long getPk(  ) ;

   /**
    * Application Entity Title
    */
   public java.lang.String getTitle(  ) ;

   public void setTitle( java.lang.String title ) ;

   public java.lang.String getHostName(  ) ;

   public void setHostName( java.lang.String name ) ;

   public int getPort(  ) ;

   public void setPort( int port ) ;

   public java.lang.String getCipherSuites(  ) ;

   public void setCipherSuites( java.lang.String cipherSuites ) ;

   public java.lang.String getIssuerOfPatientID(  ) ;

   public void setIssuerOfPatientID( java.lang.String issuer ) ;

   public java.lang.String getIssuerOfAccessionNumber(  ) ;

   public void setIssuerOfAccessionNumber( java.lang.String issuer ) ;

   public java.lang.String getStationName(  ) ;

   public void setStationName( java.lang.String stationName ) ;

   public java.lang.String getInstitution(  ) ;

   public void setInstitution( java.lang.String institution ) ;

   public java.lang.String getDepartment(  ) ;

   public void setDepartment( java.lang.String department ) ;

   public boolean getInstalled(  ) ;

   public void setInstalled( boolean installed ) ;

   public java.lang.String getUserID(  ) ;

   public void setUserID( java.lang.String user ) ;

   public java.lang.String getPassword(  ) ;

   public void setPassword( java.lang.String passwd ) ;

   public java.lang.String getFileSystemGroupID(  ) ;

   public void setFileSystemGroupID( java.lang.String id ) ;

   public java.lang.String getGroup(  ) ;

   public void setGroup( java.lang.String group ) ;

   public java.lang.String getDescription(  ) ;

   public void setDescription( java.lang.String desc ) ;

   public java.lang.String getWadoURL(  ) ;

   public void setWadoURL( java.lang.String desc ) ;

   public byte[] getVendorData(  ) ;

   public void setVendorData( byte[] vendorData ) ;

   public void update( org.dcm4chex.archive.ejb.interfaces.AEDTO dto ) ;

   public org.dcm4chex.archive.ejb.interfaces.AEDTO toDTO(  ) ;

   public java.lang.String asString(  ) ;

}
