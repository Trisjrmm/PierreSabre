package personnage;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, argent, "thé");
	}
	
	private int seFaireExtorquer() {
		int argent = getArgent();
		perdreArgent(argent);
		return argent;
	}
	
	
}
