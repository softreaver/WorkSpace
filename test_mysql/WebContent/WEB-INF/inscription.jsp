<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inscription</title>
</head>
<body>
	<h1>Page d'inscription</h1>

	<form action="inscription" method="POST">

		<label for="nomClient">Nom <span class="requis">*</span></label>
		<input type="text" id="nomClient" name="nom" value="<c:out value="${client.nom}"/>" size="30" maxlength="30" />
		<span class="erreur">${form.erreurs['nom']}</span>
		<br />
		
		<label for="mot-de-passe">Mot de passe </label>
		<input type="password" id="mot-de-passe" name="motdepasse" value="<c:out value="${client.motdepasse}"/>" size="30" maxlength="30" />
		<span class="erreur">${form.erreurs['motdepasse']}</span>
		<br />
		
		<label for="confirmation">Confirmation mot de passe <span class="requis">*</span></label>
		<input type="password" id="confirmation" name="confirmation" value="<c:out value="${client.confirmation}"/>" size="30" maxlength="60" />
		<span class="erreur">${form.erreurs['confirmation']}</span>
		<br />
		
		<label for="telephoneClient">Numéro de téléphone <span class="requis">*</span></label>
		<input type="text" id="telephoneClient" name="telephone" value="<c:out value="${client.telephone}"/>" size="30" maxlength="30" />
		<span class="erreur">${form.erreurs['telephoneClient']}</span>
		<br />
		
		<label for="emailClient">Adresse email</label>
		<input type="email" id="emailClient" name="email" value="<c:out value="${client.email}"/>" size="30" maxlength="60" />
		<span class="erreur">${form.erreurs['email']}</span>
		<br />

		<input type="submit" value="Enregistrer"/>
	</form>
</body>
</html>