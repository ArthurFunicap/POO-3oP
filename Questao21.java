package Atividade3;

import java.util.Scanner;

public class Questao21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float numDecimal;
		int auxInt;
		
		System.out.print("Digite um numero decimal: ");
		numDecimal = input.nextFloat();
		
		auxInt = (int) numDecimal;
		
		System.out.printf("O numero decimal %.2f foi convertido para um inteiro: %d\n", numDecimal, auxInt);
		
		input.close();
	}
}
