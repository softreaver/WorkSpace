<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Récapitulation des données</title>
</head>
<body>
	<ul>
		<c:forEach items="${ paramValues }" var="item">
			<li>
				<c:out value="${ item.key }" />
				<ul>
					<c:forEach items="${ item.value }" var="val">
						<c:forTokens var="elem" items="${ val }" delims=" ,">
							<li>
								<c:out value="${ elem }"/>
							</li>
						</c:forTokens>
					</c:forEach>
				</ul>
			</li>
		</c:forEach>
	</ul>
	
	<h2>Voici ce que je sais de vous :</h2>
	<p>
		<c:out value="Vous êtes : ${ param.nom } ${ param.prenom }"/>
	</p>
	
	<h2>Vous avez visité :</h2>
	<p>
		<c:choose>
			<c:when test="${ !empty paramValues.pays }">
				<c:forEach items="${ paramValues.pays }" var="pays">
					<c:out value="${ pays }"/>
					<br/>
				</c:forEach>
			</c:when>
			<c:otherwise>
				Vous n'avez pas visité de pays parmis la liste proposée.
			</c:otherwise>
		</c:choose>
	</p>
</body>
</html>
