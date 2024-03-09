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
        // Applique la défense de chaque équipement si présent
        if (casque != null) {
            force -= casque.getDefense();
            System.out.println("Le casque attenue les dégats de " + casque.getDefense());
        }
        if (bouclier != null) {
            force -= bouclier.getDefense();
            System.out.println("Le bouclier attenue les dégats de " + bouclier.getDefense());
        }
        if (plastron != null) {
            force -= plastron.getDefense();
            System.out.println("Le plastron attenue les dégats de " + plastron.getDefense());
        }
        
        return Math.max(0, force); // Assure que la force n'est jamais négative
    }
	
	public void equiperArmure() {
        if (casque == null) {
            casque = ArmesRomaines.CASQUE;
            System.out.println("Le soldat "+nom+" s'ï¿½quipe d'un casque.");
            }
        else
            parler("J'ai dï¿½ja un casque");

        if (plastron == null) {
            plastron = ArmesRomaines.PLASTRON;
            System.out.println("Le soldat "+nom+" s'ï¿½quipe d'un plastron.");
        }
        else
            this.parler("J'ai dï¿½ja un plastron");
        if (bouclier == null) {
            bouclier = ArmesRomaines.BOUCLIER;
            System.out.println("Le soldat "+nom+" s'ï¿½quipe d'un bouclier.");
        }
        else 
            this.parler("J'ai dï¿½ja un bouclier");

    }

}