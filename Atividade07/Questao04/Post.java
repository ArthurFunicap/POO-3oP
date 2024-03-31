package Questao04;

public class Post {
    String texto;
    String link;
    int numeroCurtidas = 0;
    int numeroCompartilhamentos = 0;

    public Post(String texto, String link){
        this.texto = texto;
        this.link = link;
    }

    void curtir(){
        numeroCurtidas++;
    }

    void compartilhar(){
        numeroCompartilhamentos++;
    }
}
