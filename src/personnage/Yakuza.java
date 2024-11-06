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
		parler("J’ai piqué les " + argentVictime + " sous de Marco, ce qui me fait " + getArgent() +" sous dans ma\r\n" + "poche. Hi ! Hi !");
		
	}
	
}
