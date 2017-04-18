import java.until.*;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String nomeAluno;
  byte nota1;
  byte nota2;
  byte nota3;
  float mediaNotas;

Scanner leia = new Scanner(System.in);
      
      System.out.print("Digite o nome do aluno");
      nomeAluno = leia.nextLine();
     
      System.out.print("Digite a nota 1");
      nota1 = leia.nextByte();
      System.out.print("Digite a nota 2");
      nota2 = leia.nextByte();
      System.out.print("Digite a nota 3");
      nota3 = leia.nextByte();
      
      //calculo saida de dados
      
      mediaNotas = (float) (nota1 + nota2 + nota3)/3;
       
      System.out.println("A media das notas é " +mediaNotas);
      
      if (mediaNotas <= 4);
      {
      System.out.println("Aluno reprovado");
      

    	  if (mediaNotas < 7 ) {
    	  System.out.println("Aluno em recuperação");
      
      } else
    		  System.out.println("Aluno aprovado");
    	  
     

      
      
      

	


