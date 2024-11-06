package personnage;

public class Ronin extends Humain{
	private int honneur = 1;
	
	public Ronin(String nom, int argent) {
		super(nom, argent, "shochu");
	}
	
	public void donner(Commercant beneficiaire) {
		int	 benefice = (int) (getArgent() * 0.10); 
		perdreArgent(benefice);
		parler(beneficiaire.getNom() + " prend ces " + benefice + " sous.");
		beneficiaire.recevoir(benefice);
	}
}
