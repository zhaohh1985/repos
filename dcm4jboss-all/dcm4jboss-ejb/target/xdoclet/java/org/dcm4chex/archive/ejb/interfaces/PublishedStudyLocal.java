/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para PublishedStudy.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface PublishedStudyLocal
   extends javax.ejb.EJBLocalObject
{

   public java.lang.Long getPk(  ) ;

   public java.sql.Timestamp getCreatedTime(  ) ;

   public java.sql.Timestamp getUpdatedTime(  ) ;

   public void setUpdatedTime( java.sql.Timestamp time ) ;

   public org.dcm4chex.archive.ejb.interfaces.StudyLocal getStudy(  ) ;

   public void setStudy( org.dcm4chex.archive.ejb.interfaces.StudyLocal study ) ;

   public java.lang.String getDocumentUID(  ) ;

   public void setDocumentUID( java.lang.String uid ) ;

   public java.lang.String getDocumentEntryUID(  ) ;

   public void setDocumentEntryUID( java.lang.String uid ) ;

   public java.lang.String getRepositoryUID(  ) ;

   public void setRepositoryUID( java.lang.String uid ) ;

   public int getStatus(  ) ;

   public void setStatus( int status ) ;

   public java.lang.String asString(  ) ;

}
