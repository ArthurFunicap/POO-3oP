package Questao02;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int velocidadeAtual = 0;

    public Carro(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public void acelerar(int valor){
        this.velocidadeAtual += valor;
    }

    public void desacelerar(int valor){
        this.velocidadeAtual -= valor;

        if(this.velocidadeAtual < 0)
            this.velocidadeAtual = 0;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(){
        this.velocidadeAtual = 0;
    }
}
