import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Pequeno Príncipe", 1943, 20, "Antoine de SE");
        DVD dvd1 = new DVD("Piratas do Caribe", 2003, 10, 143);
        Revista r1 = new Revista("Forbes", 2023, 5, 400);
        
        l1.emprestar();
        dvd1.emprestar();
        r1.emprestar();

        System.out.println("Número de cópias de " + l1.getTitulo() + ": " + l1.getNumeroCopias());
        System.out.println("Número de cópias de " + dvd1.getTitulo() + ": " + dvd1.getNumeroCopias());
        System.out.println("Número de cópias de " + r1.getTitulo() + ": " + r1.getNumeroCopias());

        l1.devolver();
        dvd1.devolver();
        r1.devolver();

        System.out.println("Número de cópias de " + l1.getTitulo() + ": " + l1.getNumeroCopias());
        System.out.println("Número de cópias de " + dvd1.getTitulo() + ": " + dvd1.getNumeroCopias());
        System.out.println("Número de cópias de " + r1.getTitulo() + ": " + r1.getNumeroCopias());

        dvd1.emprestar();
        LocalDate dataDevolucao = LocalDate.now();

        LocalDate devolucaoAtrasada = dataDevolucao.plusDays(10);

        System.out.println("Multa por atraso na devolução do DVD " + dvd1.getTitulo() + ": " + dvd1.calcular_multa(10));
    }
}
