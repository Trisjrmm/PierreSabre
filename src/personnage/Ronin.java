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
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur * 2;
		
		if (force >= adversaire.getReputation()) {
			parler("Je t'ai eu petit yakusa");      
			gagnerArgent(adversaire.perdre());
		} else {
			if (honneur > 0) { 
				honneur -= 1;
			}
			
			adversaire.gagner(getArgent());
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			perdreArgent(getArgent());
		}
	}
}
