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
        // Applique la d�fense de chaque �quipement si pr�sent
        if (casque != null) {
            force -= casque.getDefense();
            System.out.println("Le casque attenue les d�gats de " + casque.getDefense());
        }
        if (bouclier != null) {
            force -= bouclier.getDefense();
            System.out.println("Le bouclier attenue les d�gats de " + bouclier.getDefense());
        }
        if (plastron != null) {
            force -= plastron.getDefense();
            System.out.println("Le plastron attenue les d�gats de " + plastron.getDefense());
        }
        
        return Math.max(0, force); // Assure que la force n'est jamais n�gative
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