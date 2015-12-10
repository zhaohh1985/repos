/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Remota para MPPSManager.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface MPPSManager
   extends javax.ejb.EJBObject
{

   public void createMPPS( org.dcm4che.data.Dataset ds,org.dcm4chex.archive.common.PatientMatching matching )
      throws org.dcm4che.net.DcmServiceException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset getMPPS( java.lang.String iuid )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public void updateMPPS( org.dcm4che.data.Dataset ds )
      throws org.dcm4che.net.DcmServiceException, java.rmi.RemoteException;

   /**
    * Delete a list of mpps entries.
    */
   public org.dcm4che.data.Dataset[] deleteMPPSEntries( java.lang.String[] iuids )
      throws java.rmi.RemoteException;

   public org.dcm4che.data.Dataset createIANwithPatSummaryAndStudyID( java.lang.String mppsiuid,java.lang.String seriesStoredIuid )
      throws java.rmi.RemoteException;

   /**
    * Links a mpps to a mwl entry (LOCAL). <p> This method can be used if MWL entry is locally available. <p> Sets SpsID and AccessionNumber from mwl entry. <P> Returns a Map with following key/value pairs. <dl> <dt>mppsAttrs: (Dataset)</dt> <dd> Attributes of mpps entry. (for notification)</dd> <dt>mwlPat: (Dataset)</dt> <dd> Patient of MWL entry.</dd> <dd> (The dominant patient of patient merge).</dd> <dt>mppsPat: (Dataset)</dt> <dd> Patient of MPPS entry.</dd> <dd> (The merged patient).</dd> </dl>
    * @param mwlPk pk to select MWL entry
    * @param mppsIUID Instance UID of mpps.
    * @return A map with mpps attributes and patient attributes to merge.
    */
   public java.util.Map linkMppsToMwl( java.lang.String rpid,java.lang.String spsid,java.lang.String mppsIUID )
      throws org.dcm4che.net.DcmServiceException, java.rmi.RemoteException;

   /**
    * Links a mpps to a mwl entry (external). <p> This Method can be used to link a MPPS entry with an MWL entry from an external Modality Worklist. <p> Sets SpsID and AccessionNumber from mwlDs. <P> Returns a Map with following key/value pairs. <dl> <dt>mppsAttrs: (Dataset)</dt> <dd> Attributes of mpps entry. (for notification)</dd> <dt>mwlPat: (Dataset)</dt> <dd> Patient of MWL entry.</dd> <dd> (The dominant patient of patient merge).</dd> <dt>mppsPat: (Dataset)</dt> <dd> Patient of MPPS entry.</dd> <dd> (The merged patient).</dd> </dl>
    * @param mwlDs Datset of MWL entry
    * @param mppsIUID Instance UID of mpps.
    * @return A map with mpps attributes and patient attributes to merge.
    * @throws FinderException
    * @throws CreateException
    */
   public java.util.Map linkMppsToMwl( org.dcm4che.data.Dataset mwlAttrs,java.lang.String mppsIUID )
      throws org.dcm4che.net.DcmServiceException, javax.ejb.FinderException, javax.ejb.CreateException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset unlinkMpps( java.lang.String mppsIUID )
      throws javax.ejb.FinderException, javax.ejb.CreateException, java.rmi.RemoteException;

   public void removeRequestAttributesInSeries( org.dcm4che.data.Dataset mwlAttrs,java.util.Collection seriesIuids )
      throws javax.ejb.CreateException, javax.ejb.FinderException, java.rmi.RemoteException;

   public java.util.Collection getSeriesIUIDs( java.lang.String mppsIUID )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public java.util.Collection getSeriesAndStudyDS( java.lang.String mppsIUID )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   /**
    * Returns a StudyMgt Dataset.
    */
   public org.dcm4che.data.Dataset updateSeriesAndStudy( java.util.Collection seriesDS )
      throws javax.ejb.FinderException, javax.ejb.CreateException, java.rmi.RemoteException;

   public void updateSeriesAttributes( java.lang.String uid,org.dcm4che.data.Dataset newAttrs,boolean updateStudyAttributes )
      throws java.rmi.RemoteException;

   /**
    * Update Scheduled Step Attributes on receive of ORM^O01 message AFTER acquisition and storage of objects
    * @param matching
    * @throws PatientMismatchException
    */
   public java.util.List[] updateScheduledStepAttributes( org.dcm4che.data.Dataset mwlitem,org.dcm4chex.archive.common.PatientMatching matching,boolean updateDifferentPatientOfExistingStudy )
      throws org.dcm4chex.archive.exceptions.PatientMismatchException, java.rmi.RemoteException;

}
