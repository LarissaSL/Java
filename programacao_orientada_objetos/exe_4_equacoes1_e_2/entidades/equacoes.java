package entidades;

public class equacoes {

	public int a;
	public int b;
	public int c;

	public int equacao1Grau() {
		return (c - b) / a;
	}

	public int delta() {
		return (int) Math.pow(b, 2) - 4 * a * c;
	}

	public void equacao2GrauX(int delta) {
		int x1 = (-b + (int) Math.sqrt(delta)) / 2 * a;
		int x2 = (-b - (int) Math.sqrt(delta)) / 2 * a;

		System.out.println("X¹ = " + x1 + " e X² = " + x2);
	}
	

	public String toString() {
		return "\nNúmeros inseridos\n"
				+ "A = "
				+ a
				+ "\nB = "
				+ b
				+ "\nC = "
				+ c;
	}

}
