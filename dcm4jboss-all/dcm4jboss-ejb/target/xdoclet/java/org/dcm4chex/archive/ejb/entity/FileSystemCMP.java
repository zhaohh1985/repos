/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.entity;

/**
 * Camada CMP para FileSystem.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public abstract class FileSystemCMP
   extends org.dcm4chex.archive.ejb.entity.FileSystemBean
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

   public void setEntityContext(javax.ejb.EntityContext ctx) throws javax.ejb.EJBException, java.rmi.RemoteException
   {
      super.setEntityContext(ctx);
   }

   public void unsetEntityContext() throws javax.ejb.EJBException, java.rmi.RemoteException
   {
      super.unsetEntityContext();
   }

   public void ejbRemove() throws javax.ejb.RemoveException
   {
      super.ejbRemove();

   }

   public abstract java.lang.Long getPk() ;

   public abstract void setPk( java.lang.Long pk ) ;

   public abstract java.lang.String getDirectoryPath() ;

   public abstract void setDirectoryPath( java.lang.String directoryPath ) ;

   public abstract java.lang.String getGroupID() ;

   public abstract void setGroupID( java.lang.String groupID ) ;

   public abstract java.lang.String getRetrieveAET() ;

   public abstract void setRetrieveAET( java.lang.String retrieveAET ) ;

   public abstract int getAvailability() ;

   public abstract void setAvailability( int availability ) ;

   public abstract int getStatus() ;

   public abstract void setStatus( int status ) ;

   public abstract java.lang.String getUserInfo() ;

   public abstract void setUserInfo( java.lang.String userInfo ) ;

}
