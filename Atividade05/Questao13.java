import java.util.Scanner;

public class Questao13{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, somaDigitoAoCubo = 0;

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        while (numero != 0) {
            somaDigitoAoCubo += (numero % 10) * (numero % 10) * (numero % 10);
            numero /= 10;
        }
        System.out.printf("Soma dos dígitos elevados ao cubo: %d\n", somaDigitoAoCubo);
        input.close();
    }
}