package Questao04;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public String verificarDisponibilidade(){
        if(this.disponivel)
            return "Disponível";
        else
            return "Indisponível";
    }

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

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
