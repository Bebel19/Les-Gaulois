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
	
	private double protection(double force) {
		if(casque.getDefense() >0) {
			force-=2;
			System.out.println("Le casque attenue les d�gats de " + ArmesRomaines.CASQUE.getDefense());
		}
		else {
			casque = null;
		}
		if(bouclier.getDefense() >0) {
			force-=3;
			System.out.println("Le bouclier attenue les d�gats de " + ArmesRomaines.BOUCLIER.getDefense());
		}
		else {
			bouclier = null;
		}
		if(plastron.getDefense()>0) {
			force-=3;
			System.out.println("Le plastron attenue les d�gats de " + ArmesRomaines.PLASTRON.getDefense());
		}
		else {
			plastron = null;
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
	
	@Override
	public void recevoirCoup(double force) {
		if (casque != null && bouclier != null && plastron != null)
			force = protection(force);
		this.force -= force;
		if (this.force <= 0) {
			this.force = 0;
			this.parler("J'abandonne...");
		} else {
			this.parler("A�e !");
		}
	}
	

}