/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.entity;

/**
 * Camada CMP para Device.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public abstract class DeviceCMP
   extends org.dcm4chex.archive.ejb.entity.DeviceBean
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

   public abstract java.lang.String getStationName() ;

   public abstract void setStationName( java.lang.String stationName ) ;

   public abstract java.lang.String getStationAET() ;

   public abstract void setStationAET( java.lang.String stationAET ) ;

   public abstract java.lang.String getModality() ;

   public abstract void setModality( java.lang.String modality ) ;

}
