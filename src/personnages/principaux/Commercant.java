package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		
		super(nom, argent,"null");
		
	}
	
	public int seFaireExtorquer() {
		
		int argent = this.getArgent();
		
		this.perdreArgent(argent);
		
		String str ="J’ai tout perdu! Le monde est trop injuste..."; 
		
		this.parler(str);
		
		return argent;
		 
	}

	public void recevoir(int argent) {
		
		this.gagnerArgent(argent);
	}
}
