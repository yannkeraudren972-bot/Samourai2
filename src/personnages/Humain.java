package personnages;

public class Humain {
	
	private String nom;
	private int argent;
	private String boisson; 
	
	public Humain(String nom, int argent, String boisson) {
		
		this.argent = argent;
		this.boisson = boisson;
		this.nom = nom;
	}
	
	public void parler(String texte) {
		
		System.out.println(this.nom + " - " + texte +"\n");
		
	}
	
	public void direBonjour() {
		
		String txt = "Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boisson + ", j'ai " + this.argent + " sous en poche.";
		
		parler(txt);
		
	}
	
	public void boire() {
		
		String txt = "Mmmm, un bon verre de "+ this.boisson +" ! GLOUPS !";
		
		parler(txt);

	}
	
	public int getArgent() {
		return argent;
	}
	
	public String getBoisson() {
		return boisson;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void gagnerArgent(int benef) {
		
		this.argent += benef;
	}
	
	public void perdreArgent(int deficit) {
		
		this.argent -= deficit;
	}
}
