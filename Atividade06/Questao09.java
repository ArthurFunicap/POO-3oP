import java.util.Scanner;

public class Questao09{

    public static double Volume(double h, double r){
        double pi = 3.14159;

        return pi * (r*r) * h;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double volume, raio, altura;

        System.out.print("Digite o valor do raio: ");
        raio = input.nextDouble();
        System.out.print("Digite a altura: ");
        altura = input.nextDouble();

        volume = Volume(altura, raio);

        System.out.printf("Volume do cilindro: %.2f\n", volume);

        input.close();
    }
}