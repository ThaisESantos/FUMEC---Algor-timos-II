package Projeto1;

import java.util.*;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lado1;
		int lado2;
		int lado3;
		int perimetro;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("digite o tamanho do lado 1 do triangulo: ");
		lado1 = leia.nextInt();
				System.out.print("digite o tamanho do lado 2 do triangulo: ");
				lado2 = leia.nextInt();
				System.out.print("Digite o tamanho do lado 3 do triangulo: ");
				lado3 = leia.nextInt();
				
				perimetro = lado1 + lado2 + lado3;
				
				if 
				(lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
					System.out.println("essas medidas não formam um triangulo");
					
				} else
						
					if (lado1 == lado2 && lado2 == lado3) { 
						System.out.println("triangulo equilatero");
					} else
						
						if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1 ) {
							System.out.println("triangulo escateno");
						} else {
							System.out.println("triangulo isosceles"); 
						}
				}
						
				

	}


