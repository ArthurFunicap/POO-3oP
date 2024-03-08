package Atividade3;

import java.util.Scanner;

public class Questao06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int anoNascimento;
		
		System.out.print("Digite seu ano de nascimento: ");
		anoNascimento = input.nextInt();
		
		System.out.println();
		System.out.printf("Voce tem %d anos", 2024 - anoNascimento);
		
		input.close();
	}
}
