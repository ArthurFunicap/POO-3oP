package Questao02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pedido> pedidos = new ArrayList<>();

        int opcao;

        String nome;
        double preco;
        int quantidade;

        while(true){
            Pedido pedido = new Pedido();

            System.out.println("Opções: ");
            System.out.println("1 - Adicionar item(ns) a um pedido");
            System.out.println("0 - Encerrar programa");
            System.out.print("Digite uma opção: ");
            opcao = input.nextInt();

            if(opcao == 1){
                int i, j;
                System.out.print("Digite a quantidade de itens que deseja adicionar ao pedido: ");
                i = input.nextInt();

                for(j = 0; j < i; j++){
                    ItemPedido item = new ItemPedido();
                    System.out.print("Digite o nome do produto: ");
                    nome = input.next();
                    item.setNome(nome);
                    System.out.print("Digite o preço do produto: ");
                    preco = input.nextDouble();
                    item.setPreco(preco);
                    System.out.print("Digite a quantidade: ");
                    quantidade = input.nextInt();
                    item.setQuantidade(quantidade);

                    pedido.adicionarItem(item);
                }
            }else{
                System.out.println("Programa encerrado!");
                break;
            }
            pedidos.add(pedido);
        }
        System.out.println("Número de pedidos com valores superiores a R$500: ");
        for (Pedido p : pedidos) {
            if(p.valorTotal() > 500.0){
                System.out.println(p.getNumero());
            }
        }
        input.close();
    }
}
