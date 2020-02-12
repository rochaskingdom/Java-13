package controle.exercicios;

import java.util.Scanner;

public class Exercicio2 {

//	Criar um programa informa se o ano atual é um ano bissexto;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o ano atual: ");
		int ano = entrada.nextInt();

		if (ano % 4 == 0) {
			System.out.printf("%d é um ano bissexto!", ano);
		} else {
			System.out.printf("%d é um ano bissexto!", ano);
		}

		entrada.close();
	}

}
