package br.com.java.basico;

import java.util.Scanner;

public class AdicaoInteiros {

	public static void main(String[] args) {
		
		// programa de adi��o que insere dois n�meros,ent�o exibe a soma deles
		// cria um scanner para obter a entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.println("Digite o primeiro n�mero: ");
		
		number1 = input.nextInt(); //l� o primeiro n�mero fornecido
		
		System.out.println("Digite o segundo n�mero: ");
		
		number2 = input.nextInt(); //l� o segundo n�mero fornecido
		
		sum = number1 + number2;
		
		System.out.printf("Soma � %d%n", sum); // usando printf para apresentar em d o n�mero digitado
		
		System.out.println("Soma �: " + sum); // usando o println
		
	}

}
