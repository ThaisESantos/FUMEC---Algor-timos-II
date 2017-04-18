package Projeto1;

import java.util.*;				

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lado1;
		int lado2;
		int lado3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("dgite lado 1: ");
		lado1 = leia.nextInt();
		
		System.out.print("digite lado 2: ");
		lado2 = leia.nextInt();
		
		System.out.print("digite lado 3: ");
		lado3 = leia.nextInt();
		
		if (lado1 + lado2 <= lado3 || lado2 + lado3 <= lado1 || lado3 + lado1<= lado2) {
			System.out.print("essas medidas não formam um triangulo");
		
	} else
	       if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
	    	   System.out.println("triangulo equilatero");
	    	   
	       } else
	    	   if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
	    		   System.out.println("triangulo escateno");
	    		   
	    	   } else
	    	   { System.out.println("triangulo isosceles");
	       
	    	   }
	} 

	}
