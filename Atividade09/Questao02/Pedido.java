package Questao02;

import java.util.ArrayList;

class ItemPedido{
    private String nome;
    private double preco;
    private int quantidade;

    protected double valorSubTotal(){
        return preco*quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }   
}

public class Pedido {
    private int numero;
    private static int numerador= 1;
    private ArrayList<ItemPedido> itens = new ArrayList<>();

    public Pedido() {
        numero = numerador;
        numerador++;
    }

    public void adicionarItem(ItemPedido item){
        itens.add(item);
    }

    public double valorTotal(){
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.valorSubTotal();
        }
        return total;
    }

    public int getNumero(){
        return numero;
    }
}
