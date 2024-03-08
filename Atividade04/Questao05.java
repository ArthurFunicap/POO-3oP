import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.print("Digite as três notas: ");
		nota1 = input.nextDouble();
		nota2 = input.nextDouble();
		nota3 = input.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3.0;
		
		if(media >= 7.0)
			System.out.println("Aluno aprovado!");
		else
			System.out.println("Aluno reprovado!");
		
		input.close();
	}
}
