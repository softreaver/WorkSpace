package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreerCommande extends HttpServlet
{
	private final String VUE = "/WEB-INF/formulaireCommande.jsp";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		getServletContext().getRequestDispatcher(VUE).forward(req, resp);
	}
}
