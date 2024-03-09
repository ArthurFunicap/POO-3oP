import java.util.Scanner;;

public class Questao19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, divisivelPorDois = 0, divisivelPorTres = 0, divisivelPorCinco = 0;

        System.out.println("Digite uma sequência de números inteiros (digite 0 para encerrar o programa): ");
        while (true) {
            numero = input.nextInt();

            if(numero == 0)
                break;
            
            if(numero % 2 == 0)
                divisivelPorDois++;
            
            if(numero % 3 == 0)
                divisivelPorTres++;
            
            if(numero % 5 == 0)
                divisivelPorCinco++;
        }
        System.out.printf("Quantidade de números divisíveis por dois: %d\n", divisivelPorDois);
        System.out.printf("Quantidade de números divisíveis por tres: %d\n", divisivelPorTres);
        System.out.printf("Quantidade de números divisíveis por cinco: %d\n", divisivelPorCinco);
        input.close();
    }    
}
