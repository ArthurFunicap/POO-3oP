import java.util.Scanner;

public class Questao22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, i = 0;
        double media = 0.0;

        System.out.println("Digite uma sequêncai de números inteiros (digite 0 para encerrar o programa): ");
        while(true){
            numero  = input.nextInt();

            if(numero == 0)
                break;
            
            if(numero >= 50){
                if(numero <= 100){
                    media += numero;
                    i++;
                }
            }
        }
        media /= (double) i;

        System.out.printf("Média dos números entre 50 e 100: %.2f\n", media);

        input.close();
    }
}
