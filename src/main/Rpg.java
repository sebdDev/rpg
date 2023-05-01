package main;


import rpg.Arme;
import rpg.Armure;
import rpg.Donjon;
import rpg.Personnage;
import rpg.StaticData;

public class Rpg {
	
	public static void main(String[] args) {
		
		//on cree notre hero  
		Personnage hero = new Personnage();
		hero.setNom("Jean-Sebastien");
		hero.setPv(100);
		
		Arme arme1 = new Arme(StaticData.genererNomArme(),10, 5f);
		Armure armure1 = new Armure(StaticData.genererNomArmure(),10, 5f);
		
		hero.setArme(arme1);
		hero.setArmure(armure1);
		
		// Génère notre donjon
		Donjon donjon = new Donjon(hero, 5);
		
		// Lancer le départ du donjon
		donjon.run();
		
		if(hero.IsAlive())
			System.out.println("Victoire !");
		else
			System.out.println("Défaite !");
	}
}
