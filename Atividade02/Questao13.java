import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String diaDaSemana;

        System.out.print("Digite o dia da semana por extenso em letra minúscula: ");
        diaDaSemana = input.nextLine();

        if(diaDaSemana.equals("domingo") || diaDaSemana.equals("sabado"))
            System.out.println("É um dia do Fim de Semana");
        else
            System.out.println("É um dia útil");

        input.close();
    }
}
