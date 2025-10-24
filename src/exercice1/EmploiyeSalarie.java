package exercice1;

public class EmploiyeSalarie extends Employe{
	private double salaire ;

	public EmploiyeSalarie(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public double calculerSalaire() {
		return salaire;
	}
	
	
}
