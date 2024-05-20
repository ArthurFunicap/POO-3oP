package Questao05;

import Questao03.Aluno;
import java.util.HashMap;
import java.util.Scanner;

public class TesteMapaAluno extends Aluno {

    public TesteMapaAluno(int matricula, String nome, int idade, String curso) {
        super(matricula, nome, idade, curso);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int matricula;

        Aluno aluno1 = new Aluno(9124, "Arthur", 20, "Geologia");
        Aluno aluno2 = new Aluno(1289, "Maria", 50, "Enfermagem");
        Aluno aluno3 = new Aluno(1878, "Eduarda", 30, "Direito");
        Aluno aluno4 = new Aluno(3187, "Robson", 25, "Ciência da Computação");
        Aluno aluno5 = new Aluno(3817, "José", 50, "Agropecuária");

        HashMap<Integer, Aluno> mapaAluno = new HashMap<Integer, Aluno>();

        mapaAluno.put(aluno1.getMatricula(), aluno1);
        mapaAluno.put(aluno2.getMatricula(), aluno2);
        mapaAluno.put(aluno3.getMatricula(), aluno3);
        mapaAluno.put(aluno4.getMatricula(), aluno4);
        mapaAluno.put(aluno5.getMatricula(), aluno5);

        System.out.print("Digite uma matrícula: ");
        matricula = input.nextInt();

        if(mapaAluno.containsKey(matricula)){
            Aluno encontrado = mapaAluno.get(matricula);
            System.out.println("Nome: " + encontrado.getNome());
            System.out.println("Idade: " + encontrado.getIdade());
            System.out.println("Curso: " + encontrado.getCurso());
        }
        else{
            System.out.println("Aluno não encontrado!");
        }

        input.close();
    }
}
