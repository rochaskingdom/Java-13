package controle.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	/**
	 * 1. Criar um programa que receba um número e verifique se ele está entre 0 e
	 * 10 e é par;
	 */

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		int numero = entrada.nextInt();

		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.printf("O numero %d está entre 0 e 10 e é um par.", numero);
			} else {
				System.out.printf("O numero %d está entre 0 e 10 mas não é um par.", numero);
			}
		} else {
			System.out.printf("O numero %d não está entre 0 e 10.", numero);
		}

		entrada.close();
	}

}
