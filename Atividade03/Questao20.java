package Atividade3;

import java.util.Scanner;

public class Questao20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float num1, num2;
		
		System.out.print("Digite dois números decimais: ");
		num1 = input.nextFloat();
		num2 = input.nextFloat();
		
		if(num1 % num2 == num1)
			System.out.printf("O resto da divisão de %.2f por %.2f é igual a %.2f\n", num1, num2, 0.00);
		else
			System.out.printf("O resto da divisão de %.2f por %.2f é igual a %.2f\n", num1, num2, num1 % num2);
		
		input.close();
	}

}
