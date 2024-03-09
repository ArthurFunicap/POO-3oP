import java.util.Scanner;

public class Questao23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, menor = 0, i = 0;

        System.out.println("Digite uma sequência de números inteiros (digite 0 para encerrar o programa): ");
        while(true){
            numero = input.nextInt();

            if(numero == 0)
                break;

            if(numero > 0){
                i++;
                if(i == 1)
                    menor = numero;
            }

            if(numero > 0){
                if(numero % 2 != 0){
                    if(numero < menor)
                        menor = numero;
                }
            }
        }
        System.out.printf("O menor número positivo digitado: %d\n", menor);
        input.close();
    }
}
