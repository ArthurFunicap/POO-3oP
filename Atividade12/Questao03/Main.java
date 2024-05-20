package Questao03;

//ADICIONAR MAIS 5 ALUNOS

public class Main {
    public static void main(String[] args) {
        CadastroAluno cadastroAluno = new CadastroAluno();
        Aluno a1 = new Aluno(2318, "Arthur", 20, "Ciencia da Computação");
        Aluno a2 = new Aluno(4029, "Maria", 50, "Geologia");
        Aluno a3 = new Aluno(9320, "José", 50, "Agropecuária");
        Aluno a4 = new Aluno(3124, "Eduarda", 30, "Direito");
        Aluno a5 = new Aluno(1246, "Paulo", 30, "Medicina");
        Aluno a6 = new Aluno(1492, "Gabriel", 20, "Ciência da Computação");
        Aluno a7 = new Aluno(1095, "Humberto", 20, "Ciência da Computação");
        Aluno a8 = new Aluno(4102, "Danilo", 20, "Ciência da Computação");
        Aluno a9 = new Aluno(4928, "Eduardo", 20, "Ciência da Computação");
        Aluno a10 = new Aluno(1120, "Ana Bia", 20, "Ciência da Computação");


        cadastroAluno.adicionarAluno(a1);
        cadastroAluno.adicionarAluno(a2);
        cadastroAluno.adicionarAluno(a3);
        cadastroAluno.adicionarAluno(a4);
        cadastroAluno.adicionarAluno(a5);
        cadastroAluno.adicionarAluno(a6);
        cadastroAluno.adicionarAluno(a7);
        cadastroAluno.adicionarAluno(a8);
        cadastroAluno.adicionarAluno(a9);
        cadastroAluno.adicionarAluno(a10);

        cadastroAluno.imprimirAlunos();
    }
}
