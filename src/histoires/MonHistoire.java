package histoires;

import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Ronin;
import personnages.principaux.Samourai;
import personnages.principaux.Yakusa;
import personnages.secondaires.Colporteur;
import personnages.secondaires.GrandMere;
import personnages.secondaires.Ninja;
import personnages.secondaires.Traitre;


public class MonHistoire {

	public static void main(String[] args) {
		
		Humain humain = new Humain("Prof", 10, "Porto");
		humain.direBonjour();
		humain.boire();
		Commercant commercant = new Commercant("Marchand", 35);
		commercant.direBonjour();
		Yakusa yakusa = new Yakusa("Yaku␣le␣noir", 42,
		                             "biere", "WarSong");
		yakusa.direBonjour();
		yakusa.extorquer(commercant);
		Ronin ronin = new Ronin("Roro", 61, "sake");
		ronin.donner(10, commercant );
		ronin.provoquer(yakusa);
		ronin.direBonjour();
		
		Ronin musaichi = new Samourai("Akimoto" , 20, "the" , "Miyamoto");
		musaichi.direBonjour();
		musaichi.boire();
		
		musaichi = (Samourai) musaichi; 
		
		Samourai musa = new Samourai("Aki", 25, "Saké", "Miata");
		musa.direBonjour();
		musa.boire("Wisky");
		
		Commercant c2 = new Commercant("Fonderie", 60);
		c2.direBonjour();
		
		Traitre traitre = new Traitre("Akito", 20, "Matcha", "Mimimato");
		traitre.direBonjour();
		traitre.extorquer(c2);
		traitre.faireLeGentil(c2, 20);
		traitre.direBonjour();
		
		GrandMere mamie = new GrandMere("Mamito");
		mamie.direBonjour();
		mamie.faireConnaissanceAvec(c2);
		mamie.faireConnaissanceAvec(yakusa);
		mamie.faireConnaissanceAvec(musa);
		mamie.faireConnaissanceAvec(traitre);
		
		mamie.ragoter();
		
		Colporteur colporteur = new Colporteur("Yamaha", 50);
		colporteur.direBonjour();
		yakusa.extorquer(colporteur);
		colporteur.direBonjour();
		
		Ninja ninja = new Ninja("Kawa", 60, "Saké", "Long Dock");
		ninja.direBonjour();
		


	}

}
