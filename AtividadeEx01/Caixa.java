public class Caixa{

    private String identificador;
    private String conteudo;
    private double pesoKilo;
    private float alturaCentimetro;

    public Caixa(String identificador, String conteudo, double pesoKilo, float alturaCentimetro) {
        this.identificador = identificador;
        this.conteudo = conteudo;
        this.pesoKilo = pesoKilo;
        this.alturaCentimetro = alturaCentimetro;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public double getPesoKilo() {
        return pesoKilo;
    }

    public void setPesoKilo(double pesoKilo) {
        this.pesoKilo = pesoKilo;
    }

    public float getAlturaCentimetro() {
        return alturaCentimetro;
    }

    public void setAlturaCentimetro(float alturaCentimetro) {
        this.alturaCentimetro = alturaCentimetro;
    }

    public void exibirEtiqueta(){
        System.out.println("ID: " + getIdentificador());
        System.out.println("Conteúdo: " + getConteudo());
        System.out.println("Peso (Kg): " + getPesoKilo());
        System.out.println("Altura (cm): " + getAlturaCentimetro());
    }
}