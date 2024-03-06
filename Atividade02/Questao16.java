import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float idade;

        System.out.print("Digite sua idade: ");
        idade = input.nextFloat();

        if(idade >= 0 && idade < 1)
            System.out.println("Bebê");
        else if(idade >= 1 && idade <= 12)
            System.out.println("Criança");
        else if(idade >= 13 && idade <= 18)
            System.out.println("Adolescente");
        else if(idade > 18)
            System.out.println("Adulto");
        else
            System.out.println("Valor inválido!");

        input.close();
    }
}
