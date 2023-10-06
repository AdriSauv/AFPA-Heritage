package Habitation;

public class HabitationProfessionnelle extends Habitation {
	private int NbEmployes;
	
	public HabitationProfessionnelle(String P, String A, double S, int NbEmployes) {
        super(P, A, S);
        this.NbEmployes = NbEmployes;
    }
	
	@Override
    public double Impot() {
        double impotBase = 0;
        if (NbEmployes >= 10) {
            impotBase = (NbEmployes / 10) * 1000;
        }
        return impotBase + super.Impot();
    }
	
	@Override
	public void Affiche() {
        super.Affiche();
        System.out.println("Nombre d'employés : " + NbEmployes);
    }
	
	
	
}
