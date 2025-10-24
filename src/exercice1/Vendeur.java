package exercice1;

public class Vendeur extends EmploiyeSalarie {
	private double comission;

	public Vendeur(String nom, String prenom, double salaire, double comission) {
		super(nom, prenom, salaire);
		this.comission = comission;
	}

	public double getComission() {
		return comission;
	}

	public void setComission(double comission) {
		this.comission = comission;
	}

	public double calculerSalaire() {
		return this.getSalaire() + comission ;
	}
}
