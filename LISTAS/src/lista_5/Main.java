package lista_5;

import java.util.Scanner;

import lista_4.AppMan;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escola o exercicio: 1 - agenda\n2 - Exercicio 2\n3 - Exercicio 3");
		int escolha = scanner.nextInt();
		if (escolha == 1) {
			AppMan app = new AppMan();
			int sair = 0;
			int opcao = 0;
			while (sair == 0) {
				switch (opcao) {
				case 0:
					app.imprimirOpcoes();
					opcao = scanner.nextInt();
					break;
				case 1:
					app.cadastrarNovoAluno();
					opcao = 0;
					break;
				case 2:
					app.cadastrarNovoProfessor();
					opcao = 0;
					break;
				case 3:
					app.listarTodos();
					opcao = 0;
					break;
				case 4:
					app.editar();
					opcao = 0;
					break;
				case 5:
					app.deletar();
					opcao = 0;
					break;
				case 6:
					sair = 1;
					System.out.println("\nAté mais!");
					break;
				default:
					app.imprimirOpcoes();
					opcao = scanner.nextInt();
					break;
				}
			}
		} else if (escolha == 2) {
			System.out.println("EXERCICIO 2");
			System.out.println("Digite o tamanho do quadrado (1-20):");
			Exercicio_2.exercicio(scanner.nextInt());
		} else if (escolha == 3) {
			System.out.println("EXERCICIO 3");
			System.out.println("Digite três números não nulos e positivos");
			double[] numeros = new double[3];
			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = scanner.nextDouble();				
			}
			Exercicio_3.exercicio(numeros);
		} else {
			System.out.println("não tem essa opção");
		}

	}

}
