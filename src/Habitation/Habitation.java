package Habitation;

public class Habitation {
	
	// Attributs
	
	protected String proprietaire;
	protected String adresse;
	protected double surface;
	
	// Constructeur
	
	public Habitation(String P, String A, double S) {
		this.proprietaire = P;
		this.adresse = A;
		this.surface = S;
	}
	
	// Méthode pour calculer impots
	
	public double Impot() {
        return surface * 2; // 2 euros par mètre carré
    }
	
	// Méthode pour afficher les attributs de la classe Habitation
    public void Affiche() {
        System.out.println("Propriétaire : " + proprietaire);
        System.out.println("Adresse : " + adresse);
        System.out.println("Surface : " + surface + " m²");
    }
	
	
    
    
    
    
}
