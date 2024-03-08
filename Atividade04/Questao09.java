import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double peso, altura, IMC;

        System.out.print("Digite seu peso: ");
        peso = input.nextDouble();
        System.out.print("Digite sua altura: ");
        altura = input.nextDouble();

        IMC = peso / (altura * altura);

        if(IMC < 18.6)
            System.out.println("Abaixo do peso");
        else if(IMC >= 18.6 && IMC <= 24.9)
            System.out.println("Peso ideal");
        else
            System.out.println("Sobrepeso");

        System.out.println();
        System.out.printf("IMC: %.2f\n", IMC);

        input.close();
    }
}
