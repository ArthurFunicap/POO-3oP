package At;

import java.util.Scanner;

public class Questao03 {
	
	public static int verificaNumero(int num) {
		if(num == 0)
			return 0;
		else if(num > 0)
			return 1;
		else
			return -1;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero, resultado;
		
		System.out.print("Digite um número: ");
		numero = input.nextInt();
		
		resultado = verificaNumero(numero);
		
		switch(resultado) {
			case 0:
				System.out.println("O número é igual a 0");
				break;
			case 1:
				System.out.println("O número é positivo");
				break;
			case -1:
				System.out.println("O número é negativo");
				break;
		}
		input.close();
	}
}
