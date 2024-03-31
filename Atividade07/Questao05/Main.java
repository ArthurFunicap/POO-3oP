package Questao05;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Arthur", "000.000.000-00");

        aluno.notas[0] = 7.0;
        aluno.notas[1] = 8.5;
        aluno.notas[2] = 10.0;
        aluno.notas[3] = 2.5;

        System.out.printf("Media do aluno: %.2f\n", aluno.calcularMedia());

        aluno.notas[1] = 9.5;

        System.out.printf("Nova média do aluno: %.2f\n", aluno.calcularMedia());
    }
}
