import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0, j = 0;
        double nota;

        while (i < 5) {
            System.out.printf("Digite a nota do aluno %d: ", i+1);
            nota = input.nextDouble();

            if(nota >= 7.0)
                j++;
            
            i++;
        }

        System.out.printf("Foram aprovados %d alunos!\n", j);

        input.close();
    }
    
}