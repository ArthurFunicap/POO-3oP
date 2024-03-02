package Atividade3;

import java.util.Scanner;

public class Questao26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero;
		String string;
		
		System.out.print("Digite um número inteiro: ");
		numero = input.nextInt();
		System.out.print("Digite uma string qualquer ou uma palavra: ");
		string = input.next();
		
		System.out.println(string + " " + numero);
		
		input.close();
	}
}
