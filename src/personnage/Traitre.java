package personnage;

import java.util.Random;

public class Traitre extends Samourai{
	private int niveauTraitrise;
	private Random rand = new Random();
	
	public Traitre(String nom, String seigneur, String boisson, int argent) {
		super(nom, seigneur, boisson, argent);
	}
	
	@Override
	public void direBonjour() {
		// TODO Auto-generated method stub
		super.direBonjour();
	}
	
	private void ranconner(Commercant commercant) {
		if (niveauTraitrise < 3) {
			int argentCommercant = commercant.getArgent();
			int argentRanconner = argentCommercant * (2/10);
			commercant.perdreArgent(argentRanconner);
			
			gagnerArgent(argentRanconner);
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi " + argentRanconner + " sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + getNom() + ".");
		} else {
			parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de ;me démasquer !");
		}
		
	}
	
	private void faireLeGentil() {
		if (nbConnaissances == 0) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif");
		} else {
			int don = getArgent() * (2/10);
			int i = rand.nextInt(nbConnaissances);
			Humain ami = connaissances[i];
			String nomAmi = ami.getNom();
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + nomAmi + ".");
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");
			
			ami.gagnerArgent(don);
			perdreArgent(don);
			
			ami.parler("Merci " + getNom() + ". Vous êtes quelqu'un de bien");
			if (niveauTraitrise > 1) {
				niveauTraitrise -= 1;
			}
			
		}
	}
}
