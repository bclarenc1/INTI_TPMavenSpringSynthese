package com.infotel.TPMavenSpringSynthese.service;

import com.infotel.TPMavenSpringSynthese.metier.Etudiant;
import com.infotel.TPMavenSpringSynthese.metier.Formation;

public interface Iservice {

	public int ajouterEtudiant(Etudiant e);
	public int ajouterFormation(Formation f);
}
