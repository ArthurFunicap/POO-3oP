package Atividade3;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String idade;
		int idadeConvertida;
		
		System.out.print("Digite sua idade: ");
		idade = input.next();
		
		idadeConvertida = Integer.parseInt(idade);
		
		System.out.printf("Idade convertida do tipo String para o tipo Int: %d%n", idadeConvertida);
		
		input.close();
	}
}
