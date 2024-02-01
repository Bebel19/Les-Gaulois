package test_fonctionnel;

import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;
import sites.Camp;
import sites.Village;

public class TestGaulois {
	public static void main(String[] args) {
		//Creation du village gaulois
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		
		Gaulois vercingetorix = new Gaulois("Vercing�torix",5);
		Village lutece = new Village(vercingetorix);
		
		
		//Creation de l'arm�e romaine
		
		Soldat minus = new Soldat("Minus", 2, Grade.CENTURION);
		Soldat brutus = new Soldat("Brutus", 5, Grade.CENTURION); 
		Soldat milexcus = new Soldat("Milexcus", 2, Grade.SOLDAT);
		Soldat tulliusOctopus = new Soldat("Tullius Octopus", 2, Grade.TESSERARIUS);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, Grade.OPTIO); 
		Camp campDeMinus = new Camp(minus);
		asterix.parler("Donnez moi de la potion ! Vite !");

		/*
		 * for (int i=0;i<3;i++) { minus.recevoirCoup(3); }
		 */
		//Combat entre 
		//Ast�rix tabasse minus
		for (int i = 0; i < 4; i++) {
			asterix.frapper(minus);
		}
		
		//Annonce de la cr�ation de Lutece
		vercingetorix.parler("Je suis un grand guerrier et je vais cr�er mon village");
		//Annonce de la cr�ation d'un camp romain par minus
		minus.parler("Je suis en charge de cr�er un nouveau camp romain");
		
	}
}
