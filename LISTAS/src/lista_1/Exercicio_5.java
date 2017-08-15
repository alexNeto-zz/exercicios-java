package lista_1;

public class Exercicio_1 {
	
	/*
		Desenvolva um aplicativo que determinar� se um cliente de uma loja de departamentos
		excedeu o limite de cr�dito em uma conta-corrente. Para cada cliente, os seguintes
		fatos est�o dispon�veis: n�mero da conta, saldo no in�cio do m�s, total de todos os
		itens cobrados desse cliente no m�s, total de cr�ditos aplicados ao cliente no m�s
		e limite de cr�dito autorizado. O programa deve inserir todos esses fatos com ponteiros,
		calcular o novo saldo (= saldo inicial + despesas - cr�ditos), exibir o novo saldo e
		determinar se o novo saldo excede o limite de cr�dito do cliente. Avisar se o
		cr�dito do cliente est� excedido ou n�o.
	*/
	
	java.util.Scanner input = new java.util.Scanner(System.in);
	
	System.out.println("Digite um n�mero: ");
	int numero1 = input.nextInt();
	System.out.println("Digite outro n�mero: ");
	int numero2 = input.nextInt();
	
	System.out.println((numeros1 % numero2 == 0) ? "� divisivel" : "n�o � divisivel");
}
