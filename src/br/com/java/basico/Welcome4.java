package br.com.java.basico;

public class Welcome4 {

	public static void main(String[] args) {
		
		/* O primeiro argumento do m�todo printf � uma string de formato
		 * Especificadores de formato iniciam com um sinal de porcentagem (%) seguido por um caractere que representa o tipo de dados.
		 * Por exemplo, o especificador de formato %s � um marcador de lugar para uma string
		 * Em vez de usar a sequ�ncia de escape \n, utilizamos o especificador de formato %n, que � uma linha separadora
		 */
		System.out.println("Pulando linha normal");
		System.out.printf("%s%n%s%n","Pulando linha com", "Separador s = string e n = nova linha");

	}

}
