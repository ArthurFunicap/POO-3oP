package Atividade3;

import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Digite dois numeros a serem somados: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		System.out.println();
		
		System.out.print("A soma entre os dois numeros eh: ");
		System.out.println(num1 + num2);
		
		input.close();
	}
}
