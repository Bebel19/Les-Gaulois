package personnages;

import batailles.Bataille;

public class Conteur {
    
    protected String nom;


    public Conteur(String nom ){
        this.nom = nom;
    }

    public void raconter(Bataille bataille) {
        System.out.println("Je raconte");
    }
}



