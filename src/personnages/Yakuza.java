package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}

	public void extorquer(Commercant commercant) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		this.parler(commercant.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int agentGagner = commercant.seFaireExtorquer();
		this.gagnerArgent(agentGagner);
		this.reputation += 1;
		this.parler("J’ai piqué les " + agentGagner + " sous de " + commercant.getNom() + ", ce qui me fait "
				+ this.getArgent() + " sous dans ma\n" + "poche. Hi ! Hi !");
	}

}