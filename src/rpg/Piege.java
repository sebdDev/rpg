package rpg;

import java.util.Random;

public class Piege extends Evenement{
	
	

	public Piege(Personnage hero) {
		super(hero);
		// TODO Auto-generated constructor stub 
		//essai 2
	}

	@Override
	public Personnage resoudre() {
		Random rand = new Random();
		float degats = rand.nextFloat(-1, 1)* 20;
		
		System.out.println(degats < 0 ? "le piége donne des PV" : "le piége retire des PV");
		hero.setPv(hero.getPv() - degats);
		
		return hero;
		
		
	}

}
