package personnages.secondaires;

import java.util.Random;

import personnages.Humain;

public class GrandMere extends Humain {
	
	private static final int NB_CONNAISSANCE_MAX = 30;
	
	private int nbConnaissances;
	
	private Random r;
	
	private Humain[] memoire = new Humain[NB_CONNAISSANCE_MAX];

	public GrandMere(String nom) {
		
		super(nom, 0, "tisane");
		
	}
	
	private String humainHasard() {
		
		String str = "";
		
		switch (this.r.nextInt(6)) {
		
		case 0 :
			str = "Commercant";
			
		case 1 : 
			str = "Ronin";
			
		case 2 :
			str = "Samourai";
			
		case 3 : 
			str = "Yakusa";
			
		case 4 : 
			str = "Colporteur";
			
		case 5 : 
			str = "Grand mere";
			
		case 6 : 
			str = "Ninja";
			
		}	
		
		return str;
	}
	
	public void ragoter() {
		
		for (Humain elt : memoire) {
			
			if (elt instanceof Traitre) {
				
				String str = "Je sais que " + elt.getNom() + "est un traître !";
				parler(str);
				
			}else {
				String str = "Je crois que " + elt.getNom() + "est un " + humainHasard();
				parler(str);
			}
		}
	}
	
	public void faireConnaissanceAvec(Humain h) {
		
		if (nbConnaissances >= 30) {
			
			String str = "Je ne peux plus la mémoire pour connaître de nouvelle personne";
			parler(str);
		}else {
			// Ajout de l'humain h à la mémoire de la grand mère
			this.memoire[nbConnaissances] = h;
			nbConnaissances++;
		}
		
	}
	
	
}
