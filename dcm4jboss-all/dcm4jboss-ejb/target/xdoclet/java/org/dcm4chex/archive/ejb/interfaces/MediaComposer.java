/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Remota para MediaComposer.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface MediaComposer
   extends javax.ejb.EJBObject
{

   public java.util.Collection getStudiesReceivedBefore( long time )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public java.util.List assignStudyToMedia( org.dcm4chex.archive.ejb.interfaces.StudyLocal study,java.util.List mediaPool,long maxMediaSize,java.lang.String prefix )
      throws javax.ejb.FinderException, javax.ejb.CreateException, java.rmi.RemoteException;

   public java.util.List getCollectingMedia(  )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   /**
    * Returns a list of all media with the given media status. <p> The list contains a MediaDTO object for each media with the given status.
    * @param status The media status
    * @return A list of MediaDTO objects.
    */
   public java.util.List getWithStatus( int status )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   /**
    * Find media for given search params. <p> Add all founded media to the given collection.<br> This allows to fill a collection with sequential calls without clearing the collection.<br>
    * @param col The collection to store the result.
    * @param after 'created after' Timestamp in milliseconds
    * @param before 'created before' Timestamp in milliseconds
    * @param stati Media status (<code>null</code> to get all media for given time range)
    * @param offset Offset of the find result. (used for paging.
    * @param limit Max. number of results to return. (used for paging)
    * @param desc Sort order. if true descending, false ascending order.
    * @return The total number of search results.
    */
   public int findByCreatedTime( java.util.Collection col,java.lang.Long after,java.lang.Long before,int[] stati,java.lang.Integer offset,java.lang.Integer limit,boolean desc )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   /**
    * Find media for given search params. <p> Add all founded media to the given collection.<br> This allows to fill a collection with sequential calls without clearing the collection.<br>
    * @param col The collection to store the result.
    * @param after 'updated after' Timestamp in milliseconds
    * @param before 'updated before' Timestamp in milliseconds
    * @param stati Media status (<code>null</code> to get all media for given time range)
    * @param offset Offset of the find result. (used for paging.
    * @param limit Max. number of results to return. (used for paging)
    * @param desc Sort order. if true descending, false ascending order.
    * @return The total number of search results.
    */
   public int findByUpdatedTime( java.util.Collection col,java.lang.Long after,java.lang.Long before,int[] stati,java.lang.Integer offset,java.lang.Integer limit,boolean desc )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   /**
    * Set the media creation request IUID.
    * @param pk Primary key of media.
    * @param iuid Media creation request IUID to set.
    */
   public void setMediaCreationRequestIuid( long pk,java.lang.String iuid )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   /**
    * Set media staus and status info.
    * @param pk Primary key of media.
    * @param status Status to set.
    * @param info Status info to set.
    */
   public void setMediaStatus( long pk,int status,java.lang.String info )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   /**
    * Returns a collection of study IUIDs of a given media.
    * @param pk Primary key of the media.
    * @return Collection with study IUIDs.
    */
   public java.util.Collection getStudyUIDSForMedia( long pk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   /**
    * Returns a dataset for media creation request for given media. <p> <DL> <DT>Set following Tags in dataset.</DT> <DD>SpecificCharacterSet</DD> <DD>StorageMediaFileSetID</DD> <DD>StorageMediaFileSetUID</DD> <DD>RefSOPSeq with instances of the media.</DD> </DL>
    * @param pk Primary key of the media.
    * @return Prepared Dataset for media creation request.
    */
   public org.dcm4che.data.Dataset prepareMediaCreationRequest( long pk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   /**
    * Deletes a media. <p> Update derived fields from series and studies after media is successfully deleted.
    * @param mediaPk Primary key of the media.
    */
   public void deleteMedia( java.lang.Long mediaPk )
      throws javax.ejb.RemoveException, javax.ejb.FinderException, java.rmi.RemoteException;

   /**
    * Checks if all instances of a media are locally available (online). <p> Update derived fields from series and studies after media is successfully deleted.
    * @param mediaPk Primary key of the media.
    */
   public boolean checkInstancesAvailable( java.lang.Long mediaPk )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

}