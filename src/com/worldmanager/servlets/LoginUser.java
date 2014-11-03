package com.worldmanager.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.worldmanager.models.WebUser;

/**
 * Servlet implementation class LoginUser
 */
@WebServlet("/loginuser.do")
public class LoginUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
		
		int authLevel = 1;
		
		WebUser wu = new WebUser();
		wu.setUserId(uid);
		wu.setPwd(pwd);
		wu.setAuthLevel(authLevel);
		
		HttpSession s = request.getSession();
		s.setAttribute("authorized_user", wu);
		
		if (request.getParameter("rememberMe") != null) {
			String rememberMe = request.getParameter("rememberMe");
			if (rememberMe.equalsIgnoreCase("ON")) {
				int cookieLife = 3600*7*24;
				Cookie uidCook = new Cookie("credentials_uid", uid);
				uidCook.setMaxAge(cookieLife);
				response.addCookie(uidCook);
				Cookie pwdCook = new Cookie("credentials_pwd", pwd);
				uidCook.setMaxAge(cookieLife);
				response.addCookie(pwdCook);
			}
		}
		
		String target = ((request.getParameter("dest") == null || request.getParameter("dest") == "") 
				? "index.jsp" 
				: request.getParameter("dest") + ".jsp");
		response.sendRedirect(target);
		
	}

}
