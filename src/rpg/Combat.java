package rpg;

public class Combat extends Evenement{
	
	private Personnage hero2;
	
	public Combat(Personnage hero, Personnage hero2) {
		super(hero);
		this.hero2 = hero2;
	}
	
	@Override
	public Personnage resoudre() {
		// Fonction de combat anciennement dans main
		while(hero.IsAlive() && hero2.IsAlive()) {
			System.out.println(hero.getNom()+" attaque "+hero2.getNom() + " avec "+
					hero.getArme().getNom()+ " et l'armure "+ hero.getArmure().getNom());
			hero.combattre(hero2);
			System.out.println(hero.toString());
			System.out.println(hero2.toString());
			System.out.println();
			if(hero2.IsAlive()) {
				System.out.println(hero2.getNom()+" riposte avec " + hero2.getArme().getNom() + 
						" et l'armure " + hero2.getArmure().getNom());
				hero2.combattre(hero);
				System.out.println(hero.toString());
				System.out.println(hero2.toString());
				System.out.println();
			}
		}
		
		if(hero.IsAlive()) 
			hero.piller(hero2);
		else
			hero2.piller(hero);
			
			
		
		// On renvoi le vainqueur du combat
		return (hero.IsAlive()) ? hero : hero2;
		
	}
	
	
}
