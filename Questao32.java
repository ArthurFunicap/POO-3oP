package Atividade3;

import java.util.Scanner;

public class Questao32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double raio, perimetro, PI = 3.14;
		
		System.out.print("Digite o avlor do raio: ");
		raio = input.nextDouble();
		
		perimetro = 2 * PI * raio;
		
		System.out.printf("Valor do perímetro: %.2f\n", perimetro);
		
		input.close();
	}
}