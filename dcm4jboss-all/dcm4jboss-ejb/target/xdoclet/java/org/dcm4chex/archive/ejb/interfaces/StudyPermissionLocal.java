/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para StudyPermission.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface StudyPermissionLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Auto-generated Primary Key
    */
   public java.lang.Long getPk(  ) ;

   public java.lang.String getStudyIuid(  ) ;

   public java.lang.String getAction(  ) ;

   public java.lang.String getRole(  ) ;

   public org.dcm4chex.archive.ejb.interfaces.StudyPermissionDTO toDTO(  ) ;

}
