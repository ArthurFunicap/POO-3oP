package Questao03;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String matricula;
    private ArrayList<Double> notas = new ArrayList<>();

    public double calcularMedia(){
        double media = 0;
        for (Double nota : notas) {
            media += nota;
        }
        media /= notas.size();

        return media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(Double notas) {
        this.notas.add(notas);
    }

    
}
