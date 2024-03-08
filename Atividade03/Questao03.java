package Atividade3;

import java.util.Scanner;

public class Questao03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero;
		float aux;
		
		System.out.print("Digite um numero inteiro: ");
		numero = input.nextInt();
		
		aux = (float) numero;
		
		System.out.printf("Forma decimal: %.2f", aux);
		
		input.close();
	}
}
