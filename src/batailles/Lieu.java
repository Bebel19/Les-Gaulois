package batailles;

import personnages.Personnage;

public class Lieu {
	private String nom;
	private String[] adjectifs;
	private String temporalite;
	private String meteo;
	
	public Lieu(String nom,String[] adjectifs, String temporalite, String meteo) {
		this.adjectifs = adjectifs;
		this.meteo = meteo;
		this.nom = nom;
		this.temporalite = temporalite;
	}
}
