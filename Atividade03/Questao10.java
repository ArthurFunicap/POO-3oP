package Atividade3;

import java.util.Scanner;

public class Questao10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome, sobrenome;
		
		System.out.print("Digite seu primeiro nome: ");
		nome = input.nextLine();
		System.out.print("Agora digite seu sobrenome: ");
		sobrenome = input.nextLine();
		
		System.out.print(sobrenome+" "+nome);
		
		input.close();
	}
}
