package ExercicioLacoCondicional;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String args[]) {
		
		int x,y,z;
		
		try (Scanner ler = new Scanner(System.in)) {
			
			System.out.println("Digite o primeiro n�mero inteiro, por favor: ");
			x = ler.nextInt();
			System.out.println("Digite o segundo n�mero inteiro: ");
			y = ler.nextInt();
			System.out.println("Digite o terceiro n�mero inteiro: ");
			z = ler.nextInt();
			
			if(x > y && x > z)
			{
				System.out.println("O maior n�mero � o primeiro: " + x);
			}
			else if(y>x && y>z) 
			{
				System.out.println("O maior n�mero � o segundo: " + y);	
			} else {
		
				System.out.println("O maior n�mero � o terceiro: " + z);
			}
		}
	}
}
