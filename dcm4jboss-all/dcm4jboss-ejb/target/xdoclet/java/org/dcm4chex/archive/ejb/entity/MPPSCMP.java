/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.entity;

/**
 * Camada CMP para MPPS.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public abstract class MPPSCMP
   extends org.dcm4chex.archive.ejb.entity.MPPSBean
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

   public abstract java.sql.Timestamp getCreatedTime() ;

   public abstract void setCreatedTime( java.sql.Timestamp createdTime ) ;

   public abstract java.sql.Timestamp getUpdatedTime() ;

   public abstract void setUpdatedTime( java.sql.Timestamp updatedTime ) ;

   public abstract java.lang.String getSopIuid() ;

   public abstract void setSopIuid( java.lang.String sopIuid ) ;

   public abstract java.sql.Timestamp getPpsStartDateTime() ;

   public abstract void setPpsStartDateTime( java.sql.Timestamp ppsStartDateTime ) ;

   public abstract java.lang.String getPerformedStationAET() ;

   public abstract void setPerformedStationAET( java.lang.String performedStationAET ) ;

   public abstract java.lang.String getModality() ;

   public abstract void setModality( java.lang.String modality ) ;

   public abstract java.lang.String getAccessionNumber() ;

   public abstract void setAccessionNumber( java.lang.String accessionNumber ) ;

   public abstract int getPpsStatusAsInt() ;

   public abstract void setPpsStatusAsInt( int ppsStatusAsInt ) ;

   public abstract byte[] getEncodedAttributes() ;

   public abstract void setEncodedAttributes( byte[] encodedAttributes ) ;

}
