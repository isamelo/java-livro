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
		
		System.out.print("Digite o primeiro n�mero: "); 
		//  Utilizamos o m�todo print aqui para que a entrada do usu�rio apare�a na mesma linha que o prompt
		
		number1 = input.nextInt(); //l� o primeiro n�mero fornecido
		
		System.out.print("Digite o segundo n�mero: ");
		
		number2 = input.nextInt(); //l� o segundo n�mero fornecido
		
		sum = number1 + number2;
		
		System.out.printf("Soma � %d%n", sum); 
		// usando printf para apresentar em d o n�mero digitado -- a letra d significa �inteiro decimal"
		
		System.out.println("Soma �: " + sum); // usando o println
		
		System.out.println("Soma �: " + (number1 + number2)); // somando dentro da instru��o printf

	}

}
