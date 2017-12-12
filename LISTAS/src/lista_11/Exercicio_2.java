package lista_11;

import lista_11.dependencias.exercicio_2.AchaEquilibrio;

public class Exercicio_2 {
	
	public static void main(String[] args) {
		AchaEquilibrio array = new AchaEquilibrio(7);
		System.out.println(array.add(-7) ? "item adicionado" : "item não adicionado");
		System.out.println(array.add(1) ? "item adicionado" : "item não adicionado");
		System.out.println(array.add(5) ? "item adicionado" : "item não adicionado");
		System.out.println(array.add(2) ? "item adicionado" : "item não adicionado");
		System.out.println(array.add(-4) ? "item adicionado" : "item não adicionado");
		System.out.println(array.add(3) ? "item adicionado" : "item não adicionado");
		System.out.println(array.add(0) ? "item adicionado" : "item não adicionado");
		int equilibrio = array.achaEquilibrio();
		System.out.println(equilibrio != -1 ? "O equilibrio é o indice " + equilibrio : "O array não possue indice de equilibrio");
	}

}
