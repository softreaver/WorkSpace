package com.jdbc.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.beans.Utilisateur;
import com.jdbc.dao.DAOFactory;
import com.jdbc.dao.UtilisateurDaoImpl;
import com.jdbc.forms.InscriptionForm;

@SuppressWarnings("serial")
public class Inscription extends HttpServlet
{
	private static final String VUE = "/WEB-INF/inscription.jsp";
	public static final String ATT_USER = "utilisateur";
	public static final String ATT_FORM = "form";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		getServletContext().getRequestDispatcher(VUE).forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		DAOFactory daoFactory = DAOFactory.getInstance();
		UtilisateurDaoImpl utilisateurDAO = new UtilisateurDaoImpl(daoFactory);
		InscriptionForm form = new InscriptionForm(utilisateurDAO);

		Utilisateur utilisateur = new Utilisateur();

		utilisateur = form.inscrireUtilisateur(req);

		req.setAttribute(ATT_USER, utilisateur);
		req.setAttribute(ATT_FORM, form);

		getServletContext().getRequestDispatcher(VUE).forward(req, resp);
	}
}
