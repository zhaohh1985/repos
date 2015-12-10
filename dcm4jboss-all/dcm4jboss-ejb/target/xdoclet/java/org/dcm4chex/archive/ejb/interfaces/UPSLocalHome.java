/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para UPS.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface UPSLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/UPSLocal";
   public static final String JNDI_NAME="ejb/UPS";

   public org.dcm4chex.archive.ejb.interfaces.UPSLocal create(org.dcm4che.data.Dataset ds , org.dcm4chex.archive.ejb.interfaces.PatientLocal patient)
      throws javax.ejb.CreateException;

   public org.dcm4chex.archive.ejb.interfaces.UPSLocal findBySopInstanceUID(java.lang.String uid)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.UPSLocal findByStateAndRequestedProcedureIdAndWorkItemCode(int state, java.lang.String rpid, java.lang.String codeValue, java.lang.String codingSchemeDesignator, java.lang.String codingSchemeVersion)
      throws javax.ejb.FinderException;

   public java.util.Collection findByStateAndRequestedProcedureIdAndWorkItemCode(int state, java.lang.String rpid, java.lang.String codeValue, java.lang.String codingSchemeDesignator)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.UPSLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

   public java.util.Collection getNotSubscribed(java.lang.String aet) 
      throws javax.ejb.FinderException;

}
