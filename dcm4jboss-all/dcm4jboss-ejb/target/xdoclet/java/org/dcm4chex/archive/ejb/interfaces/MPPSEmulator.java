/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Remota para MPPSEmulator.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface MPPSEmulator
   extends javax.ejb.EJBObject
{

   public java.util.Collection getStudiesWithMissingMPPS( java.lang.String sourceAET,long delay )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public org.dcm4che.data.Dataset[] generateMPPS( java.lang.Long studyPk,boolean ignoreReqAttrIfNoStudyAccNo )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

}
