package Atividade3;

import java.util.Scanner;

public class Questao16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome;
		
		System.out.print("Digite seu primeiro nome: ");
		nome = input.nextLine();
		
		if(nome.length() > 5)
			System.out.println("Seu nome tem mais de 5 letras!");
		else
			System.out.println("Seu nome tem menos de 5 letras!");
		
		input.close();
	}
}
