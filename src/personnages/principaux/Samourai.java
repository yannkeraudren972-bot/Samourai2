package personnages.principaux;

public class Samourai extends Ronin{

	private String seigneur;
	
	public Samourai(String nom, int argent, String boisson, String seigneur) {
		
		super(nom, argent, boisson);
		
		this.seigneur = seigneur;	
		
	}
	
	
	public void boire(String boisson) {
		
		String txt = "Mmmm, un bon verre de "+ boisson +" ! GLOUPS !";
		
		parler(txt);
	}
	
	@Override
	public void direBonjour() {
		
		super.direBonjour();
		
		String str = "Je sers le seigneur " + this.seigneur + ".";
		
		this.parler(str);
		
	}
}
