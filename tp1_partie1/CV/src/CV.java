
public class CV {

	private String nom;
	private String prenom;
	private String formation;
	private int nbrAnneesExperienceTravail;
	private String[] competences;
	private String attentes;

	public CV( String nom, String prenom, String formation, int nbrAnneesExperienceTravail, String[] competences,
			String attentes ) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.formation = formation;
		this.nbrAnneesExperienceTravail = nbrAnneesExperienceTravail;
		this.competences = competences;
		this.attentes = attentes;
		
	}

	public void affiche() {

		System.out.println("\n" + this.prenom + " " + this.nom + "\n" + "Formation : " + this.formation + "\n"
				+ "Expérience de travail : " + this.nbrAnneesExperienceTravail + "\n" + "Compétences : ");

		for (int a = 0; a < this.competences.length; a++) {

			System.out.print(this.competences[a]);

			if (this.competences.length != a - 1) {

				System.out.print(", ");

			} else {

				System.out.print(".");

			}

		}

		System.out.println("\n" + "attentes : " + attentes + "\n");

	}

}
