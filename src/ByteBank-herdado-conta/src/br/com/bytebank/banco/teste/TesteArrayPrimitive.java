public class TesteArrayPrimitive {

	// Array []
	public static void main(String[] args) {

		int[] idades = new int[5];

		idades[0] = 29;
		int idade1 = idades[0];

		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;

		}

		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);

		}

		System.out.println(idade1);


	}

}
