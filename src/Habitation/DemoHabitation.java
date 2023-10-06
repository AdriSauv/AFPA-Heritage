package Habitation;

public class DemoHabitation {
	public static void main(String[] args) {
        
		Habitation habitation1 = new Habitation("Adrien Sauvage", "142 rue du Routier", 90.3);
        Habitation habitation2 = new Habitation("Agustina Solimando", "456 Avenue Principale", 75.2);
		
        System.out.println("Habitation 1");
        habitation1.Affiche();
        System.out.println("Montant de l'impôt : " + habitation1.Impot() + " euros");

        System.out.println("\nHabitation 2 :");
        habitation2.Affiche();
        System.out.println("Montant de l'impôt : " + habitation2.Impot() + " euros");
        
        
		HabitationIndividuelle maison1 = new HabitationIndividuelle("Shakira", "123 Rue de la Maison", 420, 4, true);
        HabitationIndividuelle maison2 = new HabitationIndividuelle("John Mayer", "456 Avenue Maisonnette", 198.0, 3, false);
		
        System.out.println("\nMaison 1 :");
        maison1.Affiche();
        System.out.println("Montant de l'impôt : " + maison1.Impot() + " euros");

        System.out.println("\nMaison 2 :");
        maison2.Affiche();
        System.out.println("Montant de l'impôt : " + maison2.Impot() + " euros");
        
        HabitationProfessionnelle entreprise1 = new HabitationProfessionnelle("Apple .co", "789 Boulevard Entreprise", 500.0, 40);
        HabitationProfessionnelle entreprise2 = new HabitationProfessionnelle("Google .org", "101 Rue Technologie", 750.0, 9);

        
        System.out.println("\nEntreprise 1 :");
        entreprise1.Affiche();
        System.out.println("Montant de l'impôt : " + entreprise1.Impot() + " euros");

        System.out.println("\nEntreprise 2 :");
        entreprise2.Affiche();
        System.out.println("Montant de l'impôt : " + entreprise2.Impot() + " euros");
    }
}
