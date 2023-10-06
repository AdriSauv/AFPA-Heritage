package Habitation;

public class HabitationIndividuelle extends Habitation {
	private int NbPieces;
    private boolean Piscine;
    
    public HabitationIndividuelle(String P, String A, double S, int NbPieces, boolean Piscine) {
        super(P, A, S);
        this.NbPieces = NbPieces;
        this.Piscine = Piscine;
    }
    
    @Override
    public double Impot() {
        double impotBase = NbPieces * 100;
        double impotTotal = impotBase;
        if (Piscine) {
            impotTotal += 500;
        }
        return impotTotal;
    }
    
    @Override
    public void Affiche() {
        super.Affiche();
        System.out.println("Nombre de pièces : " + NbPieces);
        System.out.println("Piscine : " + (Piscine ? "Oui" : "Non"));
    }
}
