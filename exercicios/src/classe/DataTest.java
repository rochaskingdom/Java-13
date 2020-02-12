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

		System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);

	}

}
