package exercice1;

public class EmploiyeHoraire extends Employe {
	private double taux;
	private double heures;

	public EmploiyeHoraire(String nom, String prenom, double taux, double heures) {
		super(nom, prenom);
		this.taux = taux;
		this.heures = heures;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public double getHeures() {
		return heures;
	}

	public void setHeures(double heures) {
		this.heures = heures;
	}

	@Override
    public double calculerSalaire() {
        return taux * heures;
    }
	

}
