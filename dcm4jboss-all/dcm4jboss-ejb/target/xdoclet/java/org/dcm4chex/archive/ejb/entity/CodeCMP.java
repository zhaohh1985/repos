/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.entity;

/**
 * Camada CMP para Code.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public abstract class CodeCMP
   extends org.dcm4chex.archive.ejb.entity.CodeBean
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
      super.ejbRemove();

   }

   public abstract java.lang.Long getPk() ;

   public abstract void setPk( java.lang.Long pk ) ;

   public abstract java.lang.String getCodeValue() ;

   public abstract void setCodeValue( java.lang.String codeValue ) ;

   public abstract java.lang.String getCodingSchemeDesignator() ;

   public abstract void setCodingSchemeDesignator( java.lang.String codingSchemeDesignator ) ;

   public abstract java.lang.String getCodingSchemeVersion() ;

   public abstract void setCodingSchemeVersion( java.lang.String codingSchemeVersion ) ;

   public abstract java.lang.String getCodeMeaning() ;

   public abstract void setCodeMeaning( java.lang.String codeMeaning ) ;

}
