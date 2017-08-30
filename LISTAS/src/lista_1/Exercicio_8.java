package lista_1;

import lista_1.dependencias.Aluno;
import lista_1.dependencias.Professor;

public class Exercicio_8 {
	
	public static void exercicio() {
		Aluno aluno = new Aluno("João", 14433254, "3A");
		Professor prof = new Professor("Arakaki", 12121212);
		System.out.println(aluno.getNome());
		System.out.println(prof.getNome());
	}

}
