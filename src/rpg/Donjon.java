package rpg;

import java.util.ArrayList;
import java.util.Random;

public class Donjon {
	
	private ArrayList<Personnage> monstres = new ArrayList<Personnage>();
	private Personnage hero;
	private ArrayList<Evenement> pieces = new ArrayList<Evenement>();

	/*public Donjon(Personnage hero, int nbPieces) {
		Random rand = new Random();
		
		this.hero = hero;
		
				
		/**
		 * Générateur de monstre 
		 */ 
		/*for(int i = 0; i < nbPieces; i++) {
			
			this.monstres.add(new Personnage(
						StaticData.genererNom(),
						rand.nextFloat(5f * (i+1), 10f * (i+1)),
						StaticData.listeArmes[rand.nextInt(StaticData.listeArmes.length)],
						StaticData.listeArmures[rand.nextInt(StaticData.listeArmures.length)]
					));
			
		}
	}*/
	
	public Donjon(Personnage hero, int nbPieces) {
		Random rand = new Random();
		
		this.hero = hero;
		
				
		/**
		 * Générateur de monstre 
		 */ 
		for(int i = 0; i < nbPieces; i++) {
			if(rand.nextBoolean()) {
				//si on rencontre un monstre
				pieces.add(
						new Combat(
								this.hero,
								new Personnage(
										StaticData.genererNom(),
										rand.nextFloat(5f * (i+1), 10f * (i+1)),
										StaticData.listeArmes[rand.nextInt(StaticData.listeArmes.length)],
										StaticData.listeArmures[rand.nextInt(StaticData.listeArmures.length)]
										)
								)
						);
			}else {
				//si on rencontre un piége
				pieces.add(new Piege(hero));
			}
						
			this.monstres.add(new Personnage(
						StaticData.genererNom(),
						rand.nextFloat(5f * (i+1), 10f * (i+1)),
						StaticData.listeArmes[rand.nextInt(StaticData.listeArmes.length)],
						StaticData.listeArmures[rand.nextInt(StaticData.listeArmures.length)]
					));
			
		}
	}
	
	
	public void run() {
		
		// Parcourir le donjon salle par salle
		/*for(int i = 0; i < this.monstres.size();  i++) {
			Personnage ennemi = this.monstres.get(i);
			// On lance le combat !
			Combat arena = new Combat(this.hero, ennemi);
			System.out.println( arena.resoudre() + " est le grand vainqueur");
			System.out.println();
		}*/
		
		// Parcourir le donjon salle par salle
		for(int i = 0; i < this.pieces.size();  i++) {
			System.out.println(this.pieces.get(i).resoudre());

		}
		
	}

}
