package Atividade3;

import java.util.Scanner;

public class Questao36 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double valorReal, cotacaoDolar, conversao;
		
		System.out.printf("Digite a quantia em R$ e a cotação do Dólar: ");
		valorReal = input.nextDouble();
		cotacaoDolar = input.nextDouble();
		
		conversao = valorReal / cotacaoDolar;
		
		System.out.printf("O valor convertido de Real para Dólar: %.2f", conversao);
		
		input.close();
	}
}