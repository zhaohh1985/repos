/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para PrivateStudy.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface PrivateStudyLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Auto-generated Primary Key
    */
   public java.lang.Long getPk(  ) ;

   public int getPrivateType(  ) ;

   public java.lang.String getStudyIuid(  ) ;

   public java.lang.String getAccessionNumber(  ) ;

   public org.dcm4che.data.Dataset getAttributes(  ) ;

   public void setAttributes( org.dcm4che.data.Dataset ds ) ;

   public org.dcm4chex.archive.ejb.interfaces.PrivatePatientLocal getPatient(  ) ;

   public java.util.Collection getSeries(  ) ;

   public int getNumberOfStudyRelatedInstances(  ) ;

}
