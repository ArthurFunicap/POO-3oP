package Atividade3;

import java.util.Scanner;

public class Questao38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Digite trÊs números inteiro: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		
		System.out.printf("Resultado da operação: %d", (num1 + num2)*num3);
		
		input.close();
	}
}