/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Home Local para HPDefinition.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface HPDefinitionLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/HPDefinitionLocal";
   public static final String JNDI_NAME="ejb/HPDefinition";

   public org.dcm4chex.archive.ejb.interfaces.HPDefinitionLocal create(org.dcm4che.data.Dataset ds , org.dcm4chex.archive.ejb.interfaces.HPLocal hp)
      throws javax.ejb.CreateException;

   public org.dcm4chex.archive.ejb.interfaces.HPDefinitionLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

}
