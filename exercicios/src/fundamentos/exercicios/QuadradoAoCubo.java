package fundamentos.exercicios;

import java.util.Scanner;

public class QuadradoAoCubo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com um valor: ");
		double valor = entrada.nextDouble();

		final double quadrado = Math.pow(valor, 2);
		final double cubo = Math.pow(valor, 3);
		
		System.out.printf("O valor ao Quadrado e: %.2f"
				+ "\nO valor ao Cubo e: %.2f ", quadrado, cubo);
		
		entrada.close();
	}
}
