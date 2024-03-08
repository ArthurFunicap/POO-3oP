import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int avaliacao;

        System.out.print("Digite um número inteiro entre 1 e 5: ");
        avaliacao = input.nextInt();

        switch (avaliacao) {
            case 1:
                System.out.println("Muito insuficiente");
                break;
            
            case 2:
                System.out.println("Insuficiente");
                break;
            
            case 3:
                System.out.println("Regular");
                break;
            
            case 4:
                System.out.println("Bom");
                break;
            
            case 5:
                System.out.println("Muito bom");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
        input.close();
    }
}
