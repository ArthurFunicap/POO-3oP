import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, i = 0;
        double media = 0.0;

        System.out.println("Digite uma sequência de números inteiros (digite 0 para encerrar o programa): ");
        while (true) {
            numero = input.nextInt();

            if(numero == 0)
                break;
            
            if(numero % 3 == 0){
                media += numero;
                i++;
            }
        }
        media = (double) media / i;

        System.out.printf("Média dos números divisíveis por 3: %.2f\n", media);
        input.close();
    }
}
