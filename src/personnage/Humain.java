package personnage;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}

	public String getNom() {
		return nom;
	}

	protected int getArgent() {
		return argent;
	}

	public String getBoisson() {
		return boisson;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m�appelle " + nom + " et j'aime boire du " + boisson + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	private void parler(String texte) {
		System.out.println(nom + ": " + texte);
	}
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux m�me pas m'offrir " + bien + " à " + prix + " sous");
		}
	}
	
	 private void gagnerArgent(int gain) {
		argent += gain;
	}
	 
	 protected void perdreArgent(int perte) {
			int nvArg = argent - perte;
			if (nvArg < 0) {
				argent = 0;
			} else {
				argent = nvArg;
			}
		}
}
