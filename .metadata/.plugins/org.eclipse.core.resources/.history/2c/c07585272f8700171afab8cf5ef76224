package lista_1;

public class Exercicio_8 {

	public static void exercicio(int numero) {

		int[] d = new int[4];

		d[0] = numero % 10;
		d[1] = (numero / 10) % 10;
		d[2] = (numero / 100) % 10;
		d[3] = (numero / 1000) % 10;

		d = criptografa(d);
		System.out.printf("%d%d%d%d\n", d[3], d[2], d[1], d[0]);
		d = descriptografa(d);
		System.out.printf("%d%d%d%d\n", d[3], d[2], d[1], d[0]);
	}

	public static int[] criptografa(int[] d) {

		for (int i = 0; i < d.length; i++) {
			d[i] += 7;
			d[i] %= 10;
		}
		for (int i = 0; i < (d.length / 2); i++) {
			d[i] += d[i + 2];
			d[i + 2] = d[i] - d[i + 2];
			d[i] -= d[i + 2];
		}
		return d;
	}

	public static int[] descriptografa(int[] d) {
		for (int i = 0; i < d.length; i++) {
			d[i] = (d[i] > 7) ? d[i] - 7: d[i] + 3;
			d[i] %= 10;
		}
		for (int i = 0; i < (d.length / 2); i++) {
			d[i] += d[i + 2];
			d[i + 2] = d[i] - d[i + 2];
			d[i] -= d[i + 2];
		}

		return d;
	}

}
