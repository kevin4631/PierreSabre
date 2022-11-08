package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	public void donner(Commercant beneficiaire) {
		int argentDonner = (int) (this.getArgent() * 0.1);
		this.perdreArgent(argentDonner);
		this.parler(beneficiaire.getNom() + " prend ces 6 sous.");
		beneficiaire.recevoir(argentDonner);
	}

}
