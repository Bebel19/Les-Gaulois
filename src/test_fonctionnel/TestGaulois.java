package test_fonctionnel;

import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;
import sites.Camp;
import sites.Village;

public class TestGaulois {
	public static void main(String[] args) {
		
		
		
		//Creation des habitants gaulois
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		Gaulois vercingetorix = new Gaulois("Vercing�torix",5);
		Gaulois obelix = new Gaulois("Obelix", 15);
		Gaulois prolix = new Gaulois("Prolix", 2);
		Gaulois agecanomix = new Gaulois("Agecanomix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois abraracourcix = new Gaulois("abraracourcix" , 5);
		Village lutece = new Village(vercingetorix);
		
		//Creation du village gaulois
		//Annonce de la cr�ation de Lutece
		vercingetorix.parler("Je suis un grand guerrier et je vais cr�er mon village");
		lutece.ajouterVillageois(agecanomix);
		lutece.ajouterVillageois(assurancetourix);
		lutece.ajouterVillageois(asterix);
		lutece.ajouterVillageois(obelix);
		lutece.ajouterVillageois(prolix);
		
		
		//Creation de l'arm�e romaine
		Soldat minus = new Soldat("Minus", 2, Grade.CENTURION);
		Soldat brutus = new Soldat("Brutus", 5, Grade.CENTURION); 
		Soldat milexcus = new Soldat("Milexcus", 2, Grade.SOLDAT);
		Soldat tulliusOctopus = new Soldat("Tullius Octopus", 2, Grade.TESSERARIUS);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, Grade.OPTIO); 
		Soldat briseradius = new Soldat("Briseradius", 4, Grade.SOLDAT);
		Soldat chorus = new Soldat("Chorus", 4, Grade.CENTURION);
		Camp campDeMinus = new Camp(minus);
		
		
		//Creation d'un camp romain
		//Annonce de la cr�ation d'un camp romain par minus
		minus.parler("Je suis en charge de cr�er un nouveau camp romain");
		campDeMinus.ajouterSoldat(brutus); 
		campDeMinus.ajouterSoldat(milexcus); 
		campDeMinus.ajouterSoldat(tulliusOctopus); 
		campDeMinus.ajouterSoldat(ballondebaudrus);

		


		
		
		campDeMinus.afficherCamp();
		lutece.afficherVillageois();
	
		
		lutece.changerChef(abraracourcix); 

		campDeMinus.changerCommandant (briseradius);
		campDeMinus.changerCommandant (chorus);


		
	}
}
