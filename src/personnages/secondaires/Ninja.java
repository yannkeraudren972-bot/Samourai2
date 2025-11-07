package personnages.secondaires;

import java.util.Random;

import personnages.principaux.Yakusa;

public class Ninja extends Yakusa{
	
	private String clanSecret;
	
	private static final String[] clansNinja = {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};

	public Ninja(String nom, int argent, String boisson, String clan) {
		
		super(nom, argent, boisson, clan);
		
		Random r = new Random();
		
		switch (clansNinja[r.nextInt(clansNinja.length)]) {
			
			case "of Shadows" : 
				this.clanSecret = clan + " of Shadows";
				
			case "of Mist" :
				this.clanSecret = clan + " of Mist";
				
			case "of Clouds" :
				this.clanSecret = clan + " of Clouds";
				
			case "of Fogs" :
				this.clanSecret = clan + " of Fog";
				
			case "of Darkness" :
				this.clanSecret = clan + " of Darkness";
			
		}
		
	}
	
	@Override
	public void direBonjour() {
		
		super.direBonjour();
		
		String str = "(mon clan secret est " + this.clanSecret +" et maintenant que tu le sais, je vais devoir te tuer)";
		
		parler(str);
		
	}

}
