package ExercicioLacoCondicional;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String args[]) {
		
		double a,b,c;
		
		try (Scanner ler = new Scanner(System.in)) {
			
			System.out.println("Digite o primeiro n�mero de sua prefer�ncia, por favor: ");
			a = ler.nextInt();
			System.out.println("Digite o segundo n�mero: ");
			b = ler.nextInt();
			System.out.println("Digite o terceiro e �ltimo n�mero: ");
			c = ler.nextInt();
			
			if(a<b && b<c)
			{
				System.out.printf("A ordem crescente entre esses n�meros �: ", a, c, b);
			}
			else if(a<c && c<b)
			{
				System.out.printf("A ordem crescente entre esses n�meros �: ", a, c, b);
			}
			else if(b<a && a<c)
			{
				System.out.printf("A ordem crescente entre esses n�meros �: ", b, a, c);
			}
			else if(b<c && c<a)
			{
				System.out.printf("A ordem crescente entre esses n�meros �: ", b, c, a);
			}
			else if(c<a && a<b)
			{
				System.out.printf("A ordem crescente entre esses n�meros �: ", c, a, b);
			}
			else if(c<b && b<a)
			{
				System.out.printf("A ordem crescente entre esses n�meros �: %2.2f ", c, b, a);
			}
		}
	}
}
