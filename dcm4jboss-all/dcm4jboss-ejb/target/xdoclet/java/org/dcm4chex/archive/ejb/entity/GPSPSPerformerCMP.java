/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.entity;

/**
 * Camada CMP para GPSPSPerformer.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public abstract class GPSPSPerformerCMP
   extends org.dcm4chex.archive.ejb.entity.GPSPSPerformerBean
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

   public abstract java.lang.String getHumanPerformerName() ;

   public abstract void setHumanPerformerName( java.lang.String humanPerformerName ) ;

   public abstract java.lang.String getHumanPerformerFamilyNameSoundex() ;

   public abstract void setHumanPerformerFamilyNameSoundex( java.lang.String humanPerformerFamilyNameSoundex ) ;

   public abstract java.lang.String getHumanPerformerGivenNameSoundex() ;

   public abstract void setHumanPerformerGivenNameSoundex( java.lang.String humanPerformerGivenNameSoundex ) ;

   public abstract java.lang.String getHumanPerformerIdeographicName() ;

   public abstract void setHumanPerformerIdeographicName( java.lang.String humanPerformerIdeographicName ) ;

   public abstract java.lang.String getHumanPerformerPhoneticName() ;

   public abstract void setHumanPerformerPhoneticName( java.lang.String humanPerformerPhoneticName ) ;

}
