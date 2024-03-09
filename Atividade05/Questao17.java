import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, contador = 0, par = 0, impar = 0;

        System.out.print("Digite uma sequência de números (digite 0 para encerrar o programa): ");
        while (true) {
            numero = input.nextInt();

            if(numero == 0)
                break;
            
            if(numero % 2 == 0)
                contador++;
            
            if(numero % 2 != 0){
                impar++;
                if(impar == 1)
                    par = contador;
            }
        }
        System.out.printf("Quantidade de números pares digitados: %d\n", par);

        input.close();
    }
}
