import java.util.*;
public class Exercicio2_3 {

	public static void main(String[] args) {
		// 1 - vari�veis
		int codOperario;
		char classe;
		int numPecasFabr;
		float salario;
		float somaSalarios = 0;
		int totalPecasFabr = 0;
		int menorNumPecas = 999;
		int codOpMenorNumPecas = 0;
		int totalPecasClasseB = 0;
		int contOperarioClasseB = 0;
		Scanner leia = new Scanner(System.in);
		
		// 2 - Entrada da dados
		do{
			System.out.print("Digite o c�digo do oper�rio (0 para finalizar): ");
			codOperario = leia.nextInt();
			if (codOperario == 0){
				break;
			}
			
			do{
				System.out.print("Digite a classe do oper�rio: ");
				classe = leia.next().charAt(0);
				if (classe != 'A' && classe != 'B' && classe != 'C'){
					System.out.println("Classe inv�lida, digite A, B ou C");
				}
			}while(classe != 'A' && classe != 'B' && classe != 'C');
			
			do{
				System.out.print("Digite o n�mero de pe�as fabricadas: ");
				numPecasFabr = leia.nextInt();
				if (numPecasFabr <= 0){
					System.out.println("Valor inv�lido, digite acima de zero");
				}
			}while(numPecasFabr <= 0);
			
			// 3 - c�lculos
			
			if (classe == 'A'){
				if (numPecasFabr <= 30){
					salario = 500 + 2 * numPecasFabr;
				}else if(numPecasFabr <= 40){
					salario = 500 + (float)2.30 * numPecasFabr;
				}else{
					salario = 500 + (float)2.80 * numPecasFabr;
				}
			}else if (classe == 'B'){
				salario = 1200;			
			}else{ // classe C
				if (numPecasFabr <= 50){
					salario = 40 * numPecasFabr;
				}else{
					salario = 45 * numPecasFabr;
				}
			}
			
			System.out.println("Sal�rio do oper�rio: " + salario);
			
			somaSalarios = somaSalarios + salario;
			totalPecasFabr = totalPecasFabr + numPecasFabr;
			
			if (numPecasFabr < menorNumPecas){
				codOpMenorNumPecas = codOperario;
				menorNumPecas = numPecasFabr;
			}
			
			if (classe == 'B'){
				totalPecasClasseB = totalPecasClasseB + numPecasFabr;
				contOperarioClasseB ++;
			}
				
		}while(codOperario != 0);
		// 4 - sa�das
		System.out.println("total gasto com sal�rios: " + somaSalarios);
		System.out.println("N�mero total de pe�as fabricadas: " + totalPecasFabr);
		System.out.println("Cod. Oper�rio fabricou menor num. pe�as: " + codOpMenorNumPecas);
		if (contOperarioClasseB > 0){
			System.out.println("M�dia Quant. pe�as classe B: " + 
					totalPecasClasseB / contOperarioClasseB);			
		}
		
		
	}

}
