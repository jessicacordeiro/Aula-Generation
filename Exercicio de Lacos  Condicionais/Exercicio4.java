package ExercicioLacoCondicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String args[]) {
		
		double numero,raiz,potencia;
		
		try (Scanner ler = new Scanner(System.in)) {
			
			System.out.println("Digite algum n�mero de sua prefer�ncia, por favor: ");
			numero = ler.nextDouble();
			
			if(numero%2 == 0)
			{
				raiz = Math.sqrt(numero);
				System.out.println("Seu n�mero � par e a raiz quadrada dele �: " + raiz);
			}
			else if(numero%2 !=0)
			{
				potencia = Math.pow(numero, 2);
				System.out.println("Seu n�mero � �mpar e a pot�ncia dele �: " + potencia);
			}
		}
	}
}
