package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Commande;
import com.forms.CreationCommandeForm;

@SuppressWarnings("serial")
public class CreationCommande extends HttpServlet
{
	public static final String ATT_COMMANDE = "commande";
	public static final String ATT_FORM = "form";

	public static final String VUE_SUCCES = "/WEB-INF/afficherCommande.jsp";
	public static final String VUE_FORM = "/WEB-INF/creerCommande.jsp";

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
		CreationCommandeForm form = new CreationCommandeForm();

		/* Traitement de la requête et récupération du bean en résultant */
		Commande commande = form.creerCommande(request);

		/* Ajout du bean et de l'objet métier à l'objet requête */
		request.setAttribute(ATT_COMMANDE, commande);
		request.setAttribute(ATT_FORM, form);

		if (form.getErreurs().isEmpty())
			/* Si aucune erreur, alors affichage de la fiche récapitulative */
			getServletContext().getRequestDispatcher(VUE_SUCCES).forward(request, response);
		else
			/* Sinon, ré-affichage du formulaire de création avec les erreurs */
			getServletContext().getRequestDispatcher(VUE_FORM).forward(request, response);
	}
}