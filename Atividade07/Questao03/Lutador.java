package Questao03;

public class Lutador {
    String nome;
    int energia, forca;

    public Lutador(String nome, int energia, int forca){
        this.nome = nome;
        this.energia = energia;
        this.forca = forca;
    }

    void reduzirEnergia(int forca){
        this.energia -= forca;

        if(this.energia < 0)
            this.energia = 0;
    }

    void aplicarGolpe(Lutador lutador){
        int i;
        if(lutador.nome == "Ryu"){
            for(i = 0; i < 8; i++){
                lutador.reduzirEnergia(this.forca);
            }
        } else{
            for(i = 0; i < 3; i++){
                lutador.reduzirEnergia(this.forca);
            }
        }
    }
}
