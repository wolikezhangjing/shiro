package org.jsecurity.web.authz;

import javax.servlet.FilterConfig;
import javax.servlet.http.HttpServletRequest;

/**
 *
 */
public interface UrlAuthorizationHandler {

    boolean configureUrlAuthorization(org.jsecurity.mgt.SecurityManager securityManager, FilterConfig config);

    boolean isUserAuthorizedForRequest(HttpServletRequest request);

}
