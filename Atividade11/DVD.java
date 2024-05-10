public class DVD extends ItemBiblioteca{
    private int duracao; //Em minutos

    public DVD(String titulo, int anoPublicacao, int numeroCopias, int duracao) {
        super(titulo, anoPublicacao, numeroCopias);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public double calcular_multa(int dias) {
        return 2.5 * dias;
    }
}