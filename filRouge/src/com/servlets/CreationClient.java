package com.servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.beans.Client;
import com.forms.CreationClientForm;

@SuppressWarnings("serial")
public class CreationClient extends HttpServlet
{
	public static final String ATT_CLIENT = "client";
	public static final String ATT_FORM = "form";

	public static final String VUE_SUCCES = "/WEB-INF/afficherClients.jsp";
	public static final String VUE_FORM = "/WEB-INF/creerClient.jsp";

	public static final String ATT_SESSION_LISTE_CLIENT = "clients";

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
		{
			/* Si aucune erreur, alors affichage de la fiche récapitulative */
			// Récupérer la session en cours
			HttpSession session = request.getSession();

			// On récupère la liste des utilisateurs inscrit
			Map<String, Client> listeClients = (HashMap<String, Client>) session.getAttribute(ATT_SESSION_LISTE_CLIENT);

			// Si la liste est vide on la crée
			if (listeClients == null)
				listeClients = new HashMap<String, Client>();

			listeClients.put(client.getNom(), client);

			// Ajout de la liste des clients à la session
			session.setAttribute(ATT_SESSION_LISTE_CLIENT, listeClients);

			getServletContext().getRequestDispatcher(VUE_SUCCES).forward(request, response);
		} else
			/* Sinon, ré-affichage du formulaire de création avec les erreurs */
			getServletContext().getRequestDispatcher(VUE_FORM).forward(request, response);
	}
}
