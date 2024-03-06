import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao, num1, num2;

        System.out.println("1)Somar");
        System.out.println("2)Subtrair");
        System.out.println("3)Multiplicar");
        System.out.println("4)Divisão");
        System.out.print("Digite o número da operação qual deseja realizar: ");
        opcao = input.nextInt();

        System.out.print("Digite dois números: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(num1 + num2);
                break;
            
            case 2:
                System.out.println(num1 - num2);
                break;

            case 3:
                System.out.println(num1 * num2);
                break;

            case 4:
                System.out.println((float) num1 / num2);
                break;
            default:
                System.out.println("Número de operação inválido!");
                break;
        }
        input.close();
    }
}
