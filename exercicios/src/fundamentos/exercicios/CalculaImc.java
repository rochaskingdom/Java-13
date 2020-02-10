package fundamentos.exercicios;

import java.util.Scanner;

public class CalculaImc {

	public static void main(String[] args) {
		// IMC = peso / altura x altura
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe seu peso: ");
		Double peso = entrada.nextDouble();
		
		System.out.println("Informe sua altura: ");
		double altura = entrada.nextDouble();
		
		final double imc = peso / (altura * altura);
		
		System.out.printf("Seu IMC e: %.2f", imc);
		
		entrada.close();
		
	}

}
