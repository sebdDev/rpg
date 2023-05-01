package rpg;

public class Arme extends Objet{
	
	private float degats = 1;
		
	/**
	 * @return the degats
	 */
	public float getDegats() {
		return degats;
	}
	/**
	 * @param degats the degats to set
	 */
	public void setDegats(float degats) {
		this.degats = degats;
	}
	/**
	 * @return the nom
	 */
			
	public Arme(String nom, int poids , float degats){
		super(nom,poids);
		this.degats = degats;
	}
	
	@Override
	public void utiliser(Personnage cible) {
		cible.getInventaire().add(cible.getArme());
		cible.setArme(this);
		
	}
}
