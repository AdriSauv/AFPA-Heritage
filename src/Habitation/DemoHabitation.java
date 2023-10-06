package Habitation;

public class DemoHabitation {
	public static void main(String[] args) {
        
        Habitation habitation1 = new Habitation("Adrien Sauvage", "142 Rue Emile Zola", 89.3);
        Habitation habitation2 = new Habitation("Agustina Solimando", "456 Avenue Principale", 75.2);

        
        System.out.println("Habitation 1 :");
        habitation1.Affiche();
        System.out.println("Montant de l'impôt : " + habitation1.Impot() + " euros");

        System.out.println("\nHabitation 2 :");
        habitation2.Affiche();
        System.out.println("Montant de l'impôt : " + habitation2.Impot() + " euros");
    }
}
