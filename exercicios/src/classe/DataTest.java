package classe;

public class DataTest {

	public static void main(String[] args) {

		Data d1 = new Data();
		d1.dia = 12;
		d1.mes = 02;
		d1.ano = 2020;

		var d2 = new Data();
		d2.dia = 17;
		d2.mes = 02;
		d2.ano = 2020;

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

	}

}
