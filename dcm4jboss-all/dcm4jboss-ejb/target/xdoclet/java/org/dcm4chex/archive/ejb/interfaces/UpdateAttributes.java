/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Remota para UpdateAttributes.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface UpdateAttributes
   extends javax.ejb.EJBObject
{

   public java.util.Collection seriesIuidsForAttributesUpdate( int availability,java.lang.String modality,java.lang.String srcAET,java.sql.Timestamp updatedAfter,java.sql.Timestamp updatedBefore,int offset,int limit )
      throws java.rmi.RemoteException;

   public int countSeriesForAttributesUpdate( int availability,java.lang.String modality,java.lang.String srcAET,java.sql.Timestamp updatedAfter,java.sql.Timestamp updatedBefore )
      throws java.rmi.RemoteException;

   public void updateInstanceAttributes( org.dcm4che.data.Dataset ds )
      throws java.rmi.RemoteException;

   public void updatePatientStudySeriesAttributes( org.dcm4che.data.Dataset ds )
      throws java.rmi.RemoteException;

}
