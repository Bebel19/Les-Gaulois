package batailles;

import personnages.Personnage;


public class HistoirePersonalisee implements Bataille {
	
	private Lieu lieu;
	private Personnage[] embuscadeurs;
	private Personnage[] victimes;
	private Personnage[] combatants;
 	
	public HistoirePersonalisee(Lieu lieu, Personnage[] embuscadeurs,Personnage[] victimes) {
		
		this.lieu = lieu;
		this.embuscadeurs = embuscadeurs;
		this.victimes =  victimes;
		this.combatants = new Personnage[embuscadeurs.length + victimes.length];
	    System.arraycopy(this.embuscadeurs, 0, this.combatants, 0, this.embuscadeurs.length);
	    System.arraycopy(this.victimes, 0, this.combatants, this.embuscadeurs.length, this.victimes.length );
	}
	
	
	
	public Lieu getLieu() {
		return lieu;
	}
	
	public Personnage[] getEmbuscadeurs() {
		return embuscadeurs;
		
	}
	
	public Personnage[] getVictimes() {
		return victimes;
		
	}
	public Personnage[] getCombatants() {
		return combatants;
		
	}



	@Override
	public void decrireContext() {
		System.out.println("Laissez moi vous conter une histoire qui à lieu dans");
	}
	@Override
	public void choisirPersonnages() {
		System.out.println("Choisissez vos personnages :");
	}
	@Override
	public void preparerLaBataille() {
		System.out.println("PrÃ©paration de la bataille :");
	}
	@Override
	public void decrireLaBataille() {
		System.out.println("Description de la bataille :");
	}
	@Override
	public void resultatBataille() {
		System.out.println("PrÃ©paration de la bataille :");
	}
	
}
