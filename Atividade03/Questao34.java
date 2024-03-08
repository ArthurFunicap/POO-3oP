package Atividade3;

import java.util.Scanner;

public class Questao34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double num1, num2, num3, media;
		
		System.out.print("Digite três números decimais: ");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();
		
		media = (num1 + num2 + num3)/3.0;
		
		System.out.printf("Valor da média aritmética: %.2f\n", media);
		
		input.close();
	}
}