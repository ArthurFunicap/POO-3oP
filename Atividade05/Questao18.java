import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, contaPar = 0, contaImpar = 0;

        System.out.print("Digite uma sequência de números (digite 0 para encerrar o programa): ");
        while (true) {
            numero = input.nextInt();

            if(numero == 0)
                break;
            
            if(numero % 2 == 0)
                contaPar++;
            else
                contaImpar++;
        }
        System.out.printf("Quantidade de pares digitados: %d\n", contaPar);
        System.out.printf("Quantidade de ímpares digitados: %d\n", contaImpar);

        input.close();
    }
}
