/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para Media.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface MediaLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Auto-generated Primary Key
    */
   public java.lang.Long getPk(  ) ;

   public java.sql.Timestamp getCreatedTime(  ) ;

   public java.sql.Timestamp getUpdatedTime(  ) ;

   public java.lang.String getFilesetId(  ) ;

   public void setFilesetId( java.lang.String id ) ;

   public java.lang.String getFilesetIuid(  ) ;

   public java.lang.String getMediaCreationRequestIuid(  ) ;

   public void setMediaCreationRequestIuid( java.lang.String iuid ) ;

   public long getMediaUsage(  ) ;

   public void setMediaUsage( long mediaUsage ) ;

   public int getMediaStatus(  ) ;

   public void setMediaStatus( int mediaStatus ) ;

   public java.lang.String getMediaStatusInfo(  ) ;

   public void setMediaStatusInfo( java.lang.String info ) ;

   public boolean checkInstancesAvailable(  ) throws javax.ejb.FinderException;

   public java.util.Collection getInstances(  ) ;

}
