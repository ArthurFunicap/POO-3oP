public class Livro extends ItemBiblioteca{
    private String autor;

    public Livro(String titulo, int anoPublicacao, int numeroCopias, String autor) {
        super(titulo, anoPublicacao, numeroCopias);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public double calcular_multa(int dias) {
        return 1.5 * dias;
    }
}
