package lista_1;

public class Exercicio_5 {
	
	public static void exercicio() {
		While.mwhile();
		System.out.println();
		For.mfor();
	}

}

class While {

	public static void mwhile() {
		int n = 8;
		System.out.println("********");
		while (n <= 8) {
			System.out.println("*      *");
		}
		System.out.println("********");
	}
}

class For {

	public static void mfor() {
		System.out.println("********");
		for (int n = 8; n > 0; n--) {
			System.out.println("*      *");
		}
		System.out.println("********");
	}
}
