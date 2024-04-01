package Questao01;

public class ContaBancaria{
    private String titularConta;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String titularConta, int numeroConta){
        this.titularConta = titularConta;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}