package histoire;

import personnage.*;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 15);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "Warsong", 30);
		Ronin roro = new Ronin("Roro", 60);
		
		roro.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		roro.provoquer(yaku);

	}
}
