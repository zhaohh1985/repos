/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.entity;

/**
 * Camada CMP para PrivateStudy.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public abstract class PrivateStudyCMP
   extends org.dcm4chex.archive.ejb.entity.PrivateStudyBean
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

   public abstract int getPrivateType() ;

   public abstract void setPrivateType( int privateType ) ;

   public abstract byte[] getEncodedAttributes() ;

   public abstract void setEncodedAttributes( byte[] encodedAttributes ) ;

   public abstract java.lang.String getStudyIuid() ;

   public abstract void setStudyIuid( java.lang.String studyIuid ) ;

   public abstract java.lang.String getAccessionNumber() ;

   public abstract void setAccessionNumber( java.lang.String accessionNumber ) ;

}
