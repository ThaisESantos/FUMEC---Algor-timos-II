package Projeto1;

import java.util.*;
import java.text.*;

public class Exemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nomeAluno;
		byte nota1;
		byte nota2;
		byte nota3;
		float mediaNotas;
		
		Scanner leia;
		leia = new Scanner(System.in);
		
		System.out.println("digite o nome do aluno: ");
		nomeAluno = leia.nextLine();
		
		System.out.print("Digite a nota 1: ");
		nota1 = leia.nextByte();
		
		System.out.print("Digite a nota 2: ");
		nota2 = leia.nextByte();
		
		System.out.print("Digite a nota 3: ");
		nota3 = leia.nextByte();
		
		//calculo da media
		
		mediaNotas = (float) (nota1+nota2+nota3)/3;
				
				System.out.println("A m�dia das notas �: " +mediaNotas);
		
		if (mediaNotas <= 4)
		{
			System.out.println("Aluno Reprovado");
		} else if (mediaNotas < 7 ) {
			System.out.println("Aluno em recupera��o");
			
		} else {
			System.out.println("Aluno aprovado");
		}
	
		
	}

}
