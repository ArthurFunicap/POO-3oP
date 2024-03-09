import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, somaDigitoPar = 0;

        System.out.print("Digite um número inteiro: ");
        numero = input.nextInt();

        while(numero != 0){
            if( (numero % 10) % 2 == 0)
                somaDigitoPar += numero % 10;
            
            numero /= 10;
        }
        System.out.printf("Soma dos dígitos pares do número digitado: %d\n", somaDigitoPar);
        input.close();
    }
}
