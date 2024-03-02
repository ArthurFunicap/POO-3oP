package Atividade3;

import java.util.Scanner;

public class Questao30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Digite dois numeros inteiros: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		System.out.printf("A soma entre %d e %d: %d\n", num1, num2, num1+num2);
		System.out.printf("A diferença entre %d e %d: %d\n", num1, num2, num1-num2);
		System.out.printf("O produto entre %d e %d: %d\n", num1, num2, num1*num2);
		System.out.printf("O quociente entre %d e %d: %d\n", num1, num2, num1/num2);
		
		input.close();
	}
}
