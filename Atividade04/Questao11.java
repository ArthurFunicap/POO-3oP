import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario;

        System.out.print("Digite seu salário: ");
        salario = input.nextDouble();

        if(salario > 1500.00)
            System.out.printf("Aumento de: %.2f\n", salario * 0.1);
        else
            System.out.printf("Aumento de: %.2f\n", salario * 0.15);
        
            input.close();
    }
}
