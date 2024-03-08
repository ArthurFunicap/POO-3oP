import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um número: ");
		num = input.nextInt();
		
		if(num % 2 != 0)
			System.out.println("O número é impar");
		else
			System.out.println("O número é par");
		
		input.close();
	}
}
