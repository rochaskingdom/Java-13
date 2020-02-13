package classe;

public class Produto {

	String nome;
	double preco;
	double desconto;

	Produto() {

	}

	Produto(String nomeInicial, double precoInicial, double descontoInicial) {
		this.nome = nomeInicial;
		this.preco = precoInicial;
		this.desconto = descontoInicial;
	}

	double precoComDesconto() {
		return this.preco * (1 - this.desconto);
	}

	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
