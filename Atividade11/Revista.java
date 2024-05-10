public class Revista extends ItemBiblioteca{
    private int edicao;

    public Revista(String titulo, int anoPublicacao, int numeroCopias, int edicao) {
        super(titulo, anoPublicacao, numeroCopias);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public double calcular_multa(int dias) {
        return 0.5 * dias;
    }
}
