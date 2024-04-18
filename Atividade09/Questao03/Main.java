package Questao03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        
        int opcao;

        String nome;
        String matricula;
        Double nota;
        while(true){
            System.out.println("Opções:");
            System.out.println("1 - Adicionar nota");
            System.out.println("2 - Listar status dos alunos");
            System.out.println("0 - Encerrar programa");
            System.out.print("Digite uma opçao: ");
            opcao = input.nextInt();

            if(opcao == 1){
                Aluno aluno = new Aluno();
                int i, j = 0;

                System.out.print("Digite quantas notas vai adicionar: ");
                i = input.nextInt();

                System.out.print("Digite o nome do aluno: ");
                nome = input.next();
                aluno.setNome(nome);
                System.out.print("Digite a matrícula do aluno: ");
                matricula = input.next();
                aluno.setMatricula(matricula);
                
                for(j = 0; j < i; j++){
                    System.out.printf("Digite a nota %d: ", j+1);
                    nota = input.nextDouble();
                    aluno.setNotas(nota);
                }
                alunos.add(aluno);
            }else if(opcao == 2){
                System.out.println("Status dos alunos: ");
                for (Aluno a : alunos) {
                    if(a.calcularMedia() >= 7){
                        System.out.printf("%s aprovado!\n", a.getNome());
                    }
                }

                System.out.println();

                for (Aluno a : alunos) {
                    if(a.calcularMedia() < 7){
                        System.out.printf("%s reprovado!\n", a.getNome());
                    }
                }
            }else{
                System.out.println("Fim de programa!");
                break;
            }
        }
        input.close();
    }
}
