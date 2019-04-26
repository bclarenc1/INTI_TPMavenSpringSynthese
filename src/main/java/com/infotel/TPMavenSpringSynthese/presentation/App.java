package com.infotel.TPMavenSpringSynthese.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TPMavenSpringSynthese.metier.Dev;
import com.infotel.TPMavenSpringSynthese.metier.DevLogiciel;
import com.infotel.TPMavenSpringSynthese.metier.Etudiant;
import com.infotel.TPMavenSpringSynthese.metier.Formation;


public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    	// injection XML
    	Dev d1 = context.getBean("dev1", Dev.class);
    	Dev d3 = context.getBean("dev3", Dev.class);
    	DevLogiciel devlog = context.getBean("devlog", DevLogiciel.class);
    	
    	System.out.print("un dev peu experimente :\n\t");
    	System.out.println(d1);
    	System.out.print("son boss :\n\t");
    	System.out.println(d3);
    	System.out.print("qui développe ici ? :\n\t");
       	System.out.println(devlog);
       	System.out.println("");

       	// annotations
       	Formation f1 = context.getBean("formation", Formation.class);
       	Etudiant e1 = context.getBean("etud", Etudiant.class);

       	f1.setIdFormation(6);
       	f1.setNomFormation("HTML5/CSS3");
       	e1.setId(1);
       	e1.setPrenom("Andie");
       	e1.setNom("Capet");
       	e1.setFormation(f1);

    	System.out.println(e1);
    	System.out.println(f1);
    }
}
