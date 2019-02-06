
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Bienvenue chez Barette!\n");

		String competence[] = { "codage en Java", "codage en HTML" };

		CV cv = new CV("Daroua", "Aymane", "Gestion et création de logiciels informatiques", 0, competence, "Aucune");

		cv.affiche();

	}

}
