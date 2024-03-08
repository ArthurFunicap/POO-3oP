import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome1, nome2;
		
		System.out.print("Digite um nome: ");
		nome1 = input.next();
		System.out.print("Digite outro nome: ");
		nome2 = input.next();
		
		if(nome1.length() > nome2.length())
			System.out.println("O primeiro nome é maior que o segundo!");
		else
			System.out.println("O segundo nome é maior que o primeiro!");
		
		input.close();

	}

}
