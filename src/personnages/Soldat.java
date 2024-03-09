package personnages;

import Equipements.ArmesRomaines;

public class Soldat extends Romain{
	
	public Grade grade; 
	private ArmesRomaines casque = null;
	private ArmesRomaines bouclier = null;
	private ArmesRomaines  plastron = null;
	
	public Soldat(String nom, int force, Grade grade) {
		super(nom,force); 
		this.grade = grade; 
	}

	@Override
	protected double protection(double force) {
		if (casque != null && bouclier != null && plastron != null) {
			if(casque.defense >0) {
				force-=2;
				System.out.println("Le casque attenue les d�gats de " + casque.defense);
			}
			else {
				casque.defense = 0;
			}
			if(bouclier.defense >0) {
				force-=3;
				System.out.println("Le bouclier attenue les d�gats de " + bouclier.defense);
			}
			else {
				bouclier.defense = 0;
			}
			if(plastron.defense >0) {
				force-=3;
				System.out.println("Le plastron attenue les d�gats de " + plastron.defense);
			}
			else {
				plastron.defense = 0;
			}
			if(force<0) {
				force=0;
			}
			
		return force;
	}

	
	
	public void equiperArmure() {
        if (casque == null) {
            casque = ArmesRomaines.CASQUE;
            System.out.println("Le soldat "+nom+" s'�quipe d'un casque.");
            }
        else
            parler("J'ai d�ja un casque");

        if (plastron == null) {
            plastron = ArmesRomaines.PLASTRON;
            System.out.println("Le soldat "+nom+" s'�quipe d'un plastron.");
        }
        else
            this.parler("J'ai d�ja un plastron");
        if (bouclier == null) {
            bouclier = ArmesRomaines.BOUCLIER;
            System.out.println("Le soldat "+nom+" s'�quipe d'un bouclier.");
        }
        else 
            this.parler("J'ai d�ja un bouclier");

    }

}