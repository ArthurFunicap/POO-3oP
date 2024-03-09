import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, somaDigito = 0;

        System.out.print("Digite um número inteiro: ");
        numero = input.nextInt();

        while(numero != 0 ){
            somaDigito += (numero % 10);
            numero /= 10;
        }
        System.out.printf("Soma dos dígitos do números digitados: %d\n", somaDigito);
        input.close();
    }
}
