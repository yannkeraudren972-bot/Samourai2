package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain {
	
	private int honneur;

	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		
		this.honneur = 1;
	}
	
	public void donner(int don, Commercant c) {
		
		this.perdreArgent(don);
		
		c.gagnerArgent(don);
		
		String str = "Tiens Marchant voilà " + don;
		
		this.parler(str);
	}
	
	public void provoquer(Yakusa y) {
		//TODO à faire
	}
}
