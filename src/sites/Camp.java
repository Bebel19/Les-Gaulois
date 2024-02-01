package sites;

import personnages.Grade;
import personnages.Soldat;

public class Camp {
	
	private Soldat commandant;
	private Soldat[] armeeRomaine = new Soldat[4];
	private int nbSoldats = 0;
	
		
	public Camp(Soldat commandant) {
		this.commandant = commandant;
		}
	
	public boolean ajouterSoldat(Soldat recrue) {
		
		if (nbSoldats < armeeRomaine.length) {
			armeeRomaine[nbSoldats] = recrue;
			System.out.println("Le " + recrue.donnerAuteur() + recrue.nom + " : "
					+ "\"Je mets mon epee au service de Rome dans le camp dirige par \" " + commandant.nom);
			nbSoldats++;
			return true;
		}
		System.out.println("Le " + recrue.donnerAuteur() + commandant.nom + " : \" D�sol� " + recrue.nom
				+ " notre camp est complet ! \"");
		return false;
	}
	
	
	public void afficherCamp() {
		
		System.out.println("Le camp dirig� par " + commandant.donnerAuteur() +" contient les soldats : " );
		for(int i =0 ; i<nbSoldats ; i++) {
			
			System.out.println("- " +armeeRomaine[i].getNom());
		}
		
	}

	public void changerCommandant(Soldat commandant) {
		if (commandant.grade != Grade.CENTURION) {
			this.commandant = commandant;
			System.out.println("Le " + commandant.donnerAuteur() +" "+ commandant.nom
					+ " : \" Je ne suis pas suffisamment grad� pour prendre la direction du camp\r\n" + "romain. \".");
		} else {
			System.out.println("Le " + commandant.donnerAuteur() +" "+ commandant.nom + " \"Moi " + commandant.nom
					+ " je prends la direction du camp romain.\"");
		}
	}
	
	
	public Soldat getCommandant() {
		return commandant;
	}
	
}
