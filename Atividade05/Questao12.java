import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, soma = 0, i = 0;
        double media;

        System.out.print("Digite uma sequência de números: ");
        while (true) {
            numero = input.nextInt();
            
            if(numero == -1)
                break;

            soma += numero;
            i++;
        }
        media = (double) soma / i;

        System.out.printf("Media: %.2f\n", media);

        input.close();
    }
}
