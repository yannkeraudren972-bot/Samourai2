package personnages.secondaires;

import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Samourai;

public class Traitre extends Samourai{
	
	private int traitrise;

	public Traitre(String nom, int argent, String boisson, String seigneur) {
		
		super(nom, argent, boisson, seigneur);
		
		this.traitrise = 0;
		
	}
	
	
	@Override
	public void direBonjour() {
		
		super.direBonjour();
		
		String str = "Mon niveau de traitrise est de " + this.traitrise + ".";
		
		this.parler(str);
		
	}
	
	public void extorquer(Commercant c) {
		//TODO à remplir
	}
	
	public void faireLeGentil(Humain h, int argent) {
		//TODO à remplir 
	}

}
