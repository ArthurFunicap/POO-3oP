import java.util.Scanner;

public class Questao10 {

    public static int Maior(int num1, int num2){
        if(num1 > num2)
            return num1;
        else
            return num2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, maior;

        System.out.print("Digite dois números: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        maior = Maior(num1, num2);

        System.out.printf("O maior número é: %d\n", maior);

        input.close();
    }
}
