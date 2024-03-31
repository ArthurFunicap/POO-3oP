package Questao03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Lutador lutador01 = new Lutador("Ryu", 100, 10);
        Lutador lutador02 = new Lutador("Bison", 100, 12);
        int opcao;

        while(lutador01.energia != 0 && lutador02.energia != 0){
            System.out.println("Menu de ataque:");
            System.out.println("1 - Atacar Ryu");
            System.out.println("2 - Atacar Bison");
            System.out.print("Digite uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    lutador02.aplicarGolpe(lutador01);
                    System.out.println("Energia do Ryu: " + lutador01.energia);
                    System.out.println();
                    break;
                case 2:
                    lutador01.aplicarGolpe(lutador02);
                    System.out.println("Energia do Bison: " + lutador02.energia);
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        input.close();
    }
}
