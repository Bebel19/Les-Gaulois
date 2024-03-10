package personnages;

public class Romain extends Personnage {

	public Romain(String nom, int force) {
		super(nom,force);
	}
	
	
	@Override
	public String donnerAuteur() {
		return "romain";
	}
}
