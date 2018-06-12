package com.upload.servlets;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@SuppressWarnings("serial")
public class Formulaire extends HttpServlet
{

	public static final String CHAMP_DESCRIPTION = "description";
	public static final String CHAMP_FICHIER = "fichier";
	public static final String VUE = "/WEB-INF/upload.jsp";
	public static final String CHEMIN = "chemin";
	public static final int TAILLE_TAMPON = 10240; // 10 ko

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		getServletContext().getRequestDispatcher(VUE).forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		/*
		 * Lecture du paramètre 'chemin' passé à la servlet via la déclaration
		 * dans le web.xml
		 */
		String chemin = getServletConfig().getInitParameter(CHEMIN);

		/* Récupération du contenu du champ de description */
		String description = req.getParameter(CHAMP_DESCRIPTION);
		req.setAttribute(CHAMP_DESCRIPTION, description);

		/* Écriture du fichier sur le disque */
		ecrireFichier(req, resp, chemin);

		getServletContext().getRequestDispatcher(VUE).forward(req, resp);

	}

	private static void ecrireFichier(HttpServletRequest request, HttpServletResponse response, String chemin)
			throws IllegalStateException, IOException, ServletException
	{
		response.setContentType("text/html;charset=UTF-8");

		// Create path components to save the file
		final String path = chemin;
		final Part filePart = request.getPart("file");
		final String fileName = getFileName(filePart);

		OutputStream out = null;
		InputStream filecontent = null;
		final PrintWriter writer = response.getWriter();

		try
		{
			out = new FileOutputStream(new File(path + File.separator + fileName));
			filecontent = filePart.getInputStream();

			int read = 0;
			final byte[] bytes = new byte[1024];

			while ((read = filecontent.read(bytes)) != -1)
				out.write(bytes, 0, read);
			writer.println("New file " + fileName + " created at " + path);
		} catch (FileNotFoundException fne)
		{
			writer.println("You either did not specify a file to upload or are "
					+ "trying to upload a file to a protected or nonexistent " + "location.");
			writer.println("<br/> ERROR: " + fne.getMessage());

		} finally
		{
			if (out != null)
				out.close();
			if (filecontent != null)
				filecontent.close();
			if (writer != null)
				writer.close();
		}
	}

	private static String getFileName(final Part part)
	{
		for (String content : part.getHeader("content-disposition").split(";"))
			if (content.trim().startsWith("filename"))
				return content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
		return null;
	}
}
