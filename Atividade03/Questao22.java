package Atividade3;

import java.util.Scanner;

public class Questao22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String numero;
		int numeroAux, somaDez;
		
		System.out.print("Digite um número: ");
		numero = input.next();
		
		numeroAux = Integer.parseInt(numero);
		somaDez = numeroAux + 10;
		
		System.out.println(Integer.toString(somaDez));
		
		input.close();
	}
}
