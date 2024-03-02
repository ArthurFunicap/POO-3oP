package Atividade3;

import java.util.Scanner;

public class Questao35 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int idade, meses, dias, diasAux;
		
		System.out.print("Informe sua idade: ");
		idade = input.nextInt();
		
		diasAux = idade * 365;
		
		meses = diasAux / 12;
		dias = diasAux % 12;
		
		System.out.printf("Você viveu %d meses e %d dias\n", meses, dias);
		
		input.close();
	}
}