package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Data extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		// On défini le format de la reponse comme étant du JSON
		resp.setContentType("application/json");

		String jsonObject = "{\"test\":\"valeur\",\"test2\":\"valeur2\"}";

		resp.getWriter().print(jsonObject);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		// On défini le format de la reponse comme étant du JSON
		resp.setContentType("application/json");

		String jsonObject = "{\"test\":\"valeur\",\"test2\":\"valeur2\"}";

		resp.getWriter().print(jsonObject);
	}
}
