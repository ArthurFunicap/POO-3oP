package Atividade3;

import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float numDecimal;
		
		//Usar valores com vírgula caso apresente erro
		System.out.print("Digite um numero decimal: ");
		numDecimal = input.nextFloat();
		
		System.out.print("O quadrado do numero digitado eh: ");
		System.out.printf("%.2f", numDecimal*numDecimal);
		
		input.close();
	}
}
