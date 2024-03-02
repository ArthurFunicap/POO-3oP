package Atividade3;

import java.util.Scanner;

public class Questao11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String string;
		
		System.out.print("Digite uma string/palavra: ");
		string = input.nextLine();
		
		System.out.print("O tamanho da string/palavra digitada é: ");
		System.out.println(string.length());
		
		input.close();
	}
}
