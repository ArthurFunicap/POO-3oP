package Atividade3;

import java.util.Scanner;

public class Questao19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String cidade;
		String[] cidadeAux;
		int tam;
		
		System.out.print("Digite o nome da sua cidade: ");
		cidade = input.next();
		
		tam = cidade.length();
		cidadeAux = new String[tam];
		cidadeAux[0] = cidade;
		
		if(cidadeAux[0] == "A")
			System.out.println("Sua cidade começa com a letra A!");
		else
			System.out.println("Sua cidade não começa com a letra A!");
		
		input.close();
	}
}
