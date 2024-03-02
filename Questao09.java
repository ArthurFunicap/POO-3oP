package Atividade3;

import java.util.Scanner;

public class Questao09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nomeAnimal;
		
		System.out.print("Digite o nome de um animal: ");
		nomeAnimal = input.nextLine();
		
		System.out.print("O animal digitado foi: ");
		System.out.println(nomeAnimal);
		
		input.close();
	}
}
