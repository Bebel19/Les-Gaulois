package test_fonctionnel;

import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;
import batailles.Embuscade;
import batailles.Lieu;
import personnages.Conteur;
import sites.Camp;
import sites.Village;




public class TestHistoire {
	public static void main(String[] args) {
		
		//Cr�ation des combatants et dse leurs camp et village
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
		Village village = new Village(abraracourcix);
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois asterix = new Gaulois("Ast�rix", 5);
		Gaulois obelix = new Gaulois("Obelix", 15);
		Gaulois cetautomatix = new Gaulois("C�tautomatix", 8);
		Gaulois ordralfabetix = new Gaulois("Ordralfab�tix", 8);
		village.ajouterVillageois(agecanonix);
		village.ajouterVillageois(assurancetourix);
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		village.ajouterVillageois(cetautomatix);
		village.ajouterVillageois(ordralfabetix);
		Soldat chorus = new Soldat("Chorus", 4, Grade.CENTURION);
		Camp camp = new Camp(chorus);
		Soldat minus = new Soldat("Minus", 2, Grade.SOLDAT);
		Soldat brutus = new Soldat("Brutus", 5, Grade.CENTURION);
		Soldat milexcus = new Soldat("Milexcus", 2, Grade.SOLDAT);
		Soldat tullius = new Soldat("Tullius Octopus", 2, Grade.TESSERARIUS);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, Grade.OPTIO);
		Soldat quintilius = new Soldat("Quintilius", 2, Grade.SOLDAT);
		camp.ajouterSoldat(brutus);
		camp.ajouterSoldat(milexcus);
		camp.ajouterSoldat(tullius);
		camp.ajouterSoldat(ballondebaudrus);
		camp.ajouterSoldat(minus);
		camp.ajouterSoldat(quintilius);
		
		//Cr�ation du conteur
		Conteur goscinny = new Conteur("Goscinny");
		
		// Sets d'adjectifs
		String[] adjectifsForetSombre = {"sombre","silencieuse","lugubre","inqui�tante"};
		
		//Cr�ation d'un lieu
		Lieu foretSombreNuit = new Lieu("Foret",adjectifsForetSombre, "jour", "froid");
		
		//Cr�ation d'une embuscade
		Embuscade embuscadeForetSombreNuit = new Embuscade(foretSombreNuit, camp.getArmeeRomaine(),village.getVillageois());
		
		//Compter l'histoire
		goscinny.raconter(embuscadeForetSombreNuit);
}
}