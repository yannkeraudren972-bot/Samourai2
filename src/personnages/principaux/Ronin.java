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
		
		String str = "Tiens Marchant voilà " + don + " sous.";
		
		this.parler(str);
	}
	
	public void provoquer(Yakusa y) {
		
		if (2 * this.honneur > y.getReputation()) {
			
			this.honneur++;
			
			this.gagnerArgent(y.perdreDuel());
			
			String str = "Je t’ai eu petit yakusa!";
			
			this.parler(str);
			
		}else {
			
			this.honneur--;
			
			y.gagnerDuel();
			
			String str = "Arghhhhh la vie est injuste";
			
			this.parler(str);
		}
	}
}
