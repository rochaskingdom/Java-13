package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com a base e a altura do Triangulo: ");
		double base = entrada.nextDouble();
		double altura = entrada.nextDouble();

		final double area = (base * altura) / 2;

		System.out.printf("A Area do Triangulo e: %.2f", area);

		entrada.close();
	}
}
