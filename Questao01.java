package Atividade3;

import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		String nome;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Digite seu primeiro nome: ");
		nome = input.nextLine();
		
		System.out.println();
		
		System.out.print("Seja muito bem-vindo, ");
		System.out.print(nome);
		System.out.println("!");
		
		input.close();
	}
}
