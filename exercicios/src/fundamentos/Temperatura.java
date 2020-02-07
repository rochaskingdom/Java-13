package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (˚F - 32) x 5/9 = ˚C

		final int AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;

		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado e " + celsius + "˚C.");
	}
}
