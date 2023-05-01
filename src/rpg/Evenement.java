package rpg;

public abstract class Evenement {
	
	protected Personnage hero;
	
	
	
	public Evenement(Personnage hero) {
		
		this.hero = hero;
	}

	
	public abstract Personnage resoudre();

}
