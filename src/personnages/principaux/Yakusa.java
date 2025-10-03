package personnages.principaux;

import personnages.Humain;

public class Yakusa extends Humain{
	
	private String clan;
	private int reputation; 
	
	public Yakusa(String nom, int argent, String boisson, String clan) {
		
		super(nom,argent,boisson);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public String getClan() {
		return clan;
	}

	public int getReputaion() {
		return reputation;
	}
	
	public void extorquer(Commercant c) {
		
		int benef = c.seFaireExtorquer();
		
		this.gagnerArgent(benef);
		
		String str = "J’ai piqué le fric de " + c.getNom();
		
		this.parler(str);
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
		
		super.direBonjour();
		
		String txt = "J'appartiens au clan " + this.clan + " !";
        this.parler(txt);
    }

}
