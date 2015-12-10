/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para MWLItem.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface MWLItemLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/MWLItemLocal";
   public static final String JNDI_NAME="ejb/MWLItem";

   public org.dcm4chex.archive.ejb.interfaces.MWLItemLocal create(org.dcm4che.data.Dataset ds , org.dcm4chex.archive.ejb.interfaces.PatientLocal patient)
      throws javax.ejb.CreateException;

   public java.util.Collection findAll()
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.MWLItemLocal findByRpIdAndSpsId(java.lang.String rpid, java.lang.String spsid)
      throws javax.ejb.FinderException;

   public java.util.Collection findByStudyIuid(java.lang.String suid)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.MWLItemLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

}