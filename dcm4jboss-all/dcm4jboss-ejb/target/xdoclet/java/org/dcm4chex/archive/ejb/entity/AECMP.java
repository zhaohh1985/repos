/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.entity;

/**
 * Camada CMP para AE.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public abstract class AECMP
   extends org.dcm4chex.archive.ejb.entity.AEBean
   implements javax.ejb.EntityBean
{

   public void ejbLoad() 
   {
   }

   public void ejbStore() 
   {
   }

   public void ejbActivate() 
   {
   }

   public void ejbPassivate() 
   {

   }

   public void setEntityContext(javax.ejb.EntityContext ctx) 
   {
   }

   public void unsetEntityContext() 
   {
   }

   public void ejbRemove() throws javax.ejb.RemoveException
   {

   }

   public abstract java.lang.Long getPk() ;

   public abstract void setPk( java.lang.Long pk ) ;

   public abstract java.lang.String getTitle() ;

   public abstract void setTitle( java.lang.String title ) ;

   public abstract java.lang.String getHostName() ;

   public abstract void setHostName( java.lang.String hostName ) ;

   public abstract int getPort() ;

   public abstract void setPort( int port ) ;

   public abstract java.lang.String getCipherSuites() ;

   public abstract void setCipherSuites( java.lang.String cipherSuites ) ;

   public abstract java.lang.String getIssuerOfPatientID() ;

   public abstract void setIssuerOfPatientID( java.lang.String issuerOfPatientID ) ;

   public abstract java.lang.String getIssuerOfAccessionNumber() ;

   public abstract void setIssuerOfAccessionNumber( java.lang.String issuerOfAccessionNumber ) ;

   public abstract java.lang.String getStationName() ;

   public abstract void setStationName( java.lang.String stationName ) ;

   public abstract java.lang.String getInstitution() ;

   public abstract void setInstitution( java.lang.String institution ) ;

   public abstract java.lang.String getDepartment() ;

   public abstract void setDepartment( java.lang.String department ) ;

   public abstract boolean getInstalled() ;

   public abstract void setInstalled( boolean installed ) ;

   public abstract java.lang.String getUserID() ;

   public abstract void setUserID( java.lang.String userID ) ;

   public abstract java.lang.String getPassword() ;

   public abstract void setPassword( java.lang.String password ) ;

   public abstract java.lang.String getFileSystemGroupID() ;

   public abstract void setFileSystemGroupID( java.lang.String fileSystemGroupID ) ;

   public abstract java.lang.String getGroup() ;

   public abstract void setGroup( java.lang.String group ) ;

   public abstract java.lang.String getDescription() ;

   public abstract void setDescription( java.lang.String description ) ;

   public abstract java.lang.String getWadoURL() ;

   public abstract void setWadoURL( java.lang.String wadoURL ) ;

   public abstract byte[] getVendorData() ;

   public abstract void setVendorData( byte[] vendorData ) ;

}