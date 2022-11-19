package histoire;

import personnages.commercant.Commercant;
import personnages.ronin.Ronin;
import personnages.ronin.Samourai;
import personnages.ronin.Traitre;
import personnages.yakuza.Yakuza;

public class HistoireTP5 {
	public static void main(String[] args) {
		/*
		 * marco.faireConnaissanceAvec(roro); marco.faireConnaissanceAvec(yaku);
		 * marco.faireConnaissanceAvec(chonin); marco.faireConnaissanceAvec(kumi);
		 * marco.listerConnaissance(); roro.listerConnaissance();
		 * yaku.listerConnaissance();
		 */

		Samourai akimoto = new Samourai("akimoto", "Miyamoto", "saké", 80);

		Traitre masaka = new Traitre("masaka", "Miyamoto", "whisky", 100);
		Commercant kumi = new Commercant("Kumi", 10);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant marco = new Commercant("Marco", 20);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);

		masaka.faireLeGentil();
		masaka.ranconner(kumi);
		masaka.ranconner(chonin);
		masaka.ranconner(marco);
		akimoto.faireConnaissanceAvec(masaka);
		masaka.ranconner(marco);
		masaka.faireConnaissanceAvec(yaku);
		masaka.faireLeGentil();
		masaka.faireConnaissanceAvec(roro);
	}
}
