package com.infotel.TPMavenSpringSynthese.dao;

import org.springframework.stereotype.Repository;

import com.infotel.TPMavenSpringSynthese.metier.Etudiant;
import com.infotel.TPMavenSpringSynthese.metier.Formation;

@Repository
public class DaoImpl implements Idao {

	@Override
	public int ajouterEtudiant(Etudiant e) {
		System.out.println("etudiant ajoute");
		return 0;
	}

	@Override
	public int ajouterFormation(Formation f) {
		System.out.println("formation ajoutee");
		return 0;
	}


	
}
