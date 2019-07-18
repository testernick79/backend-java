package com.example.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProjectServlet")
public class ProjectServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1306151396634098221L;
	
	public void init() throws ServletException {
		super.init();
		
	}
	
	public void destroy() {
		super.destroy();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String testHeaderID = request.getHeader("Test-Get-Header");
		String testHeaderResponse;
		
		if(testHeaderID != null && !testHeaderID.isEmpty()) {
		    testHeaderResponse = testHeaderID;
		}else {
		    testHeaderResponse = "PayLoad 1234";

		    response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		System.out.println("GET is used to read information information.");
		response.getWriter().append("GET was called" +  " " + testHeaderResponse + " " + testHeaderID);

		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String testHeaderID = request.getHeader("Test-Post-Header");
		String testHeaderResponse;
		
		if(testHeaderID != null && !testHeaderID.isEmpty()) {
		    testHeaderResponse = testHeaderID;
		}else {
		    testHeaderResponse = "PayLoad 5678";

		    response.setStatus(HttpServletResponse.SC_ACCEPTED);
		}
		
		System.out.println("Data can be created using this method (POST).");
		response.getWriter().append("GET was called" +  " " + testHeaderResponse + " " + testHeaderID);
		
	}
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String testHeaderID = request.getHeader("Test-Put-Header");
		String testHeaderResponse;
		
		if(testHeaderID != null && !testHeaderID.isEmpty()) {
		    testHeaderResponse = testHeaderID;
		}else {
		    testHeaderResponse = "PayLoad 9101112";

		    response.setStatus(HttpServletResponse.SC_FORBIDDEN);
		}
		
		System.out.println("Use this (PUT) to update information");
		response.getWriter().append("GET was called" +  " " + testHeaderResponse + " " + testHeaderID);
		
	}
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String testHeaderID = request.getHeader("Test-Delete-Header");
		String testHeaderResponse;
		
		if(testHeaderID != null && !testHeaderID.isEmpty()) {
		    testHeaderResponse = testHeaderID;
		}else {
		    testHeaderResponse = "PayLoad 13141516";

		    response.setStatus(HttpServletResponse.SC_ACCEPTED);
		}
		
		System.out.println("Only use DELETE to remove the specified target");
		response.getWriter().append("GET was called" +  " " + testHeaderResponse + " " + testHeaderID);	
		
	}

}
