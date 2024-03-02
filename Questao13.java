package Atividade3;

import java.util.Scanner;

public class Questao13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um numero inteiro: ");
		numero = input.nextInt();
		
		if(numero > 0)
			System.out.println("O numero digitado é positivo!");
		else
			System.out.println("O numero digitado é negativo!");
		
		input.close();
	}
}
