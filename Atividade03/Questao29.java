package Atividade3;

import java.util.Scanner;

public class Questao29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String email;
		
		System.out.print("Digite seu email: ");
		email = input.next();
		
		System.out.println("Seja muito bem-vindo ao nosso site! (" + email + ")");
		
		input.close();
	}
}
