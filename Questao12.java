package Atividade3;

import java.util.Scanner;

public class Questao12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um numero inteiro: ");
		numero = input.nextInt();
		
		if(numero % 2 != 0)
			System.out.println("O numero digitado é impar!");
		else
			System.out.println("O numero digitado é par!");
		
		input.close();
	}
}
