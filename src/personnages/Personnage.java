package personnages;

public abstract class Personnage {
	
	
	protected String nom;
	protected int force;
	
	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	
	public void parler(String paroles) {
		System.out.println("Le " + donnerAuteur() +" " + nom + " : " + "\""+paroles+"\"");
	}
	
	protected double calculFrappe(double force) {
		return force;
	}
	
	protected double protection(double forceFrappe){
		return forceFrappe;
	}
	
	public void frapper(Personnage victime) {
		if(!victime.estATerre() && !this.estATerre()) {
			this.parler("envoie un grand coup dans la mâchoire de " + victime.getNom() + " avec une force de " + force);
			victime.recevoirCoup(calculFrappe(force));
		}
		else {
			this.parler("Je ne peux plus me battre...");
		}
	}
	
	public void recevoirCoup(double force) {
		
		this.force -=  protection(force);
		
		if (this.force <= 0) {
			this.force = 0;
			this.parler("J'abandonne...");
		} else {
			this.parler("Aïe !");
			
		}
	}
	
	public boolean estATerre() {
	    return this.force <= 0; // Le personnage est KO
	}
	
	public String getNom() {
		return nom;
	}
	
	protected abstract String donnerAuteur();
	
}