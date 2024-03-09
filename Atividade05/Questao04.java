import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double altura, media = 0.0;
        int i = 0;

        while(i < 5){
            System.out.printf("Digite a altura da pessoa %d: ", i+1);
            altura = input.nextDouble();

            media = media + altura;
            i++;
        }
        media = media / 5.0;

        System.out.printf("A média das alturas das 5 pessoas é: %.2f\n", media);

        input.close();
    }
}
