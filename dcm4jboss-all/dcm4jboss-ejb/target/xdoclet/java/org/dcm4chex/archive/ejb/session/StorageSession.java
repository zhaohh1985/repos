/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.session;

/**
 * Camada Session para Storage.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public class StorageSession
   extends org.dcm4chex.archive.ejb.session.StorageBean
   implements javax.ejb.SessionBean
{
   public void ejbActivate() 
   {

   }

   public void ejbPassivate() 
   {
   }

   public void setSessionContext(javax.ejb.SessionContext ctx) 
   {
      javax.naming.Context namingCtx = null;
      try 
      {
         namingCtx = new javax.naming.InitialContext();
         contentEdit = (org.dcm4chex.archive.ejb.interfaces.ContentEditLocalHome) namingCtx.lookup("java:comp/env/ejb/ContentEdit");       
      } 
      catch(javax.naming.NamingException e) 
      {
	     throw new javax.ejb.EJBException("lookup failed", e);
      }
      finally {
         if (namingCtx != null) 
         {
            try 
            {
               namingCtx.close(); 
            }
            catch(javax.naming.NamingException e) 
            {
               e.printStackTrace();
            }			
         }
      }
      super.setSessionContext(ctx);
   }

   public void unsetSessionContext() 
   {
      super.unsetSessionContext();
   }

   public void ejbRemove() 
   {
   }

   public void ejbCreate() throws javax.ejb.CreateException
   {
   }

   private  org.dcm4chex.archive.ejb.interfaces.ContentEditLocalHome contentEdit;
   protected org.dcm4chex.archive.ejb.interfaces.ContentEditLocal contentEdit()
   {
      try 
      {
          return contentEdit.create();
      } 
      catch(javax.ejb.CreateException e) 
      {
          throw new javax.ejb.EJBException("create failed", e);
      }
   }

}
