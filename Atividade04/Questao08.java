import java.util.Scanner;
import java.util.Arrays;

public class Questao08{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[3];
        int i;

        for(i = 0; i < 3; i++){
            System.out.printf("Digite o %do numero: ", i+1);
            numeros[i] = input.nextInt();
        }
        
        Arrays.sort(numeros);

        for(int j : numeros){
            System.out.println(j);
        }
        input.close();
    }
}