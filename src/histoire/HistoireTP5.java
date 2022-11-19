package histoire;

import personnages.GrandMere;
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

		Traitre masako = new Traitre("masako", "Miyamoto", "whisky", 100);
		Commercant kumi = new Commercant("Kumi", 10);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant marco = new Commercant("Marco", 20);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		/*
		 * masako.faireLeGentil(); masako.ranconner(kumi); masako.ranconner(chonin);
		 * masako.ranconner(marco); akimoto.faireConnaissanceAvec(masako);
		 * masako.ranconner(marco); masako.faireConnaissanceAvec(yaku);
		 * masako.faireLeGentil(); masako.faireConnaissanceAvec(roro);
		 */

		GrandMere grandMere = new GrandMere("Grand-Mère", 10);
		grandMere.faireConnaissanceAvec(akimoto);
		grandMere.faireConnaissanceAvec(yaku);
		grandMere.faireConnaissanceAvec(masako);
		grandMere.faireConnaissanceAvec(kumi);
		grandMere.faireConnaissanceAvec(marco);
		grandMere.faireConnaissanceAvec(chonin);
		grandMere.ragoter();

	}
}
