/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.entity;

/**
 * Camada CMP para PublishedStudy.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public abstract class PublishedStudyCMP
   extends org.dcm4chex.archive.ejb.entity.PublishedStudyBean
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

   public abstract java.sql.Timestamp getCreatedTime() ;

   public abstract void setCreatedTime( java.sql.Timestamp createdTime ) ;

   public abstract java.sql.Timestamp getUpdatedTime() ;

   public abstract void setUpdatedTime( java.sql.Timestamp updatedTime ) ;

   public abstract java.lang.String getDocumentUID() ;

   public abstract void setDocumentUID( java.lang.String documentUID ) ;

   public abstract java.lang.String getDocumentEntryUID() ;

   public abstract void setDocumentEntryUID( java.lang.String documentEntryUID ) ;

   public abstract java.lang.String getRepositoryUID() ;

   public abstract void setRepositoryUID( java.lang.String repositoryUID ) ;

   public abstract int getStatus() ;

   public abstract void setStatus( int status ) ;

}
