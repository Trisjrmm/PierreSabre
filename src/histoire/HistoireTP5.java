package histoire;

import personnage.*;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "Warsong", 30);
		Ronin roro = new Ronin("Roro", 60);
		
		marco.fairConnaissanceAvec(roro);
		marco.fairConnaissanceAvec(yaku);
		marco.fairConnaissanceAvec(chonin);
		marco.fairConnaissanceAvec(kumi);
		
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();		
	}
}
