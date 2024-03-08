package Atividade3;

import java.util.Scanner;

public class Questao37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double numDecimal;
		
		System.out.print("Digite um número decimal: ");
		numDecimal = input.nextDouble();
		
		System.out.printf("Valor arredondado para o inteiro mais próximo: %d", Math.round(numDecimal));
		
		input.close();
	}
}