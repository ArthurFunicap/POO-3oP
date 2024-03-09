import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, i;

        System.out.print("Digite um número inteiro: ");
        numero = input.nextInt();

        if(numero < 0)
            numero *= (-1);
        
        i = numero;

        while(i > 0){
            if(numero % i == 0)
                System.out.printf("O numero %d é divisível por %d\n", numero, i);
            
            i--;
        }
        input.close();
    }
}
