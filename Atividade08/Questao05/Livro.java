package Questao05;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if(anoPublicacao < 2025)
            this.anoPublicacao = anoPublicacao;
        else
            System.out.println("Ano de publicação inválido!");
    }
}
