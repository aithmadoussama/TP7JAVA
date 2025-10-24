package exercice1;

public class Entreprise {
	private Employe[] employes;
	private int nb;

	public Entreprise(Employe[] employes) {
		this.employes = employes;
		this.nb = 0;
	}

	public Employe[] getEmployes() {
		return employes;
	}

	public void setEmployes(Employe[] employes) {
		this.employes = employes;
	}

	public int getNb() {
		return nb;
	}

	public void setNb(int nb) {
		this.nb = nb;
	}

	public void ajouterEmploye(Employe e) {
		if (nb == employes.length) {
			Employe[] temp = new Employe[employes.length * 2];
			System.arraycopy(employes, 0, temp, 0, employes.length);
			employes = temp;
		}
		employes[nb++] = e;
	}

	public double masseSalariale() {
		double somme = 0;
		for (int i = 0; i < nb; i++) {
			somme += employes[i].calculerSalaire();
		}
		return somme;
	}
	
	public void afficherPaie() {
        System.out.println("=== Bulletin de paie ===");
        for (int i = 0; i < nb; i++) {
            System.out.println(employes[i]);
        }
        System.out.println("Masse salariale totale : " 
            + String.format("%.2f", masseSalariale()) + "€");
    }

}
