package Atividade3;

import java.util.Scanner;

public class Questao27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float preco;
		String nomeProduto;
		
		System.out.print("Digite o nome do produto: ");
		nomeProduto = input.next();
		System.out.print("Digite o preço do produto em R$: ");
		preco = input.nextFloat();
		
		System.out.print(nomeProduto + " R$ " + preco);
		
		input.close();
	}
}
