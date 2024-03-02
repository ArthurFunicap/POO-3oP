package Atividade3;

import java.util.Scanner;

public class Questao31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float base, altura, area;
		
		System.out.print("Digite a base do triângulo: ");
		base = input.nextFloat();
		System.out.print("Digite a altura do triângulo: ");
		altura = input.nextFloat();
		
		area = (float) (base * altura) / 2;
		
		System.out.printf("A área do triângulo é: %.2f\n", area);
		
		input.close();
	}
}
