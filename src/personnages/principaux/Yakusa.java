package personnages.principaux;

import personnages.Humain;

public class Yakusa extends Humain{
	
	private String clan;
	private int reputaion; 
	
	public Yakusa(String nom, int argent, String boisson, String clan) {
		
		super(nom,argent,boisson);
		this.clan = clan;
		this.reputaion = 0;
	}
	
	public String getClan() {
		return clan;
	}

	public int getReputaion() {
		return reputaion;
	}
	
	public void extorquer(Commercant c) {
		//TODO à faire 
	}
	
	public void gagnerDuel() {
		//TODO à faire
	}
	
	public int perdreDuel() {
		//TODO à faire
		return 0;
	}
	
	@Override
	public void direBonjour() {
		
	}
}
