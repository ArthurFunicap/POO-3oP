import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Digite um número inteiro: ");
        num = input.nextInt();

        if(num % 3 == 0 && num % 5 == 0)
            System.out.println("O numero digitado é divisível por 3 e 5!");
        else
            System.out.println("O numero digitado não é divisível por 3 e 5!");
        
            input.close();
    }
}
