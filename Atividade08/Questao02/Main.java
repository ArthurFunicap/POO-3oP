package Questao02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Carro carro01 = new Carro("Toyota", "Etios", 2018);
        int opcao, valor;

        do{
            System.out.println("Opções:");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Desacelerar");
            System.out.println("3 - Velocidade atual");
            System.out.println("4 - Parar");
            System.out.print("Digite uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o quanto deseja acelerar: ");
                    valor = input.nextInt();
                    carro01.acelerar(valor);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Digite o quanto deseja desacelerar: ");
                    valor = input.nextInt();
                    carro01.desacelerar(valor);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Velocidade atual do carro: " + carro01.getVelocidadeAtual());
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Estacionando o carro!");
                    carro01.setVelocidadeAtual();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            
        } while(opcao != 4);

        input.close();
    }
}
