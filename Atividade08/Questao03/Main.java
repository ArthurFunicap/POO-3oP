package Questao03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CarrinhoDeCompras carrinho01 = new CarrinhoDeCompras();
        int opcao;
        String item;

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
                    if(carrinho01.carrinhoCheio() == 0){
                        System.out.print("Digite o nome do item que deseja adicionar: ");
                        item = input.next();
                        carrinho01.adicionar(item);
                        System.out.println("Item adicionado!");
                        break;
                    }else{
                        System.out.println("Carrinho cheio!");
                    }
                case 2:
                    System.out.print("Digite o nome do item que deseja remover: ");
                    item = input.next();
                    carrinho01.remover(item);
                    System.out.println("Item removido!");
                    break;
                case 3:
                    carrinho01.listar();
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
