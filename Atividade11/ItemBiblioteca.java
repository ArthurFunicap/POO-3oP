public class ItemBiblioteca{
    private String titulo;
    private int anoPublicacao;
    private int numeroCopias;

    public ItemBiblioteca(String titulo, int anoPublicacao, int numeroCopias) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.numeroCopias = numeroCopias;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public int getNumeroCopias() {
        return numeroCopias;
    }
    public void setNumeroCopias(int numeroCopias) {
        this.numeroCopias = numeroCopias;
    }

    public double calcular_multa(int dias){
        return 0;
    }

    public void emprestar(){
        if(numeroCopias <= 0){
            System.out.println("Item: " + getTitulo() + " indisponível!");
        }
        else{
            setNumeroCopias(getNumeroCopias() - 1);
            System.out.println("Item: " + getTitulo() + " emprestado com sucesso!");
        }
    }

    public void devolver(){
        setNumeroCopias(getNumeroCopias() + 1);
        System.out.println("Item: " + getTitulo() + " devolvido!");
    }
}