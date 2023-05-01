package rpg;

public class Armure extends Objet{
	
	private float defense = 1;
	
	/**
	 * @return the defense 
	 */
	public float getDefense() {
		return defense;
	}
	/**
	 * @param defense the defense to set
	 */
	public void setDefense(float defense) {
		this.defense = defense;
	}
	/**
	 * @return the nom
	 */
		
	
	public Armure(String nom, int poids ,float defense){
		super(nom,poids);
		this.defense = defense;
	}
	
	@Override
	public void utiliser(Personnage cible) {
		//cible.getInventaire().add(cible.getArmure());
		cible.setArmure(this);
		
	}

}
