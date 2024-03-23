package At;

import java.util.Scanner;

public class Questao05 {
	
	public static double Volume(double raio) {
		return (4/3) * 3.14 * (raio*raio*raio);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double raio, volume;
		
		System.out.print("Digite o valor do raio:  ");
		raio = input.nextDouble();
		
		volume = Volume(raio);
		
		System.out.printf("O valor do volume da esfera é: %.2f", volume);
		
		input.close();
	}
}
