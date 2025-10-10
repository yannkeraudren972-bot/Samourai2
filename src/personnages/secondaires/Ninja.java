package personnages.secondaires;

import personnages.principaux.Yakusa;

public class Ninja extends Yakusa{
	
	private String clanSecret;
	
	private String[] clansNinja;

	public Ninja(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson, clan);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void direBonjour() {
		// TODO Auto-generated method stub
		super.direBonjour();
	}

}
