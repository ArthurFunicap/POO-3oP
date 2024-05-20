package Questao01;

public class Circulo{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double calcularAreaCirculo(){
        return 3.14159 * (this.raio * this.raio);
    }
}


