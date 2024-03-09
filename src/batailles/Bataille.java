package batailles;


public interface Bataille {
	
	private void decrireContext() {
		System.out.print("Décriscription du context :");
	}
	
	private void choisirPersonnages() {
		System.out.print("Choisissez vos personnages :");
	}
	
	private void preparerLaBataille() {
		System.out.print("Préparation de la bataille :");
	}
	
	private void decrireLaBataille() {
		System.out.print("Description de la bataille :");
	}
	
	private void resultatBataille() {
		System.out.print("Préparation de la bataille :");
	}
}
