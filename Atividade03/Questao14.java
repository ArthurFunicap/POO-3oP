package Atividade3;

import java.util.Scanner;

public class Questao14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Digite doi numeros: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if(num1 > num2)
			System.out.printf("%d é maior que %d", num1, num2);
		else
			System.out.printf("%d é maior que %d", num2, num1);
		
		input.close();
	}
}
