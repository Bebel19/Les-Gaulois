package Equipements;

public enum ArmesRomaines {
	    CASQUE("Casque", 2),
	    BOUCLIER("Bouclier", 3),
	    PLASTRON("Plastron", 3);

	    private final String nom;
	    private final int defense;

	    ArmesRomaines(String nom, int defense) {
	        this.nom = nom;
	        this.defense = defense;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public int getDefense() {
	        return defense;
	    }
	}
