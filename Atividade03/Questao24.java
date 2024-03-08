package Atividade3;

import java.util.Scanner;

public class Questao24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String cidade, estado;
		
		System.out.print("Digite o nome da cidade em que você mora: ");
		cidade = input.nextLine();
		System.out.print("Digite o nome do estado em que você mora: ");
		estado = input.nextLine();
		
		System.out.printf("Você mora em %s, %s.\n", cidade, estado);
		
		input.close();
	}
}
