package personnages;

import batailles.Bataille;

public class Conteur {
    
    protected String nom;
    private Bataille bataille;


    public Conteur(String nom ){
        this.nom = nom;
    }

    public void raconter(Bataille bataille) {
        System.out.println("Je raconte");
        decrireContext();
        choisirPersonnages();
        preparerLaBataille();
        decrireLaBataille();
        resultatBataille();
    }
    
	private void decrireContext() {
		System.out.print("Décriscription du context :");
	}
	
	private void choisirPersonnages() {
		System.out.print("Choisissez vos personnages :");
	}
	
	private void preparerLaBataille() {
		System.out.print("Préparation de la bataille :");
	}
	
	private void decrireLaBataille() {
		System.out.print("Description de la bataille :");
	}
	
	private void resultatBataille() {
		System.out.print("Préparation de la bataille :");
	}
}



