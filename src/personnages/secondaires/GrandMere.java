package personnages.secondaires;

import java.util.Random;

import personnages.Humain;

public class GrandMere extends Humain {
	
	private static final int NB_CONNAISSANCE_MAX = 30;
	
	private int nbConnaissances;
	
	private Random r = new Random();
	
	private Humain[] memoire = new Humain[NB_CONNAISSANCE_MAX];

	public GrandMere(String nom) {
		
		super(nom, 0, "tisane");
		
	}
	
	private String humainHasard() {
		
		String str = "";
		
		switch (this.r.nextInt(6)) {
		
		case 0 :
			str = "Commercant";
			break;
			
		case 1 : 
			str = "Ronin";
			break;
		case 2 :
			str = "Samourai";
			break;
		case 3 : 
			str = "Yakusa";
			break;
		case 4 : 
			str = "Colporteur";
			break;
		case 5 : 
			str = "Grand mere";
			break;
		case 6 : 
			str = "Ninja";
			break;
		}	
		
		return str;
	}
	
	public void ragoter() {
		
		for (int i = 0; i < nbConnaissances; i++) {
			
			if (this.memoire[i] instanceof Traitre) {
				
				String str = "Je sais que " + this.memoire[i].getNom() + " est un traître !";
				parler(str);
				
			}else {
				String str = "Je crois que " + this.memoire[i].getNom() + " est un " + humainHasard();
				parler(str);
			}
		}
	}
	
	public void faireConnaissanceAvec(Humain h) {
		
		if (nbConnaissances >= 30) {
			
			String str = "Je n'ai peux plus la mémoire pour connaître de nouvelle personne";
			parler(str);
		}else {
			// Ajout de l'humain h à la mémoire de la grand mère
			this.memoire[nbConnaissances] = h;
			nbConnaissances++;
		}
		
	}
	
	
}
