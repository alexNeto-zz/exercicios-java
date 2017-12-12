package lista_10;

import lista_10.dependencias.exercicio_2.ContaBuraco;

import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Digite um texto:");
            String texto = input.nextLine();
            int quantidadeBuraco = ContaBuraco.contaTexto(texto);
            System.out.println("O somatório dos buracos de cada letra do texto é " + quantidadeBuraco);
        }
    }
}
