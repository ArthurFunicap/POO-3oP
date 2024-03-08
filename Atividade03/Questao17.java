package Atividade3;

import java.util.Scanner;

public class Questao17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int estadoCivil;
		
		System.out.println("1)Solteiro(a)");
		System.out.println("2)Casado(a)");
		System.out.println("3)União Estável");
		System.out.println("Viúvo(a)");
		System.out.print("Digite o número que corresponde ao seu Estado Civil: ");
		estadoCivil = input.nextInt();
		
		switch (estadoCivil) {
		case 1: {
			System.out.println("Você é solteiro(a)");
			break;
		}
		case 2: {
			System.out.println("Você é casado(a)");
			break;
		}
		case 3: {
			System.out.println("Você está em uma união estável");
			break;
		}
		case 4: {
			System.out.println("Você é viúvo(a)");
			break;
		}
		default:
			System.out.println("Você inseriu um valor que não corresponde a uma das opções!");
			break;
		}
		
		input.close();
	}
}
