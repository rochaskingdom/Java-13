package fundamentos.exercicios;

import java.util.Scanner;

public class FahrenheitCelsius {

	public static void main(String[] args) {
		// (32 °F − 32) × 5/9 = 0 °C
		
		Scanner entrada = new Scanner(System.in);
		
		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;
		
		System.out.println("Valor em Fahrenheit: ");
		
		int fahrenheit = entrada.nextInt();
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("Convertido para Celsius: " + celsius);
		
		entrada.close();
	}

}
