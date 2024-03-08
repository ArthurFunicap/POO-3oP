package Atividade3;

import java.util.Scanner;

public class Questao07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome, sobrenome;
		
		System.out.print("Digite seu nome e sobrenome: ");
		nome = input.nextLine();
		sobrenome = input.nextLine();
		
		System.out.println(nome+sobrenome);
		
		input.close();
	}
}
