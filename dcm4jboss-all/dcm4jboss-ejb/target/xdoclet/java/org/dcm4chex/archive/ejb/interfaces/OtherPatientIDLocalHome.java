/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para OtherPatientID.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface OtherPatientIDLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/OtherPatientIDLocal";
   public static final String JNDI_NAME="ejb/OtherPatientID";

   public org.dcm4chex.archive.ejb.interfaces.OtherPatientIDLocal create(java.lang.String pid , java.lang.String issuer)
      throws javax.ejb.CreateException;

   public java.util.Collection findByPatientId(java.lang.String pid)
      throws javax.ejb.FinderException;

   public java.util.Collection findByPatientIdLike(java.lang.String pid)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.OtherPatientIDLocal findByPatientIdAndIssuer(java.lang.String pid, java.lang.String issuer)
      throws javax.ejb.FinderException;

   public java.util.Collection findByPatientIdAndIssuerLike(java.lang.String pid, java.lang.String issuer)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.OtherPatientIDLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.OtherPatientIDLocal valueOf(java.lang.String pid , java.lang.String issuer) 
      ;

}
