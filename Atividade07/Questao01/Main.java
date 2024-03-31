package Questao01;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente(0000, "Arthur", "25/03/2004", "Masculino", "Nenhum", "Poeira", "A+");

        System.out.println("Código do paciente: " + paciente.getCodigo());
        System.out.println("Nome do paciente: " + paciente.getNome());
        System.out.println("Data de nascimento do paciente: " + paciente.getDataNascimento());
        System.out.println("Sexo do paciente: " + paciente.getSexo());
        System.out.println("Plano de saúde do paciente: " + paciente.getPlanoSaude());
        System.out.println("Alergia do paciente: " + paciente.getAlergia());
        System.out.println("Tipo sanguíneo do paciente: " + paciente.getTipoSanguineo());

        System.out.println();

        paciente.setCodigo(0001);
        paciente.setNome("Maria");
        paciente.setDataNascimento("27/06/1980");
        paciente.setSexo("Feminino");
        paciente.setPlanoSaude("Nenhum");
        paciente.setAlergia("Nenhuma");
        paciente.setTipoSanguineo("A");

        System.out.println("Código do paciente: " + paciente.getCodigo());
        System.out.println("Nome do paciente: " + paciente.getNome());
        System.out.println("Data de nascimento do paciente: " + paciente.getDataNascimento());
        System.out.println("Sexo do paciente: " + paciente.getSexo());
        System.out.println("Plano de saúde do paciente: " + paciente.getPlanoSaude());
        System.out.println("Alergia do paciente: " + paciente.getAlergia());
        System.out.println("Tipo sanguíneo do paciente: " + paciente.getTipoSanguineo());
    }
}
