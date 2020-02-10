package fundamentos.exercicios;

import java.util.Scanner;

public class CelsiusFahrenheit {

	public static void main(String[] args) {
		// (0 °C × 9/5) + 32 = 32 °F

		Scanner entrada = new Scanner(System.in);

		final double FATOR = 9.0 / 5.0;
		final double AJUSTE = 32;

		System.out.println("Valor em Celsius: ");

		int celsius = entrada.nextInt();
		double fahrenheit = (celsius * FATOR) + AJUSTE;
		System.out.println("Convertido para Fhrenheit: " + fahrenheit + " °F");

		entrada.close();
	}

}
