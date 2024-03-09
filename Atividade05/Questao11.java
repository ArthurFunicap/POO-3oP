import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menor = 100, maior = 0, numero;

        System.out.print("Digite um valor inteiro qualquer para iniciar o programa: ");
        while (input.hasNextInt()) {
            System.out.print("Digite uma sequência de números (Digite 0 para encerrar o programa): ");
            numero = input.nextInt();

            if(numero == 0)
                break;

            if(numero < menor)
                menor = numero;
            
            if(numero > maior)
                maior = numero;
        }

        System.out.printf("Maior: %d\n", maior);
        System.out.printf("Menor: %d\n", menor);
        
        input.close();
    }
}
