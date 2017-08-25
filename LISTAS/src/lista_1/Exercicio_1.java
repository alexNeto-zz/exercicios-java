package lista_1;

public class Exercicio_1 {

	public static void exercicio() {
		Print.print();
		System.out.println("--------------------------");
		Println.println();
		System.out.println("--------------------------");
		Printf.printf();
	}
}

class Print {
	public static void print() {
		System.out.print("print - Imprimi uma string no console, sem pular linha");
	}
}

class Printf {
	public static void printf() {
		String s1 = "como essa";
		String s2 = "ou essa";
		System.out.printf(
				"printf - Imprimi uma String formatada, ou seja,\npodemos colocar valores de variável\nno meio do texto, %s %s",
				s1, s2);
	}
}

class Println {
	public static void println() {
		System.out.println("println - semelhante ao print, porém pula uma linha");
	}
}
