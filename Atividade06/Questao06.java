package At;

import java.util.Scanner;

public class Questao06 {
	
	public static int calculaSegundos(int h, int m, int s) {
		return h*3600 + m*60 + s;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int horas, minutos, segundos, totalDeSegundos;
		
		System.out.print("Digite a quantidade de horas, minutos e segundos: ");
		horas = input.nextInt();
		minutos = input.nextInt();
		segundos = input.nextInt();
		
		totalDeSegundos = calculaSegundos(horas, minutos, segundos);
		
		System.out.printf("O total de segundos: %d\n", totalDeSegundos);
		
		input.close();
	}
}
