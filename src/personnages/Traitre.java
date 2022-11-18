package personnages;

import java.util.Random;

public class Traitre extends Samourai {
	private int niveauTaitrise = 0;

	public Traitre(String nom, String seigneur, String boisson, int argent) {
		super(nom, seigneur, boisson, argent);
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mais je suis un traître et mon niveau de traîtrise est : " + this.niveauTaitrise + ". Chut !");
	}

	public void ranconner(Commercant commercant) {
		if (this.niveauTaitrise < 3) {
			int argentRanconner = commercant.getArgent() * 2 / 10;
			commercant.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			this.parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi "
					+ argentRanconner + " sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + this.getNom() + ".");
			this.niveauTaitrise++;
		} else {
			this.parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}
	}

	public void faireLeGentil() {
		if (this.nbConnaissance < 1) {
			this.parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		} else {
			Random r = new Random();
			Humain ami = this.memoire[r.nextInt(this.nbConnaissance)];
			int don = this.getArgent() / 20;

			this.parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + ami.getNom()
					+ ".");
			this.parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");

			ami.gagnerArgent(don);
			this.perdreArgent(don);
			ami.parler("Merci " + this.getNom() + ". Vous êtes quelqu'un de bien.");

			if (this.niveauTaitrise >= 1)
				this.niveauTaitrise--;

		}
	}
}
