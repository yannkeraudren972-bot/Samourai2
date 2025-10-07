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

	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant c) {
		
		this.reputation++;
		
		int benef = c.seFaireExtorquer();
		
		this.gagnerArgent(benef);
		
		String str = "J’ai piqué le fric de " + c.getNom();
		
		this.parler(str);
	}
	
	public void gagnerDuel() {
		
		this.reputation++;
		
		String str = "J'ai gagné !!! contre ce ronin";
		
		this.parler(str);
	}
	
	public int perdreDuel() {
		
		int argent = this.getArgent();
		
		this.perdreArgent(argent);
		
		this.reputation--;
		
		String str = "J’ai perdu mon duel et mes " + argent +" sous, snif...";
		
		this.parler(str);
		
		return argent;
	}
	
	@Override
	public void direBonjour() {
		
		super.direBonjour();
		
		String txt = "J'appartiens au clan " + this.clan + " !";
        this.parler(txt);
    }

}
