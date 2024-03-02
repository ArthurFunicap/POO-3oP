package Atividade3;

import java.util.Scanner;

public class Questao18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float base, altura, area;
		
		System.out.print("Coloque o valor da base do retângulo: ");
		base = input.nextFloat();
		System.out.print("Coloque o valor da altura do retângulo: ");
		altura = input.nextFloat();
		
		area = (float) base * altura;
		
		System.out.print("A área do retângulo é: ");
		System.out.printf("%.2f u.m.\n", area);
		
		input.close();
	}
}
