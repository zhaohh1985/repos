/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para HP.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface HPLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Auto-generated Primary Key
    */
   public java.lang.Long getPk(  ) ;

   public java.lang.String getSopIuid(  ) ;

   public java.lang.String getSopCuid(  ) ;

   public java.lang.String getHangingProtocolName(  ) ;

   public int getHangingProtocolLevelAsInt(  ) ;

   public java.lang.String getHangingProtocolLevel(  ) ;

   public int getNumberOfPriorsReferenced(  ) ;

   public java.lang.String getHangingProtocolUserGroupName(  ) ;

   public int getNumberOfScreens(  ) ;

   public org.dcm4che.data.Dataset getAttributes(  ) ;

   public void setAttributes( org.dcm4che.data.Dataset ds ) ;

}
