package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Client;
import com.forms.CreationClientForm;

@SuppressWarnings("serial")
public class CreationClient extends HttpServlet
{
	public static final String ATT_CLIENT = "client";
	public static final String ATT_FORM = "form";

	public static final String VUE_SUCCES = "/WEB-INF/afficherClient.jsp";
	public static final String VUE_FORM = "/WEB-INF/creerClient.jsp";

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		/* À la réception d'une requête GET, simple affichage du formulaire */
		getServletContext().getRequestDispatcher(VUE_FORM).forward(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		/* Préparation de l'objet formulaire */
		CreationClientForm form = new CreationClientForm();

		/* Traitement de la requête et récupération du bean en résultant */
		Client client = form.creerClient(request);

		/* Ajout du bean et de l'objet métier à l'objet requête */
		request.setAttribute(ATT_CLIENT, client);
		request.setAttribute(ATT_FORM, form);

		if (form.getErreurs().isEmpty())
			/* Si aucune erreur, alors affichage de la fiche récapitulative */
			getServletContext().getRequestDispatcher(VUE_SUCCES).forward(request, response);
		else
			/* Sinon, ré-affichage du formulaire de création avec les erreurs */
			getServletContext().getRequestDispatcher(VUE_FORM).forward(request, response);
	}
}