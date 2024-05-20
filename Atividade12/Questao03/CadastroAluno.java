package Questao03;

import java.util.ArrayList;

public class CadastroAluno {
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void imprimirAlunos(){
        System.out.println("Alunos: ");
        for (Aluno aluno : alunos) {
            System.out.println("Matricula: " + aluno.getMatricula());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Curso: " + aluno.getCurso());
        }
    }
}
