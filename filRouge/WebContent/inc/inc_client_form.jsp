<%@ page pageEncoding="UTF-8" %>

<script src="<c:url value="/inc/functionsClientForm.js"/>"></script>

<fieldset id="choix">
	<legend>Nouveau client ?</legend>
	<input id="radioOui" type="radio" onchange="formulaireNouveauClient()" name="radioGroupNouveauClient" checked/>
	<label for="radioOui">Oui</label>
	<br/>
	<input id="radioNon" type="radio" onchange="formulaireClientExistant()" name="radioGroupNouveauClient"/>
	<label for="radioNon">Non</label>
	<br/>
</fieldset>

<script>
	//On affiche pas les radio boutons si je suis sur la page de création d'un nouveau client
	if(document.location.href.indexOf("creationClient") != -1){
		document.getElementById('choix').style.display = "none";
	}
</script>

<div id="nouveauClient">
	<label for="nomClient">Nom <span class="requis">*</span></label>
	<input type="text" id="nomClient" name="nomClient" value="<c:out value="${client.nom}"/>" size="30" maxlength="30" />
	<span class="erreur">${form.erreurs['nomClient']}</span>
	<br />
	
	<label for="prenomClient">Prénom </label>
	<input type="text" id="prenomClient" name="prenomClient" value="<c:out value="${client.prenom}"/>" size="30" maxlength="30" />
	<span class="erreur">${form.erreurs['prenomClient']}</span>
	<br />
	
	<label for="adresseClient">Adresse de livraison <span class="requis">*</span></label>
	<input type="text" id="adresseClient" name="adresseClient" value="<c:out value="${client.adresse}"/>" size="30" maxlength="60" />
	<span class="erreur">${form.erreurs['adresseClient']}</span>
	<br />
	
	<label for="telephoneClient">Numéro de téléphone <span class="requis">*</span></label>
	<input type="text" id="telephoneClient" name="telephoneClient" value="<c:out value="${client.telephone}"/>" size="30" maxlength="30" />
	<span class="erreur">${form.erreurs['telephoneClient']}</span>
	<br />
	
	<label for="emailClient">Adresse email</label>
	<input type="email" id="emailClient" name="emailClient" value="<c:out value="${client.email}"/>" size="30" maxlength="60" />
	<span class="erreur">${form.erreurs['emailClient']}</span>
	<br />
</div>

<div id="clientConnu" style="display: none">
	<select name="selectClient" id="selectClient">
		<option value="default" selected>Choisissez un client</option>
	</select>
</div>
