package rpg;

public class PotionFeu extends Objet{
	
	private int degats = 5 ;

	public PotionFeu(String nom, int poids) {
		super(nom, poids);
		// TODO Auto-generated constructor stub
	}	
		

	public int getDegats() {
		return degats;
	}


	public void setDegats(int degats) {
		this.degats = degats;
	}


	@Override
	public void utiliser(Personnage cible) {
		cible.setPv( cible.getPv() - degats );		
	}

}
