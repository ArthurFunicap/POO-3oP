import java.util.Scanner;

public class Questao21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, contador = 0;

        System.out.println("Digite uma sequência de números inteiros (digite 0 para encerrar o programa): ");
        while(true){
            numero = input.nextInt();

            if(numero == 0)
                break;

            if(numero <= -100 || numero >= 100)
                contador++;
        }

        System.out.printf("Quantidae de números com mais de três dígitos: %d\n", contador);
        input.close();
    }
}
