package Questao01;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta01 = new ContaBancaria("Arthur", 0);

        conta01.setTitularConta("Arthur");
        System.out.println("Titular da conta: " + conta01.getTitularConta());
        conta01.setNumeroConta(250320);
        System.out.println("Número da conta: " + conta01.getNumeroConta());
        conta01.setSaldo(3200.00);
        System.out.println("Saldo: " + conta01.getSaldo());
    }
}
