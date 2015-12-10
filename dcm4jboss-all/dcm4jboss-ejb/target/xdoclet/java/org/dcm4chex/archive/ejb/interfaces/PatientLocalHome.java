/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para Patient.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface PatientLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/PatientLocal";
   public static final String JNDI_NAME="ejb/Patient";

   public org.dcm4chex.archive.ejb.interfaces.PatientLocal create(org.dcm4che.data.Dataset ds)
      throws javax.ejb.CreateException;

   public java.util.Collection findAll()
      throws javax.ejb.FinderException;

   public java.util.Collection findAll(int offset, int limit)
      throws javax.ejb.FinderException;

   public java.util.Collection findByPatientId(java.lang.String pid)
      throws javax.ejb.FinderException;

   public java.util.Collection findByPatientIdLike(java.lang.String pid)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.PatientLocal findByPatientIdWithIssuer(java.lang.String pid, java.lang.String issuer)
      throws javax.ejb.FinderException;

   public java.util.Collection findByPatientIdWithIssuerLike(java.lang.String pid, java.lang.String issuer)
      throws javax.ejb.FinderException;

   public java.util.Collection findByPatientName(java.lang.String pn)
      throws javax.ejb.FinderException;

   public java.util.Collection findCorresponding(java.lang.String pid, java.lang.String issuer)
      throws javax.ejb.FinderException;

   public java.util.Collection findCorrespondingLike(java.lang.String pid, java.lang.String issuer)
      throws javax.ejb.FinderException;

   public java.util.Collection findCorrespondingByPrimaryPatientID(java.lang.String pid, java.lang.String issuer)
      throws javax.ejb.FinderException;

   public java.util.Collection findCorrespondingByPrimaryPatientIDLike(java.lang.String pid, java.lang.String issuer)
      throws javax.ejb.FinderException;

   public java.util.Collection findCorrespondingByOtherPatientID(java.lang.String pid, java.lang.String issuer)
      throws javax.ejb.FinderException;

   public java.util.Collection findCorrespondingByOtherPatientIDLike(java.lang.String pid, java.lang.String issuer)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.PatientLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.PatientLocal selectPatient(java.lang.String pid , java.lang.String issuer) 
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.PatientLocal selectPatient(org.dcm4che.data.Dataset ds , org.dcm4chex.archive.common.PatientMatching matching , boolean followMerged) 
      throws javax.ejb.FinderException;

}
