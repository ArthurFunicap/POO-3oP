import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um número: ");
		num = input.nextInt();
		
		if(num > 0)
			System.out.println("O número digitado é positivo!");
		else if(num < 0)
			System.out.println("O número digitado é negativo!");
		else
			System.out.println("O número digitado é igual a 0!0");
		
		input.close();
	}
}
