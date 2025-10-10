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
		return str;
		//TODO à finir
	}
	
	public void ragoter() {
		
	}
	
	public void faireConnaissanceAvec(Humain h) {
		
	}
	
	
}
