package com.infotel.TPMavenSpringSynthese.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TPMavenSpringSynthese.dao.Idao;
import com.infotel.TPMavenSpringSynthese.metier.Etudiant;
import com.infotel.TPMavenSpringSynthese.metier.Formation;

@Service
public class ServiceImpl implements Iservice {

	@Autowired
	private Idao dao;
	
	@Override
	public int ajouterEtudiant(Etudiant e) {
		return 0;
	}

	@Override
	public int ajouterFormation(Formation f) {
		return 0;
	}

	public Idao getDao() {
		return dao;
	}

	public void setDao(Idao dao) {
		this.dao = dao;
	}



	
}
