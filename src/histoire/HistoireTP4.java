package histoire;

import personnage.*;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 15);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "Warsong", 30);
		yaku.direBonjour();
		yaku.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		yaku.parler(marco.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		yaku.extorquer(marco);

	}
}
