package Questao04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BancoDeDados dados01 = new BancoDeDados();
        int opcao;
        String usuario;

        do{
            System.out.println("Opções:");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Remover item");
            System.out.println("3 - Listar itens");
            System.out.println("0 - Ir para o caixa");
            System.out.print("Digite uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    if(dados01.cheio() == 0){
                        System.out.print("Digite o nome do item que deseja adicionar: ");
                        usuario = input.next();
                        dados01.adicionar(usuario);
                        System.out.println("Item adicionado!");
                        break;
                    }else{
                        System.out.println("Carrinho cheio!");
                    }
                case 2:
                    System.out.print("Digite o nome do item que deseja remover: ");
                    usuario = input.next();
                    dados01.remover(usuario);
                    System.out.println("Item removido!");
                    break;
                case 3:
                    dados01.listar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while(opcao != 0);
        input.close();
    }
}
