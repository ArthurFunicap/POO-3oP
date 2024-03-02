package Atividade3;

import java.util.Scanner;

public class Questao33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double base, altura, perimetro;
		
		System.out.print("Digite a base a altura do retângulo: ");
		base = input.nextDouble();
		altura = input.nextDouble();
		
		perimetro = (base * 2.0) + (altura * 2.0);
		
		System.out.printf("Perimetro do retÂngulo: %.2f\n", perimetro);
		
		input.close();
	}
}