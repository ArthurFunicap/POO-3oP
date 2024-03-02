package Atividade3;

import java.util.Scanner;

public class Questao08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sequenciaDeNumeros, i = 0;
		
		System.out.print("Envie uma sequência de números, quando terminar envie uma letra qualquer\npara indicar que a sequência acabou: ");
		while(input.hasNextInt()) {
			sequenciaDeNumeros = input.nextInt();
			i++;
		}
		
		System.out.printf("Foram digitados %d números\n", i);
		
		input.close();
	}
}
