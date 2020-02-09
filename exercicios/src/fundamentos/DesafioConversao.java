package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro salario: ");
		String salario1 = entrada.next().replace(",", ".");
		
		System.out.print("Informe o segundo salario: ");
		String salario2 = entrada.next().replace(",", ".");
		
		System.out.print("Informe o terceiro salario: ");
		String salario3 = entrada.next().replace(",", ".");
			
		double parse1 = Double.parseDouble(salario1);
		double parse2 = Double.parseDouble(salario2);
		double parse3 = Double.parseDouble(salario3);
		
		double soma = parse1 + parse2 + parse3;
		System.out.println("Total de: " + soma + "\n");
		System.out.println("A media dos salarios e: " + soma / 3);
		
		entrada.close();
	}
}







