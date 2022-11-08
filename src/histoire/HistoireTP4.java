package histoire;

import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("marco", 15);
		Yakuza yaku = new Yakuza("Yaku le noir", "whisky", 30, "Warsong");
		yaku.direBonjour();
		yaku.extorquer(marco);

	}

}
