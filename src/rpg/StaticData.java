package rpg;

import java.util.Random;

public class StaticData {
	
	private static String[] listeAdjectifs = {"heureux", "triste", "grand", "petit", "beau", "moche", 
			"riche", "pauvre", "fort", "faible", "lent", "rapide", "intelligent", "stupide", "brillant", 
			"terne", "calme", "bruyant", "généreux", "égoïste", "brave", "peureux", 
			"chaleureux", "froid", "drôle", "ennuyeux", "sérieux", "créatif", "ordinaire", "original"};
	
	private static String[] listeNoms = {"Emma", "Liam", "Olivia", "Noah", "Ava", "Oliver", "Isabella", 
			"Sophia", "Elijah", "Charlotte", "Mia", "Amelia", "Harper", "Evelyn", "Abigail",
			"Emily", "Ella", "Elizabeth", "Mila", "Ethan", "Avery", "Sofia", "Madison", 
			"Scarlett", "Victoria", "Aria", "Chloe", "Penelope", "Grace", "Riley"};

	private static String[] listeNomsArmes = {"épée", "arc", "hache", "masse", "lance", "dague", "katana", 
			"fusil", "pistolet", "mitraillette", "bazooka", "grenade", "bombes", "couteau de combat", 
			"shuriken", "nunchaku", "bâton", "marteau de guerre", "fronde", "sarbacane", "poignard", "étoile de jet", "fleuret", "fléau", "boomerang", "harpon", 
			"trident", "canon", "épée laser", "blaster"};
	
	private static String[] listeNomsArmures = {"acier", "cuir", "verre", "bois", "pierre", "or", "argent",
			"platine", "cuivre", "bronze", "étain", "aluminium", "titane", "diamant", "rubis", 
			"saphir", "émeraude", "améthyste", "topaze", "perle", "ivoire", "marbre", "jade", "granit", 
			"onyx", "opal", "ambre", "corail", "lave", "os"};
	
	public static Armure[] listeArmures = {
			new Armure(StaticData.genererNomArmure(),10, 1),
			new Armure(StaticData.genererNomArmure(),10, 2),
			new Armure(StaticData.genererNomArmure(),10, 3),
			new Armure(StaticData.genererNomArmure(),10, 4),
			new Armure(StaticData.genererNomArmure(),10, 5),
			new Armure(StaticData.genererNomArmure(),10, 10),
			new Armure(StaticData.genererNomArmure(),10, 15),
			new Armure(StaticData.genererNomArmure(),10, 20),
	};
	
	public static Arme[] listeArmes = {
			new Arme(StaticData.genererNomArme(),10, 1),
			new Arme(StaticData.genererNomArme(),10, 2),
			new Arme(StaticData.genererNomArme(),10, 3),
			new Arme(StaticData.genererNomArme(),10, 4),
			new Arme(StaticData.genererNomArme(),10, 5),
			new Arme(StaticData.genererNomArme(),10, 10),
			new Arme(StaticData.genererNomArme(),10, 15),
			new Arme(StaticData.genererNomArme(),10, 20),
	};
	
	
	
	public static String genererNom() {
		return StaticData.genererAssociation(listeNoms, listeAdjectifs);
	}
	
	public static String genererNomArme() {
		return StaticData.genererAssociation(listeNomsArmes, listeAdjectifs);
	}
	
	public static String genererNomArmure() {
		return StaticData.genererAssociation(listeNomsArmures, listeAdjectifs);
	}
	
	public static String genererAssociation(String[] tableau1, String[] tableau2) {
		Random rand = new Random();
		return tableau1[rand.nextInt(tableau1.length)]
				+"."+
				tableau2[rand.nextInt(tableau2.length)]
				;
	}

}
