package personnages.secondaires;

import personnages.principaux.Commercant;

public class Colporteur extends Commercant{

	public Colporteur(String nom, int argent) {
		
		super(nom, argent);
		
	}
	
	@Override
	public int seFaireExtorquer() {
		
		String str = "Hihihi il ne m'a pas pris tout mon argent";
		
		parler(str);
		
		int perte = this.getArgent()/2;
		
		this.perdreArgent(perte);
		
		return perte;
	}

}
