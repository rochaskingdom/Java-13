package fundamentos;

public class Wrappers {

	public static void main(String[] args) {

//		byte
		Byte b = 100;
		Short s = 1000;

//		Integer.parseInt(entrada.nextLine());
		Integer i = 10000;
		Long l = 10000000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
//		float
		Float f = 123.03F;
		System.out.println(f);
		
//		double
		Double d = 1234.5678;
		System.out.println(d);
		
//		boolean
		Boolean bo = Boolean.parseBoolean("true"); 
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
//		char
		Character c = '#';
		System.out.println(c + "...");

	}
}
