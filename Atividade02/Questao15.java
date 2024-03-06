import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int diaDaSemana;

        System.out.print("Digite um número entre 1 e 7: ");
        diaDaSemana = input.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println("Segunda");
                break;
            
            case 2:
                System.out.println("Terça");
                break;
            
            case 3:
                System.out.println("Quarta");
                break;
            
            case 4:
                System.out.println("Quinta");
                break;
            
            case 5:
                System.out.println("Sexta");
                break;
            
            case 6:
                System.out.println("Sábado");
                break;

            case 7:
                System.out.println("Domingo");
                break;
        
            default:
                System.out.println("Número inválido");
                break;
        }
        input.close();
    }
}
