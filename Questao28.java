package Atividade3;

import java.util.Scanner;

public class Questao28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um numero inteiro: ");
		numero = input.nextInt();
		
		System.out.println("O dobro de " + numero + " é " + numero*2 );
		
		input.close();
	}
}
