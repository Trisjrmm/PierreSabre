package personnage;

public class Humain {
	private String nom;
	private String boissonPref;
	private int argent;
	protected int nbConnaissances = 0;
	protected Humain[] connaissances;
	private int maxConnaissances = 3; 
	
	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boissonPref = boisson;
		this.connaissances = new Humain[maxConnaissances];
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public String getBoisson() {
		return boissonPref;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonPref + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonPref + " ! GLOUPS !");
	}
	
	public void parler(String texte) {
		System.out.println("(" + nom + ")- " + texte);
	}
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		}
	}
	
	protected void gagnerArgent(int gain) {
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
	 
	public void fairConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		repondre(autreHumain);
		memoriser(autreHumain);
	}
	 
	private void memoriser(Humain autreHumain) {
		if (nbConnaissances == maxConnaissances) {
			for (int i = 1; i < maxConnaissances; i++) {
				connaissances[i-1] = connaissances[i];
			}
			connaissances[maxConnaissances-1] = autreHumain;
		} else {
			connaissances[nbConnaissances] = autreHumain;
			nbConnaissances += 1;
		}
	}
	
	private void repondre(Humain autreHumain) {
		autreHumain.direBonjour();
		autreHumain.memoriser(this);
	}
	
	public void listerConnaissance() {
		parler("Je connais beaucoup de monde dont: "); 
		for (int i = 0; i < nbConnaissances; i++) {
			if (i == nbConnaissances-1) {
				System.out.println(connaissances[i].getNom());
			} else {
				System.out.print(connaissances[i].getNom() + ", ");
			}
		}
	}
}
