/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is part of dcm4che, an implementation of DICOM(TM) in
 * Java(TM), hosted at http://sourceforge.net/projects/dcm4che.
 *
 * The Initial Developer of the Original Code is
 * Agfa-Gevaert AG.
 * Portions created by the Initial Developer are Copyright (C) 2002-2005
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 * See listed authors below.
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 *
 * ***** END LICENSE BLOCK ***** */

package org.dcm4chee.audit.login;

import java.util.Map;

import javax.security.auth.Subject;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.login.LoginException;
import javax.security.auth.spi.LoginModule;
import javax.security.jacc.PolicyContext;
import javax.security.jacc.PolicyContextException;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.dcm4che2.audit.message.AuditEvent;
import org.dcm4che2.audit.message.UserAuthenticationMessage;

/**
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Revision$ $Date$
 * @since Nov 29, 2006
 */
public class AuditLoginModule implements LoginModule {

    private static final String WEB_REQUEST_KEY = "javax.servlet.http.HttpServletRequest";

    private static final Logger auditlog = Logger.getLogger("auditlog");

    private static final Logger log = Logger.getLogger(AuditLoginModule.class);

    private CallbackHandler cbh;

    public void initialize(Subject subject, CallbackHandler cbh,
            Map<String, ?> sharedState, Map<String, ?> options) {
        this.cbh = cbh;
    }

    public boolean login() throws LoginException {
        return false;
    }

    public boolean commit() throws LoginException {
        auditUserAuth(UserAuthenticationMessage.LOGIN);
        return false;
    }

    public boolean abort() throws LoginException {
        auditUserAuthFailure(AuditEvent.OutcomeIndicator.MINOR_FAILURE);
        return false;
    }

    public boolean logout() throws LoginException {
        auditUserAuth(UserAuthenticationMessage.LOGOUT);
        return false;
    }

    private void auditUserAuth(AuditEvent.TypeCode typeCode) {
        UserAuthenticationMessage userAuth = new UserAuthenticationMessage(
                typeCode);
        userAuth.addUserPerson(getUserID(), null, null, getHostname());
        auditlog.info(userAuth);
    }

    private void auditUserAuthFailure(AuditEvent.OutcomeIndicator failure) {
        UserAuthenticationMessage msg = new UserAuthenticationMessage(
                UserAuthenticationMessage.LOGIN);
        msg.setOutcomeIndicator(failure);
        msg.addUserPerson(getUserID(), null, null, getHostname());
        auditlog.warn(msg);
    }

    private String getUserID() {
        NameCallback nc = new NameCallback("prompt");
        try {
            cbh.handle(new Callback[] { nc });
        } catch (Exception e) {
            log.error("Failed to identify user:", e);
            return "UNKOWN_USER";
        }
        return nc.getName();
    }

    private HttpServletRequest getHttpServletRequest()
            throws PolicyContextException {
        return (HttpServletRequest) PolicyContext.getContext(WEB_REQUEST_KEY);

    }

    private String getHostname() {
        try {
            return getHttpServletRequest().getRemoteHost();
        } catch (PolicyContextException e) {
            log.warn("Failed to identify user host:", e);
            return null;
        }
    }
}
