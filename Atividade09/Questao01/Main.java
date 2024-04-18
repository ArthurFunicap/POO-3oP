package Questao01;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        String nome;
        double salarioAnual;
        int idade;

        int op;
        
        while(true){
            System.out.println("Opções:");
            System.out.println("1 - Adicionar funcionário");
            System.out.println("0 - Encerrar programa");
            System.out.print("DIgite uma opção: ");
            op = input.nextInt();

            if(op == 1){
                Funcionario funcionario = new Funcionario();

                System.out.print("Digite o nome do funcionário: ");
                nome = input.next();
                funcionario.setNome(nome);
                System.out.print("Digite o salário anual: ");
                salarioAnual = input.nextDouble();
                funcionario.setSalarioAnual(salarioAnual);
                System.out.print("Digite a idade do funcionário: ");
                idade = input.nextInt();
                funcionario.setIdade(idade);

                funcionarios.add(funcionario);
            }else{
                break;
            }
        }

        for (Funcionario f : funcionarios) {
            if(f.getIdade() < 30 && f.getSalarioAnual() > 50000.00)
                System.out.println(f.getNome());
        }

        input.close();
    }
}
