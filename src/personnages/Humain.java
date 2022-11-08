package personnages;

public class Humain {

	private String nom;
	private String boisson;
	private int argent;

	public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	protected void parler(String text) {
		System.out.println("(" + this.getNom() + ") - " + text);
	}

	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle " + this.getNom() + " et j'aime boire du " + this.boisson + ".");
	}

	public void boire() {
		this.parler("Mmmm, un bon verre de " + this.boisson + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (this.argent >= prix) {
			this.parler("j'ai " + this.getArgent() + " sous en poche. Je vais pouvoir m'offrir une " + bien + " à "
					+ prix + " sous");
			this.argent -= prix;
		} else {
			this.parler(" Je n'ai plus que " + this.argent + " sous en poche. Je ne peux même pas m'offrir un kimono à "
					+ prix + " sous.");
		}
	}

	public int gagnerArgent(int somme) {
		this.argent += somme;
		return this.getArgent();
	}

	public int perdreArgent(int somme) {
		this.argent -= somme;
		return this.getArgent();
	}

	public String getNom() {
		return this.nom;
	}

	public int getArgent() {
		return this.argent;
	}

}
