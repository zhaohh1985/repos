/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.entity;

/**
 * Camada CMP para MWLItem.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public abstract class MWLItemCMP
   extends org.dcm4chex.archive.ejb.entity.MWLItemBean
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

   public void unsetEntityContext() 
   {
   }

   public void ejbRemove() throws javax.ejb.RemoveException
   {
      super.ejbRemove();

   }

   public abstract java.lang.Long getPk() ;

   public abstract void setPk( java.lang.Long pk ) ;

   public abstract java.sql.Timestamp getCreatedTime() ;

   public abstract void setCreatedTime( java.sql.Timestamp createdTime ) ;

   public abstract java.sql.Timestamp getUpdatedTime() ;

   public abstract void setUpdatedTime( java.sql.Timestamp updatedTime ) ;

   public abstract java.lang.String getSpsId() ;

   public abstract void setSpsId( java.lang.String spsId ) ;

   public abstract java.sql.Timestamp getSpsStartDateTime() ;

   public abstract void setSpsStartDateTime( java.sql.Timestamp spsStartDateTime ) ;

   public abstract java.lang.String getScheduledStationAET() ;

   public abstract void setScheduledStationAET( java.lang.String scheduledStationAET ) ;

   public abstract java.lang.String getScheduledStationName() ;

   public abstract void setScheduledStationName( java.lang.String scheduledStationName ) ;

   public abstract java.lang.String getModality() ;

   public abstract void setModality( java.lang.String modality ) ;

   public abstract java.lang.String getPerformingPhysicianName() ;

   public abstract void setPerformingPhysicianName( java.lang.String performingPhysicianName ) ;

   public abstract java.lang.String getPerformingPhysicianFamilyNameSoundex() ;

   public abstract void setPerformingPhysicianFamilyNameSoundex( java.lang.String performingPhysicianFamilyNameSoundex ) ;

   public abstract java.lang.String getPerformingPhysicianGivenNameSoundex() ;

   public abstract void setPerformingPhysicianGivenNameSoundex( java.lang.String performingPhysicianGivenNameSoundex ) ;

   public abstract java.lang.String getPerformingPhysicianIdeographicName() ;

   public abstract void setPerformingPhysicianIdeographicName( java.lang.String performingPhysicianIdeographicName ) ;

   public abstract java.lang.String getPerformingPhysicianPhoneticName() ;

   public abstract void setPerformingPhysicianPhoneticName( java.lang.String performingPhysicianPhoneticName ) ;

   public abstract java.lang.String getRequestedProcedureId() ;

   public abstract void setRequestedProcedureId( java.lang.String requestedProcedureId ) ;

   public abstract java.lang.String getAccessionNumber() ;

   public abstract void setAccessionNumber( java.lang.String accessionNumber ) ;

   public abstract java.lang.String getStudyIuid() ;

   public abstract void setStudyIuid( java.lang.String studyIuid ) ;

   public abstract byte[] getEncodedAttributes() ;

   public abstract void setEncodedAttributes( byte[] encodedAttributes ) ;

   public abstract int getSpsStatusAsInt() ;

   public abstract void setSpsStatusAsInt( int spsStatusAsInt ) ;

}
