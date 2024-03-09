package personnages;

import Equipements.Gaulois.Potion;

public class Gaulois extends Personnage {
    private double puissancePotion = 1.0; // Puissance initiale sans potion

    public Gaulois(String nom, int force) {
        super(nom, force);
    }
	
    public void boirePotion(Potion potion) {
        if ("Obélix".equals(this.nom)) {
            this.parler("Non, non, non ! Je n'ai pas le droit de boire de la potion magique !");
            return;
        }
        this.puissancePotion = potion.getPuissance();
        this.parler("boit une potion de puissance " + this.puissancePotion);
    }

    
	@Override
	protected double calculFrappe(double force) {
		double forceFrappe = this.force * this.puissancePotion;
		this.puissancePotion = Math.max(1.0, this.puissancePotion - 0.5); //Diminue la puissance de la potion
		return forceFrappe;
	}
	

    @Override
	public String donnerAuteur() {
        return "Gaulois";
    }

	public void setPuissancePotion(int puissance) {
		puissancePotion = puissance;
		
	}
}



