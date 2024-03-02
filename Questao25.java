package Atividade3;

import java.util.Scanner;

public class Questao25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int anoNascimento;
		
		System.out.print("Digite seu ano de nascimento: ");
		anoNascimento = input.nextInt();
		
		System.out.println("Bem-vindo ao nosso programa, nascido em " + anoNascimento);
		
		input.close();
	}
}
