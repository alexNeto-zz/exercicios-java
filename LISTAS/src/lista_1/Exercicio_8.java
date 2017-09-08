package lista_1;

import lista_1.dependencias.exercicio_8.Aluno;
import lista_1.dependencias.exercicio_8.Professor;

public class Exercicio_8 {
	
	public static void exercicio() {
		Aluno aluno = new Aluno("João", 14433254, "3A");
		Professor prof = new Professor("Arakaki", 12121212);
		System.out.println(aluno.getNome());
		System.out.println(prof.getNome());
	}

}
