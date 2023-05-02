package rpg;

public class Potion extends Objet{
	
	private int pv = 5 ;

	public Potion(String nom, int poids) {
		super(nom, poids);
		// TODO Auto-generated constructor stub
	}	
		

	public int getPv() {
		return pv;
	}


	public void setPv(int pv) {
		this.pv = pv;
	}


	@Override
	public void utiliser(Personnage cible) {
		cible.setPv( cible.getPv() + pv );		
	}

}
