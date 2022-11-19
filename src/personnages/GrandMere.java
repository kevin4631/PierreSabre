package personnages;

import java.util.Random;

import personnages.ronin.Traitre;

public class GrandMere extends Humain {

	private enum TypeHumain {
		Commerçant, Ronin, Samourai, Yakuza, habitant
	};

	protected Humain[] memoire = new Humain[5];

	public GrandMere(String nom, int argent) {
		super(nom, "thé", argent);
	}

	@Override
	protected void memoriser(Humain humain) {
		if (this.nbConnaissance < 5) {
			this.memoire[this.nbConnaissance] = humain;
			this.nbConnaissance += 1;
		} else
			this.parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
	}

	public void ragoter() {
		for (int i = 0; i < this.nbConnaissance; i++) {
			if (this.memoire[i] instanceof Traitre)
				this.parler("je sais que " + this.memoire[i].getNom() + " est un traitre. Petit chenapan !");
			else
				this.parler("je crois que " + this.memoire[i].getNom() + " est un " + this.humainHasard());
		}
	}

	private String humainHasard() {
		Random r = new Random();
		TypeHumain[] types = TypeHumain.values();
		return types[r.nextInt(5)].name();
	}

}
