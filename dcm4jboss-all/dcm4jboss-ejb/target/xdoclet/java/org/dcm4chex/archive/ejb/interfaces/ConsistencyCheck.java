/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Remota para ConsistencyCheck.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface ConsistencyCheck
   extends javax.ejb.EJBObject
{
   /**
    * Return studies to check consistency.. <p> <DL> <DD>1) Find (0-<code>limit</code>) studies with a creation date between <code>createdAfter and createdBefore</code> and not checked before checkedAfter</DD> </DL>
    * @param createdAfter Timestamp: studies must be created after this timestamp.
    * @param createdBefore Timestamp: studies must be created before this timestamp.
    * @param checkedBefore Timestamp: studies must be checked before this timestamp.
    * @param limit Max number of returned studies.
    * @return int array with pk of studies to check.
    */
   public long[] findStudiesToCheck( java.sql.Timestamp createdAfter,java.sql.Timestamp createdBefore,java.sql.Timestamp checkedBefore,int limit )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

   public boolean updateStudy( long study_pk,int availabilityOfExternalRetrieveable )
      throws java.rmi.RemoteException;

}
