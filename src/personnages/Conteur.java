package personnages;

import batailles.Bataille;

public class Conteur {
    
    protected String nom;
    private Bataille bataille;


    public Conteur(String nom ){
        this.nom = nom;
    }

    public void raconter(Bataille bataille) {
        decrireContext();
        choisirPersonnages();
        preparerLaBataille();
        decrireLaBataille();
        resultatBataille();
    }
    
	private void decrireContext() {
		System.out.println("Laissez moi vous conter une histoire qui � lieu dans");
	}
	
	private void choisirPersonnages() {
		System.out.println("Choisissez vos personnages :");
	}
	
	private void preparerLaBataille() {
		System.out.println("Préparation de la bataille :");
	}
	
	private void decrireLaBataille() {
		System.out.println("Description de la bataille :");
	}
	
	private void resultatBataille() {
		System.out.println("Préparation de la bataille :");
	}
}



