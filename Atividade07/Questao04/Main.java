package Questao04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Post post = new Post("Comprei DOOM (1993)", "https://store.steampowered.com/?l=portuguese");
        int opcao;

        do{
            System.out.println("Menu:");
            System.out.println("1 - Curtir post");
            System.out.println("2 - Compartilhar post");
            System.out.println("3 - Ver número de curtidas");
            System.out.println("4 - Ver número de compartilhamentos");
            System.out.println("0 - Sair do Facebook");
            System.out.print("Digite uma opção: ");
            opcao = input.nextInt();

            System.out.println();

            switch (opcao) {
                case 1:
                    post.curtir();
                    System.out.println("Post curtido!");
                    System.out.println();
                    break;
                case 2:
                    post.compartilhar();
                    System.out.println("Post compartilhado!");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Número de curtidas: " + post.numeroCurtidas);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Número de compartilhamentos: " + post.numeroCompartilhamentos);
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Saindo do Facebook.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while(opcao != 0);
        input.close();
    }
}
