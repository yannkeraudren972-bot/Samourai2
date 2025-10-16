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
		 
		if (this.traitrise >= 3) {
			
			String str = "Oh non, je suis beaucoup trop malicieux, je peux pas extorquer ce marchand";
			parler(str);
		
		}else{
			
			int benef = c.seFaireExtorquer();
			
			this.gagnerArgent(benef);
			
			String str = "J’ai piqué le fric de " + c.getNom();
			
			this.parler(str);
			
		}
	}
	
	public void faireLeGentil(Humain h, int argent) {
		//TODO à remplir 
	}

}
