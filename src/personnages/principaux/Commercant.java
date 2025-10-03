package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		
		super(nom, argent,"null");
		
	}
	
	public int seFaireExtorquer() {
		return 0;
		//TODO à faire 
	}

	public void recevoir(int argent) {
		//TODO à faire
	}
}
