package exercice1;

public class Test {

	public static void main(String[] args) {

		Employe[] emploiyes = new Employe[4];

		Entreprise entreprise = new Entreprise(emploiyes);
		entreprise.ajouterEmploye(new EmploiyeHoraire("El Idrissi", "Mohamed", 15.0, 160));
		entreprise.ajouterEmploye(new EmploiyeSalarie("Bentaleb", "Fatima", 2500.0));
		entreprise.ajouterEmploye(new Vendeur("Chouaib", "Youssef", 2000.0, 500.0));
		entreprise.ajouterEmploye(new EmploiyeHoraire("Lahlou", "Salma", 12.0, 120));
		
		entreprise.afficherPaie();
	}

}
