package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> adicionam elementos na fila

		// Diferenca e o comportamento, ocorre
		// quando a fila esta cheia!
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // lanca uma excecao
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		// Peek e Element -> obter o proximo elemento
		// da fila (sem remover)

		// Diferenca e o comportamento, ocorre
		// quando a fila esta vazia!
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lanca uma excecao
		System.out.println(fila.element());

		// Poll e Remove -> obter o proximo elemento
		// da fila (sem remover)

		// Diferenca e o comportamento ocorre
		// quando a fila esta vazia!
		System.out.println(fila.poll()); // retorna false
		System.out.println(fila.remove()); // lanca uma excecao
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());

		// fila.size()
		// fila.clear()
		// fila.isEmpty()
		// fila.contains();
	}

}
