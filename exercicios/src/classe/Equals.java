package classe;

//import java.util.Date;

public class Equals {

	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Vinicius Rocha";
		u1.email = "viniciusr.rocha@outlook.com";

		Usuario u2 = new Usuario();
		u2.nome = "Vinicius Rocha";
		u2.email = "viniciusr.rocha@outlook.com";

		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));

		//System.out.println(u2.equals(new Date()));
	}

}
