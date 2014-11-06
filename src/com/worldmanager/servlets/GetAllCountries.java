package com.worldmanager.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.worldmanager.dbmodels.DBManager;
import com.worldmanager.models.Country;

/**
 * Servlet implementation class GetAllCountries
 */
@WebServlet("/getallcountries.do")
public class GetAllCountries extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllCountries() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String target = "";
		HttpSession s = request.getSession();
		if (s.getAttribute("authorized_user") != null) {
			if (getServletContext().getAttribute("WorldDBManager") != null) {
				DBManager dbm = (DBManager) getServletContext().getAttribute("WorldDBManager");
				if (dbm.isConnected()) {
					if (!dbm.openConnection()) {
						throw new IOException("Could not connect to DB and open connection");
					}
				}
				ArrayList<Country> allCountries = new ArrayList<Country>();
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
