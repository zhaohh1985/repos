/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para UPSReplacedPS.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface UPSReplacedPSLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/UPSReplacedPSLocal";
   public static final String JNDI_NAME="ejb/UPSReplacedPS";

   public org.dcm4chex.archive.ejb.interfaces.UPSReplacedPSLocal create(org.dcm4che.data.Dataset ds , org.dcm4chex.archive.ejb.interfaces.UPSLocal ups)
      throws javax.ejb.CreateException;

   public org.dcm4chex.archive.ejb.interfaces.UPSReplacedPSLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

}
