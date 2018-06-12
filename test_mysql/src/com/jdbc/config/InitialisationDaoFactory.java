package com.jdbc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.jdbc.dao.DAOFactory;

public class InitialisationDaoFactory implements ServletContextListener
{
	private static final String ATT_DAO_FACTORY = "daofactory";

	private DAOFactory daoFactory;

	@Override
	public void contextInitialized(ServletContextEvent arg0)
	{
		// Récupération du context du servelt
		ServletContext servletContext = arg0.getServletContext();

		// Instanciation de l'objet DAOFacory
		daoFactory = DAOFactory.getInstance();

		// Enregistrement de l'instance dans un attribut ayant pour portée toute
		// l'application
		servletContext.setAttribute(ATT_DAO_FACTORY, daoFactory);
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0)
	{
		// Rien à résaliser lors de l'arrêt du serveur
	}

}
