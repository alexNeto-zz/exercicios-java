package lista_1;

import lista_1.dependencias.exercicio_7.OperadoresLogicos;

public class Exercicio_7 {

	public static void exercicio() {
		boolean[] coluna1 = { true, true, false, false };
		boolean[] coluna2 = { true, false, true, false };
		boolean[] resultado = new boolean[4];

		OperadoresLogicos operadores = new OperadoresLogicos();

		operadores.and(coluna1, coluna2, resultado);
		operadores.or(coluna1, coluna2, resultado);
		operadores.not(coluna1, resultado);
	}
}