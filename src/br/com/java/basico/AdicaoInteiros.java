package br.com.java.basico;

import java.util.Scanner;

public class AdicaoInteiros {

	public static void main(String[] args) {
		
		// programa de adição que insere dois números,então exibe a soma deles
		// cria um scanner para obter a entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.println("Digite o primeiro número: ");
		
		number1 = input.nextInt(); //lê o primeiro número fornecido
		
		System.out.println("Digite o segundo número: ");
		
		number2 = input.nextInt(); //lê o segundo número fornecido
		
		sum = number1 + number2;
		
		System.out.printf("Soma é %d%n", sum); // usando printf para apresentar em d o número digitado
		
		System.out.println("Soma é: " + sum); // usando o println
		
	}

}
