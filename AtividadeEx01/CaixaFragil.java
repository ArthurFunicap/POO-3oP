public class CaixaFragil extends Caixa{
    
    private double pesoMaxSuportado;

    public CaixaFragil(String identificador, String conteudo, double pesoKilo, float alturaCentimetro, double pesoMaxSuportado) {
        super(identificador, conteudo, pesoKilo, alturaCentimetro);
        this.pesoMaxSuportado = pesoMaxSuportado;
    }

    public double getPesoMaxSuportado() {
        return pesoMaxSuportado;
    }

    public void setPesoMaxSuportado(double pesoMaxSuportado) {
        this.pesoMaxSuportado = pesoMaxSuportado;
    }

    @Override
    public void exibirEtiqueta() {
        super.exibirEtiqueta();
        System.out.println("Peso máximo suportado: " + getPesoMaxSuportado());
    }
}
