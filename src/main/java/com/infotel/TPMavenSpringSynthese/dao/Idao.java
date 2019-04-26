package com.infotel.TPMavenSpringSynthese.dao;

import com.infotel.TPMavenSpringSynthese.metier.Etudiant;
import com.infotel.TPMavenSpringSynthese.metier.Formation;

public interface Idao {

	public int ajouterEtudiant(Etudiant e);
	public int ajouterFormation(Formation f);
}
