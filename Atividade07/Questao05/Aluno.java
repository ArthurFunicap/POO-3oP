package Questao05;

public class Aluno {
    String nome;
    String cpf;
    double notas[] = new double[4];

    public Aluno(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public double calcularMedia(){
        double media = 0.0;
        int i;

        for(i = 0; i < 4; i++){
            media += notas[i];
        }
        media /= 4.0;

        return media;
    }
}
