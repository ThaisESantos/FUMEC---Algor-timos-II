package Projeto1;

import java.util.*;

public class testeWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		int i = 1;
		
		while ( i <= 5) {
			System.out.print("digite o numero: ");
			num = leia.nextInt();
			
			while (num<0)
			{ 
				System.out.println("erro, numero deve ser positivo, digite novamente: ");
				num = leia.nextInt();
			}
			
			if ( i % 2 == 0) 
			{
				System.out.println("o numero é par");
				
			}
				else{ 
					System.out.println("o numero é impar");
					
				}
				i++;
				}
			}

	}


