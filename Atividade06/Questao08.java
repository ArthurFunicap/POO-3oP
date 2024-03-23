package At;

import java.util.Scanner;

public class Questao08 {
	
	public static double Hipotenusa(int a, int b) {
		double soma;
		soma = (a*a) + (b*b);
		
		return Math.sqrt(soma);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b;
		double hipotenusa;
		
		System.out.print("Digite os valores de A e B: ");
		a = input.nextInt();
		b = input.nextInt();
		
		hipotenusa = Hipotenusa(a, b);
		
		System.out.printf("O valor da hipotenusa é: %.2f\n", hipotenusa);
		
		input.close();
	}
}
