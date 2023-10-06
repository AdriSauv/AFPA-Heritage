package Habitation;

public class DemoHabitation {
	public static void main(String[] args) {
        
		HabitationIndividuelle maison1 = new HabitationIndividuelle("Adrien Sauvage", "123 Rue de la Maison", 150.0, 4, true);
        HabitationIndividuelle maison2 = new HabitationIndividuelle("Agustina Solimando", "123 Avenue Maison", 120.0, 3, false);

        
        System.out.println("Maison 1 :");
        maison1.Affiche();
        System.out.println("Montant de l'impôt : " + maison1.Impot() + " euros");

        System.out.println("\nMaison 2 :");
        maison2.Affiche();
        System.out.println("Montant de l'impôt : " + maison2.Impot() + " euros");
    }
}
