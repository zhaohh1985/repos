/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para Storage.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface StorageLocal
   extends javax.ejb.EJBLocalObject
{

   public org.dcm4che.data.Dataset store( org.dcm4che.data.Dataset ds,java.lang.String currentCallingAET,long fspk,java.lang.String fileid,long size,byte[] md5,byte[] origMd5,int fileStatus,boolean updateStudyAccessTime,boolean clearExternalRetrieveAET,boolean dontChangeReceivedStatus,org.dcm4chex.archive.common.PatientMatching matching ) throws org.dcm4che.net.DcmServiceException, org.dcm4chex.archive.exceptions.NonUniquePatientIDException;

   public org.dcm4che.data.Dataset store( org.dcm4che.data.Dataset ds,java.lang.String currentCallingAET,long fspk,java.lang.String fileid,long size,byte[] md5,byte[] origMd5,int fileStatus,boolean updateStudyAccessTime,boolean clearExternalRetrieveAET,boolean dontChangeReceivedStatus,org.dcm4chex.archive.common.PatientMatching matching,boolean canRollback ) throws org.dcm4che.net.DcmServiceException, org.dcm4chex.archive.exceptions.NonUniquePatientIDException;

   public java.util.Collection getDuplicateFiles( org.dcm4chex.archive.ejb.interfaces.FileDTO dto ) throws javax.ejb.FinderException;

   public org.dcm4chex.archive.common.SeriesStored makeSeriesStored( java.lang.String seriuid ) throws javax.ejb.FinderException;

   public void commitSeriesStored( org.dcm4chex.archive.common.SeriesStored seriesStored ) throws javax.ejb.FinderException;

   public java.util.Collection getPksOfPendingSeries( java.sql.Timestamp updatedBefore ) throws javax.ejb.FinderException;

   public java.util.Collection getPksOfPendingSeries( java.util.Map delays ) throws javax.ejb.FinderException;

   public org.dcm4chex.archive.common.SeriesStored makeSeriesStored( java.lang.Long seriesPk,java.sql.Timestamp updatedBefore ) throws javax.ejb.FinderException;

   public void updateDerivedStudyAndSeriesFields( java.lang.String seriuid ) throws javax.ejb.FinderException;

   public void storeFile( java.lang.String iuid,java.lang.String tsuid,java.lang.String dirpath,java.lang.String fileid,int size,byte[] md5,byte[] origMd5,int status ) throws javax.ejb.CreateException, javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.PatientLocal createPatient( org.dcm4che.data.Dataset ds ) throws javax.ejb.CreateException;

   public void deletePatient( org.dcm4chex.archive.ejb.interfaces.PatientLocal pat ) throws javax.ejb.RemoveException;

   public void commit( java.lang.String iuid ) throws javax.ejb.FinderException;

   public void commited( org.dcm4che.data.Dataset stgCmtResult ) throws javax.ejb.FinderException;

   public int numberOfStudyRelatedInstances( java.lang.String iuid ) ;

   public boolean studyExists( java.lang.String iuid ) ;

   public boolean instanceExists( java.lang.String iuid ) ;

   public void deleteInstances( java.lang.String[] iuids,boolean deleteSeries,boolean deleteStudy ) throws javax.ejb.FinderException, javax.ejb.EJBException, javax.ejb.RemoveException;

   public void removeFromSeriesPkCache( java.lang.String uid ) ;

   public org.dcm4che.data.Dataset getPatientByIDWithIssuer( java.lang.String pid,java.lang.String issuer ) throws javax.ejb.FinderException;

   public java.util.List getSopIuidsForRejectionNote( org.dcm4che.data.Dataset rejNote,java.lang.String srcAet ) throws javax.ejb.FinderException;

}
