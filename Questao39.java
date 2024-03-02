package Atividade3;

import java.util.Scanner;

public class Questao39 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double grausCelsius, grausFahrenheit;
		
		System.out.print("Digite a temperatura em Graus Celsius: ");
		grausCelsius = input.nextDouble();
		
		grausFahrenheit = (grausCelsius * 9.0 / 5.0) + 32.0;
		
		System.out.printf("Temperatura em Graus Fahrenheit: %.2f", grausFahrenheit);
		
		input.close();
	}
}