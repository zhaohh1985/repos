/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.entity;

/**
 * Camada CMP para PrivatePatient.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public abstract class PrivatePatientCMP
   extends org.dcm4chex.archive.ejb.entity.PrivatePatientBean
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

   public abstract java.lang.String getPatientId() ;

   public abstract void setPatientId( java.lang.String patientId ) ;

   public abstract java.lang.String getIssuerOfPatientId() ;

   public abstract void setIssuerOfPatientId( java.lang.String issuerOfPatientId ) ;

   public abstract java.lang.String getPatientName() ;

   public abstract void setPatientName( java.lang.String patientName ) ;

   public abstract byte[] getEncodedAttributes() ;

   public abstract void setEncodedAttributes( byte[] encodedAttributes ) ;

}
