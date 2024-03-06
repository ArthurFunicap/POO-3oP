import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String estadoCivil;

        System.out.print("Digite seu estado civil: ");
        estadoCivil = input.next();

        System.out.println("Você é " + estadoCivil);

        input.close();
    }
}
