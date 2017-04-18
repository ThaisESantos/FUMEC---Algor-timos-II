import java.util.*;
public class Exercicio2_3 {

	public static void main(String[] args) {
		// 1 - variáveis
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
			System.out.print("Digite o código do operário (0 para finalizar): ");
			codOperario = leia.nextInt();
			if (codOperario == 0){
				break;
			}
			
			do{
				System.out.print("Digite a classe do operário: ");
				classe = leia.next().charAt(0);
				if (classe != 'A' && classe != 'B' && classe != 'C'){
					System.out.println("Classe inválida, digite A, B ou C");
				}
			}while(classe != 'A' && classe != 'B' && classe != 'C');
			
			do{
				System.out.print("Digite o número de peças fabricadas: ");
				numPecasFabr = leia.nextInt();
				if (numPecasFabr <= 0){
					System.out.println("Valor inválido, digite acima de zero");
				}
			}while(numPecasFabr <= 0);
			
			// 3 - cálculos
			
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
			
			System.out.println("Salário do operário: " + salario);
			
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
		// 4 - saídas
		System.out.println("total gasto com salários: " + somaSalarios);
		System.out.println("Número total de peças fabricadas: " + totalPecasFabr);
		System.out.println("Cod. Operário fabricou menor num. peças: " + codOpMenorNumPecas);
		if (contOperarioClasseB > 0){
			System.out.println("Média Quant. peças classe B: " + 
					totalPecasClasseB / contOperarioClasseB);			
		}
		
		
	}

}
