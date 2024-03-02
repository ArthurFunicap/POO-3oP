package Atividade3;

import java.util.Scanner;

public class Questao15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float altura, peso, IMC;
		
		//Usar valores com vírgula caso apresente erro
		System.out.print("Digite sua altura e seu peso: ");
		altura = input.nextFloat();
		peso = input.nextFloat();
		
		IMC = (float) peso / (altura * altura);
		
		System.out.printf("%.2f ", IMC);
		
		input.close();
	}
}
