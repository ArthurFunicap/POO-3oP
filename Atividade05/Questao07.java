import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = input.nextInt();

        System.out.print("Número digitado invertido: ");
        while(numero != 0){
            System.out.print(numero%10);

            numero /= 10;
        }
        System.out.println();
        input.close();
    }
}
