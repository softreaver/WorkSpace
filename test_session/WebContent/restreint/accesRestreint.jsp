<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<link rel="stylesheet" href="<c:url value="/inc/form.css"/>">
<html>
    <head>
        <meta charset="utf-8" />
        <title>Accès restreint</title>
    </head>
    <body>
        <p>Vous êtes connecté(e) avec l'adresse ${sessionScope.sessionUtilisateur.email}, vous avez bien accès à l'espace restreint</p>
    </body>
</html>
