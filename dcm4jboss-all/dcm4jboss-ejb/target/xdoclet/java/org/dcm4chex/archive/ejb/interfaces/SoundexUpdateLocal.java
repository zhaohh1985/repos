/*
 * Gerado pelo XDoclet - N�o edite!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Interface Local para SoundexUpdate.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.19.0-SNAPSHOT
 */
public interface SoundexUpdateLocal
   extends javax.ejb.EJBLocalObject
{

   public int updatePatientNameSoundex(  ) ;

   public void updatePatientNameSoundex( org.dcm4chex.archive.ejb.interfaces.PatientLocal pat ) ;

   public int updateReferringPhysicianNameSoundex(  ) ;

   public void updateReferringPhysicianNameSoundex( org.dcm4chex.archive.ejb.interfaces.StudyLocal study ) ;

   public int updatePerformingPhysicianNameSoundex(  ) ;

   public void updatePerformingPhysicianNameSoundex( org.dcm4chex.archive.ejb.interfaces.SeriesLocal series ) ;

   public int updateRequestingPhysicianNameSoundex(  ) ;

   public void updateRequestingPhysicianNameSoundex( org.dcm4chex.archive.ejb.interfaces.SeriesRequestLocal seriesRequest ) ;

   public int updateVerifyingObserverNameSoundex(  ) ;

   public void updateVerifyingObserverNameSoundex( org.dcm4chex.archive.ejb.interfaces.VerifyingObserverLocal observer ) ;

   public int updateMWLPerformingPhysicianNameSoundex(  ) ;

   public void updateMWLPerformingPhysicianNameSoundex( org.dcm4chex.archive.ejb.interfaces.MWLItemLocal mwlitem ) ;

   public int updateGPSPSHumanPerformerNameSoundex(  ) ;

   public void updateGPSPSPerformerNameSoundex( org.dcm4chex.archive.ejb.interfaces.GPSPSPerformerLocal performer ) ;

}