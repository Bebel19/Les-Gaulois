package batailles;

import java.util.List;

public class Bataille {
    private List<Combattant> combattants;
    private Lieu lieu;

    public Bataille(List<Combattant> combattants, Lieu lieu) {
        this.combattants = combattants;
        this.lieu = lieu;
    }

    public void demarrer() {
        // Logique de démarrage de la bataille
    }
}