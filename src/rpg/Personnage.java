package rpg;

import java.util.ArrayList;
import java.util.List;

public class Personnage {
	
	private float pv;
	private String nom;
	private Arme arme;
	private Armure armure;
	private List<Objet> inventaire = new ArrayList<Objet>();
	
	
		
	public List<Objet> getInventaire() {
		return inventaire;
	}

	public void setInventaire(List<Objet> inventaire) {
		this.inventaire = inventaire;
	}

	public Personnage(String nom, float pv, Arme arme, Armure armure){
		this.nom = nom;
		this.pv = pv;
		this.arme = arme;
		this.armure = armure;
		
	
	}
	
	public Personnage() {
	
	}
	/**
	 * @return the pv 
	 */
	public float getPv() {
		return pv;
	}
	/**
	 * @param pv the pv to set
	 */
	public void setPv(float pv) {
		this.pv = pv;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the arme
	 */
	public Arme getArme() {
		return arme;
	}
	/**
	 * @param arme the arme to set
	 */
	public void setArme(Arme arme) {
		
		if(this.arme != null)
			this.inventaire.add(this.arme);
		
		this.arme = arme ;
		
	}
	/**
	 * @return the armure
	 */
	public Armure getArmure() {
		return armure;
	}
	/**
	 * @param armure the armure to set
	 */
	public void setArmure(Armure armure) {
		
		if(this.armure != null)
			this.inventaire.add(this.armure);
		
		this.armure = armure ;
		
	}

	public void combattre(Personnage autre) {
		float degats = (this.getArme() != null) ? this.getArme().getDegats(): 0;
		degats -= (autre.getArmure() != null) ? autre.getArmure().getDefense() * 0.1f : 0;
		
		degats = (degats > 0) ? degats : 0;
		
		autre.setPv(autre.getPv() - degats);
	}
	/**
	 * Le personnage est-il encore en vie ?
	 * @return boolean 
	 */
	public boolean IsAlive() {
		return this.getPv() > 0;
	}
	
		
	public void piller(Personnage autre) {

		if( this.getArme().getDegats() < autre.getArme().getDegats() ) {
			System.out.println(this.getNom() + " a echangé " + this.getArme().getNom() +":"+ this.getArme().getDegats()+
		" avec " + autre.getArme().getNom() + ":" + autre.getArme().getDegats());
			autre.getArme().utiliser(this);
			
		}else {
			this.getInventaire().add(autre.getArme());
		}
		
		if( this.getArmure().getDefense() < autre.getArmure().getDefense() ) {
			System.out.println(this.getNom() + " a echangé " + this.getArmure().getNom() + " avec " + autre.getArmure().getNom());
			autre.getArmure().utiliser(this);
		}else {
			this.getInventaire().add(autre.getArmure());
		}
	}
	
	@Override
	public String toString() {
		return this.getNom()+" ("+this.getPv()+" PV)";
	}
}
