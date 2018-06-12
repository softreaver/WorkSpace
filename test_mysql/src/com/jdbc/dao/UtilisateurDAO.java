package com.jdbc.dao;

import com.jdbc.beans.Utilisateur;

public interface UtilisateurDAO
{

	void creer(Utilisateur utilisateur) throws DAOException;

	Utilisateur trouver(String email) throws DAOException;

}
