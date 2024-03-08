import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char letra, caractere;;
		String vogais = "AEIOUaeiou";
		int i, ehVogal = 0;
		
		System.out.print("Digite uma letra: ");
		letra = input.next().charAt(0);
		
		input.close();
		
		for(i = 0; i < vogais.length(); i++){
			caractere = vogais.charAt(i);
			
			if(letra == caractere)
				ehVogal = 1;
		}
		
		if(ehVogal == 1)
			System.out.println("A letra é uma vogal");
		else
			System.out.println("A letra é uma consoante");
	}

}
