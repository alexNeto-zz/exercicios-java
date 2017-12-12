package lista_11.dependencias.exercicio_2;

public class AchaEquilibrio {

	private Integer[] array;
	private int length;
	private int index = 0;

	public AchaEquilibrio(int length) {
		this.length = length;
		this.array = new Integer[length];
	}

	public boolean add(Integer item) {
		if (index < length) {
			array[index] = item;
			index++;
			return true;
		} else {
			return false;
		}
	}

	public int achaEquilibrio() {
		if (index == 0) {
			return 0;
		} else if (index == 1) {
			return 1;
		}
		int tenta = 1;
		for (int i = 0; i < length; i++) {
			int somatorio1 = 0;
			int somatorio2 = 0;
			for (int j = 0; j <= tenta; j++) {
				somatorio1 += array[j];
			}
			for (int k = tenta; k < length; k++) {
				somatorio2 += array[k];
			}
			if (somatorio1 == somatorio2) {
				return tenta;
			} else {
				tenta++;
			}
		}
		return -1;
	}

}
