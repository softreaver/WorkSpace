<%@ page pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Affichage d'un client</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="/inc/style.css"/>" />
    </head>
    <body>
        <c:import url="/inc/inc_menu.jsp" />
        <p class="info">${ form.resultat }</p>
        <table>
        	<thead>
        		<tr>
        			<th>Nom</th>
        			<th>Prénom</th>
        			<th>Adresse</th>
        			<th>Tel</th>
        			<th>Mail</th>
        		</tr>
        	</thead>
        	<tbody>
		        <c:forEach items="${ sessionScope.clients }" var="client" varStatus="status">
			        <tr class="<c:if test="${ status.index % 2 == 0}">pair</c:if>">
			            <td>Nom : <c:out value="${ client.value.nom }"/></td>
			            <td>Prénom : <c:out value="${ client.value.prenom }"/></td>
			            <td>Adresse : <c:out value="${ client.value.adresse }"/></td>
			            <td>Numéro de téléphone : <c:out value="${ client.value.telephone }"/></td>
			          	<td>Email : <c:out value="${ client.value.email }"/></td>
			        </tr>
		        </c:forEach>
	        </tbody>
        </table>
    </body>
</html>
