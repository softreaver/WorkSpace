<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inscription</title>
</head>
<body>
	<form method="POST" action="">
		<label for="prenom">Prénom</label>
		<input type="text" id="prenom" name="prenom">
		<br/>
		<label for="nom">Nom</label>
		<input type="text" id="nom" name="nom">
		<br/>
		<label for="email">Email</label>
		<input type="email" id="email" name="email">
		<br/>
		<label for="password">Mot de passe</label>
		<input type="password" id="password" name="password">
		<br/>
		<label for="password-confirmation">Confirmez le mot de passe</label>
		<input type="password" id="password-confirmation" name="password-confirmation"
		<input type="submit">
	</form>
</body>
</html>
