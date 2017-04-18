package Projeto1;

import java.util.*;

public class ExercicioSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float salario;
		int tempoDeCasa;
		float bonus;
        float vT;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o tempo de casa do funcionario: ");
		tempoDeCasa = leia.nextInt();
		
		System.out.print("Digite o salário do funcionário: ");
		salario = leia.nextFloat();
		
		if (tempoDeCasa <= 5 && salario <= 300) {
			bonus = 50 ;
			vT = (float) (salario * 0.05);
			System.out.println("o bonus é de " +bonus +" o vale transporte é de " +vT);
		} else 
			if (tempoDeCasa <= 5 && salario > 300) {
				bonus = 80;
				vT = (float) (salario*0.06);
				System.out.println("o bonus é de " +bonus +" o vale transporte é de " +vT);
			} else
				if (tempoDeCasa <= 10 && salario <= 500) {
					bonus = (float) (salario*0.15);
					vT = 70;
					System.out.println(" o bonus é de " +bonus  +" o vale transporte é  de " +vT);
				} else
					if (salario > 500 && salario <= 2000) {
						bonus = (float)(salario * 0.13);
						vT = 90;
						System.out.println("o bonus é de " +bonus +" o vale transporte é de "+ vT);
					} else
						if (salario > 2000) {
							bonus = (float)(salario*0.12);
							vT = (float)(salario*0.08);
							System.out.println("o bonus é de " +bonus + " o vale transporte é de " +vT);
						} else
							if (tempoDeCasa > 10 ) {
								bonus = 300;
								vT = (float)(salario*0.04);
								
								System.out.println("o bonus é de " +bonus + " o vT é de " +vT);
							}
								
	
				
			}
		
		
	}


