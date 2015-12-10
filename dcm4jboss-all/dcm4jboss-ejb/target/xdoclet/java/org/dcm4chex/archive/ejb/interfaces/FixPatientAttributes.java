/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Remota para FixPatientAttributes.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface FixPatientAttributes
   extends javax.ejb.EJBObject
{
   /**
    * Check patient attributes. <p>
    * @param offset first patient to check (paging)
    * @param limit number of patients to check (paging)
    * @param doUpdate true will update patient record, false leave patient record unchanged.
    * @return int[2] containing number of 'fixed/toBeFixed' patient records and number of checked patient records
    * @throws FinderException
    */
   public int[] checkPatientAttributes( int offset,int limit,boolean doUpdate )
      throws javax.ejb.FinderException, java.rmi.RemoteException;

}
