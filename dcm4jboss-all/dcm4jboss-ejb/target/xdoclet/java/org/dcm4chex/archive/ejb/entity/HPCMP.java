/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.entity;

/**
 * Camada CMP para HP.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public abstract class HPCMP
   extends org.dcm4chex.archive.ejb.entity.HPBean
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
      super.setEntityContext(ctx);
   }

   public void unsetEntityContext() 
   {
      super.unsetEntityContext();
   }

   public void ejbRemove() throws javax.ejb.RemoveException
   {
      super.ejbRemove();

   }

   public abstract java.lang.Long getPk() ;

   public abstract void setPk( java.lang.Long pk ) ;

   public abstract java.lang.String getSopIuid() ;

   public abstract void setSopIuid( java.lang.String sopIuid ) ;

   public abstract java.lang.String getSopCuid() ;

   public abstract void setSopCuid( java.lang.String sopCuid ) ;

   public abstract java.lang.String getHangingProtocolName() ;

   public abstract void setHangingProtocolName( java.lang.String hangingProtocolName ) ;

   public abstract int getHangingProtocolLevelAsInt() ;

   public abstract void setHangingProtocolLevelAsInt( int hangingProtocolLevelAsInt ) ;

   public abstract int getNumberOfPriorsReferenced() ;

   public abstract void setNumberOfPriorsReferenced( int numberOfPriorsReferenced ) ;

   public abstract java.lang.String getHangingProtocolUserGroupName() ;

   public abstract void setHangingProtocolUserGroupName( java.lang.String hangingProtocolUserGroupName ) ;

   public abstract int getNumberOfScreens() ;

   public abstract void setNumberOfScreens( int numberOfScreens ) ;

   public abstract byte[] getEncodedAttributes() ;

   public abstract void setEncodedAttributes( byte[] encodedAttributes ) ;

}
