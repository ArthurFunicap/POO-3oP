package Questao02;

import java.util.HashSet;
import java.util.Scanner;

public class TesteHaseSetCPF {
    public static void main(String[] args) {
        HashSet<String> ListaCPF = new HashSet<String>();
        String cpf;
        int i;

        for(i = 0; i < 10; i++){
            Scanner input = new Scanner(System.in);
            System.out.print("Digite um CPF: ");
            cpf = input.next();
            ListaCPF.add(cpf);
            input.close();
        }

        for (String str : ListaCPF) {
            System.out.println(str);
        }
    }
}
