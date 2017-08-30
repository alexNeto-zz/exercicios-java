package lista_1.dependencias;

public class OperadoresLogicos {

	public void and(boolean[] coluna1, boolean[] coluna2, boolean[] resultado) {
		for (int n = 0; n < 4; n++) {
			resultado[n] = coluna1[n] && coluna2[n];
			System.out.printf("%s and %s = %s\n", coluna1[n], coluna2[n], resultado[n]);
		}
	}

	public void or(boolean[] coluna1, boolean[] coluna2, boolean[] resultado) {
		for (int n = 0; n < 4; n++) {
			resultado[n] = coluna1[n] || coluna2[n];
			System.out.printf("%s and %s = %s\n", coluna1[n], coluna2[n], resultado[n]);
		}
	}

	public void not(boolean[] coluna1, boolean[] resultado) {
		for (int n = 0; n < 2; n++) {
			resultado[n] = !coluna1[n];
			System.out.printf("%s and %s = %s\n", coluna1[n], resultado[n]);
		}
	}
}
