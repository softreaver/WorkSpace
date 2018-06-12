//Afficher les cases permettant de créer un nouveau client
function formulaireNouveauClient(){
	document.getElementById('nouveauClient').style.display = 'block';
	document.getElementById('clientConnu').style.display = 'none';
}

//Afficher le select permettant de choisir un client existant
function formulaireClientExistant(){
	document.getElementById('nouveauClient').style.display = 'none';
	document.getElementById('clientConnu').style.display = 'block';
}
