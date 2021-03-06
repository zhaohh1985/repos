/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Remota para FileSystemMgt2.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface FileSystemMgt2
   extends javax.ejb.EJBObject
{

   public org.dcm4chex.archive.ejb.interfaces.FileSystemDTO addFileSystem( org.dcm4chex.archive.ejb.interfaces.FileSystemDTO dto )
      throws javax.ejb.CreateException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileSystemDTO removeFileSystem( java.lang.String groupID,java.lang.String dirPath )
      throws javax.ejb.FinderException, javax.ejb.RemoveException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileSystemDTO getFileSystem( long pk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileSystemDTO getFileSystem( java.lang.String path )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileSystemDTO getFileSystemOfGroup( java.lang.String groupID,java.lang.String path )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileSystemDTO[] getAllFileSystems(  )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileSystemDTO[] getFileSystemsOfGroup( java.lang.String groupId )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileSystemDTO[] getRWFileSystemsOfGroup( java.lang.String groupId )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileSystemDTO getDefRWFileSystemsOfGroup( java.lang.String groupId )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileSystemDTO updateFileSystemStatus( long pk,int status )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileSystemDTO updateFileSystemStatus( java.lang.String groupID,java.lang.String dirPath,int status )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileSystemDTO updateFileSystemRetrieveAET( java.lang.String groupID,java.lang.String dirPath,java.lang.String retrieveAET,int limit )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public int updateFileSystemRetrieveAET( java.lang.String oldAET,java.lang.String newAET,int limit )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileSystemDTO updateAvailabilityForStudyOnFileSystem( java.lang.String groupID,java.lang.String dirPath,int availabilityOfExtRetr,int batchsize )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public boolean updateFileSystemAvailability( java.lang.String groupID,java.lang.String dirPath,int availability )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileSystemDTO linkFileSystems( java.lang.String groupID,java.lang.String dirPath,java.lang.String next )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileSystemDTO addAndLinkFileSystem( org.dcm4chex.archive.ejb.interfaces.FileSystemDTO dto )
      throws javax.ejb.FinderException, javax.ejb.CreateException, java.rmi.RemoteException;

   public long sizeOfFilesCreatedAfter( long pk,long after )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public java.sql.Timestamp minCreatedTimeOnFsWithFileStatus( java.util.List dirPath,int status )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public long getStudySize( org.dcm4chex.archive.common.DeleteStudyOrder order )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public boolean markStudyOnFSRecordForDeletion( org.dcm4chex.archive.common.DeleteStudyOrder order,boolean b )
      throws javax.ejb.RemoveException, javax.ejb.FinderException, java.rmi.RemoteException;

   public boolean removeStudyOnFSRecord( org.dcm4chex.archive.common.DeleteStudyOrder order )
      throws javax.ejb.RemoveException, java.rmi.RemoteException;

   public void createStudyOnFSRecord( org.dcm4chex.archive.common.DeleteStudyOrder order )
      throws javax.ejb.CreateException, javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4chex.archive.common.DeleteStudyOrdersAndMaxAccessTime createDeleteOrdersForStudiesOnFSGroup( java.lang.String fsGroup,long minAccessTime,long maxAccessTime,int limit,boolean externalRetrieveable,boolean storageNotCommited,boolean copyOnMedia,java.lang.String copyOnFSGroup,boolean copyArchived,boolean copyOnReadOnlyFS )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public java.util.Collection createDeleteOrdersForStudyOnFSGroup( java.lang.String suid,java.lang.String fsGroup )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public java.util.Collection createIANforStudy( java.lang.Long studyPk )
      throws javax.ejb.FinderException, org.dcm4chex.archive.exceptions.NoSuchStudyException, java.rmi.RemoteException;

   public org.dcm4chex.archive.common.IANAndPatientID createIANforStudy( java.lang.String uid )
      throws javax.ejb.FinderException, org.dcm4chex.archive.exceptions.NoSuchStudyException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset createIANforSeries( java.lang.Long seriesPk )
      throws javax.ejb.FinderException, org.dcm4chex.archive.exceptions.NoSuchSeriesException, java.rmi.RemoteException;

   public org.dcm4chex.archive.common.IANAndPatientID createIANforSeries( java.lang.String uid )
      throws javax.ejb.FinderException, org.dcm4chex.archive.exceptions.NoSuchSeriesException, java.rmi.RemoteException;

   public java.util.Collection deleteStudy( org.dcm4chex.archive.common.DeleteStudyOrder order,boolean delStudyFromDB,boolean delPatientWithoutObjects )
      throws org.dcm4chex.archive.exceptions.ConcurrentStudyStorageException, javax.ejb.CreateException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileDTO[][] getFilesOfStudy( org.dcm4chex.archive.common.DeleteStudyOrder order )
      throws org.dcm4chex.archive.exceptions.ConcurrentStudyStorageException, java.rmi.RemoteException;

   /**
    * Move File to another filesystem and/or path
    * @param order
    * @param dtos FileDTO with parameter of the destination file (filesystemPk and filePath). Pk is of file to move:
    * @param destFileStatus File status of destination file. Null means: do not change!
    * @param keepSrcFiles
    * @param keepMovedFilesOnError If set return a list of failed files instead of rollback and fail the whole order.
    * @return null or List of failed files
    * @throws ConcurrentStudyStorageException
    */
   public java.util.List moveFiles( org.dcm4chex.archive.common.DeleteStudyOrder order,org.dcm4chex.archive.ejb.interfaces.FileDTO[][] dtos,java.lang.Integer destFileStatus,boolean keepSrcFiles,boolean keepMovedFilesOnError )
      throws org.dcm4chex.archive.exceptions.ConcurrentStudyStorageException, java.rmi.RemoteException;

   public java.util.Collection getSeriesPks( org.dcm4chex.archive.common.DeleteStudyOrder order )
      throws org.dcm4chex.archive.exceptions.ConcurrentStudyStorageException, java.rmi.RemoteException;

   public java.util.Collection deleteSeries( org.dcm4chex.archive.common.DeleteStudyOrder order,java.lang.Long seriesPk,boolean delStudyFromDB,boolean delPatientWithoutObjects )
      throws org.dcm4chex.archive.exceptions.ConcurrentStudyStorageException, javax.ejb.CreateException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileDTO[] findFilesToCompress( org.dcm4chex.archive.ejb.interfaces.FileSystemDTO fsDTO,java.lang.String cuid,java.sql.Timestamp before,int limit )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileDTO[] findFilesForMD5Check( java.lang.String dirPath,java.sql.Timestamp before,int limit )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileDTO[] findFilesByStatusAndFileSystem( java.util.List dirPath,int status,java.sql.Timestamp notBefore,java.sql.Timestamp before,int limit )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public int migrateFilesOfTarFile( java.lang.String fsId,java.lang.String tarFilename,java.lang.String newFsId,java.lang.String newTarFilename,int newFileStatus )
      throws javax.ejb.FinderException, javax.ejb.CreateException, java.rmi.RemoteException;

   public void setFilestatusOfFilesOfTarFile( java.lang.String fsId,java.lang.String tarFilename,int fileStatus )
      throws javax.ejb.FinderException, javax.ejb.CreateException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileDTO[] getFilesOfTarFile( java.lang.String fsId,java.lang.String tarFilename )
      throws javax.ejb.FinderException, javax.ejb.CreateException, java.rmi.RemoteException;

   public void updateTimeOfLastMd5Check( long pk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public void replaceFile( long pk,java.lang.String path,java.lang.String tsuid,long size,byte[] md5,int status )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public void replaceFileAndCoerceAttributes( long fspk,long pk,java.lang.String path,java.lang.String tsuid,long size,byte[] md5,int status,org.dcm4che.data.Dataset ds )
      throws java.rmi.RemoteException;

   public void setFileStatus( long pk,int status,java.util.List archiveFileSystems )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public void setFileStatus( long pk,int status )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileDTO[] getOrphanedPrivateFilesOnFSGroup( java.lang.String groupID,int limit )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public void deletePrivateFile( long file_pk )
      throws javax.ejb.RemoveException, java.rmi.RemoteException;

   public void touchStudyOnFileSystem( java.lang.String siud,java.lang.String dirPath )
      throws javax.ejb.FinderException, javax.ejb.CreateException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileDTO[] deleteStoredSeries( org.dcm4chex.archive.common.SeriesStored seriesStored )
      throws java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileDTO[] getFilesOfInstance( java.lang.String iuid )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public java.lang.String getExternalRetrieveAET( java.lang.String iuid )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileDTO[] findFilesToLossyCompress( java.lang.String fsGroupID,java.lang.String cuid,java.lang.String bodyPart,java.lang.String srcAET,java.sql.Timestamp before,int limit )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileDTO[] findFilesToLossyCompressWithExternalRetrieveAET( java.lang.String fsGroupID,java.lang.String retrieveAET,java.lang.String cuid,java.lang.String bodyPart,java.lang.String srcAET,java.sql.Timestamp before,int limit )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4chex.archive.ejb.interfaces.FileDTO[] findFilesToLossyCompressWithCopyOnOtherFileSystemGroup( java.lang.String fsGroupID,java.lang.String otherFSGroupID,java.lang.String cuid,java.lang.String bodyPart,java.lang.String srcAET,java.sql.Timestamp before,int limit )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public int syncArchivedFlag( java.lang.String fsPath,int limit )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public int deleteFilesOfInvalidTarFile( java.lang.String fsId,java.lang.String tarFilename )
      throws javax.ejb.FinderException, javax.ejb.RemoveException, java.rmi.RemoteException;

   public boolean deleteFileOnTarFs( java.lang.String fsId,long filePk )
      throws java.rmi.RemoteException;

   public void setFileTransfersyntax( long filePk,java.lang.String newTS )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

}
