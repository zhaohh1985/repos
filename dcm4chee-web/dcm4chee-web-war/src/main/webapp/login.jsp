<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ page import='java.net.InetAddress' %>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:wicket="http://wicket.apache.org">
    <jsp:useBean id="login" scope="request" class="org.dcm4chee.web.common.login.LoginResources" />
    <% 
     String nodeInfo = System.getProperty("dcm4che.archive.nodename", InetAddress.getLocalHost().getHostName() );
     Cookie[] cookies = request.getCookies();
     String userName = "";
     String focus = "self.focus();document.login.j_username.focus()";
     boolean darkroom = false;
     if (cookies != null) {
	     int count = 0;
	     for (int i = 0; i < cookies.length; i++) {
	         if (cookies[i].getName().equals("WEB3LOCALE")) {
	             login.setLocale(cookies[i].getValue());
	             count++;
	             if (count==3)
	             	break;
	         } else if (cookies[i].getName().equals("WEB3_CSS")) {
	             if ("base-style-r.css".equals(cookies[i].getValue()))
	                 darkroom = true;
	             count++;
	             if (count==3)
		            break;
	         } else if (cookies[i].getName().equals("signInPanel.signInForm.username")) {
	             userName = cookies[i].getValue();
	             if (userName!=null && userName.length()>0)
	                 focus = "self.focus();document.login.j_username.value='"+userName+
	                 	"';document.login.j_password.focus()";
	             count++;
	             if (count==3)
	             	break;
	         }
	     }
     }
     String lang = System.getProperty("pacs.web.default.locale");
     if (lang != null) {
    	 login.setLocale(lang);
     }
    %>
    <head>
	    <title>${login.browser_title} (<%= nodeInfo %>)</title>
	    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <% if (darkroom) { %>
           <link rel="stylesheet" type="text/css" href="resources/org.dcm4chee.web.common.base.BaseWicketPage/base-style-r.css" />
        <% } else {%>
           <link rel="stylesheet" type="text/css" href="resources/org.dcm4chee.web.common.base.BaseWicketPage/base-style.css" />
  	    <% } %>
        <script>
            function login_init() {
            	<%= focus %>
                window.setTimeout("location.reload(true);", ${pageContext.session.maxInactiveInterval * 1000 - 5000});
            }
        </script>
    </head>
    <body onload="login_init();">
        <div class="tabpanel">
            <div class="module-selector">
                <div class="tab-row">
			        <ul>
		            </ul>
                </div>
		        <div class="tab-logo" style="float: right; margin-top: 15px; height: 43px; padding-right: 15px; padding-left: 15px;">
		           <img alt="dcm4che.org" src="resources/org.dcm4chee.web.common.base.BaseWicketPage/images/logo.gif" /><br/>
		        </div>
	       </div>
	       <div class="module-panel"></div>
        </div>
        <div class="signin" style="padding-top: 160px;">
            <% if (request.getParameter("loginFailed") == null) { %>
	            <span class="login-desc">${login.loginLabel} <%= nodeInfo %></span>
            <% } else {%>
    	        <span class="login-desc">${login.loginFailed} <%= nodeInfo %></span>
    	    <% } %>
            <div>
		        <form action="j_security_check" method="POST" name="login" >
		            <table style="padding-top: 60px; padding-right: 90px; padding-bottom: 10px;">
                        <tbody>
			                <tr style="text-align: left;">
			                    <td align="right">${login.username}</td>
			                    <td>
			                        <input type="text" name="j_username" size="30" />
			                    </td>
			                </tr>
			                <tr style="text-align: left;">
			                    <td align="right">${login.password}</td>
			                    <td>
			                        <input type="password" name="j_password" size="30" />
			                    </td>
			                </tr>
			                <tr style="text-align: left;">
			                    <td></td>
			                    <td>
			                        <input type="submit" name="submit" value="${login.submit}" class="button" />
			                        <input type="reset" value="${login.reset}" onclick="document.login.j_username.focus()" class="button"/>
			                    </td>
			                </tr>
                        </tbody>
                    </table>
		        </form>
            </div>
        </div>
  </body>
</html>
