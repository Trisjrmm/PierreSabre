package personnage;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String clan, int argent) {
		super(nom, argent, "whisky");
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		int argentVictime = victime.getArgent();
		gagnerArgent(victime.seFaireExtorquer());
		parler("J’ai piqué les " + argentVictime + " sous de Marco, ce qui me fait " + getArgent() +" sous dans ma poche. Hi ! Hi !");
		
	}
	
	public int getReputation() {
		return reputation;
	}

	protected int perdre() {
		int argent = getArgent();
		perdreArgent(argent);
		if (reputation > 0) {
			reputation -= 1;
		}
		
		parler("J’ai perdu mon duel et mes " + argent + " sous, snif... J'ai déshonoré le clan de " + clan);
		
		return argent; 
	}
	
	protected void gagner(int gain) {
		gagnerArgent(gain);
		reputation += 1;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain +" sous.");
	}
	
	@Override
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + getBoisson() + ".");
		parler("Mon clan est celui de " + clan + ".");
	}
	
}
