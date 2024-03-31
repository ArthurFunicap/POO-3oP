package Questao02;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Frederico Cianca", 51, "Sem", "Cinco Conjuntos", "Londrina", "Paraná", "50798-001");
        Medico medico = new Medico(0000, "Nelson", "Masculino", "Nenhuma", endereco);

        System.out.println("Endereço da clínica:");
        System.out.println();
        System.out.println("Rua: " + endereco.getRua());
        System.out.println("Número: " + endereco.getNumero());
        System.out.println("Complemento: " + endereco.getComplemento());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Cidade: " + endereco.getCidade());
        System.out.println("UF: " + endereco.getUf());
        System.out.println("CEP: " + endereco.getCep());
        System.out.println();
        System.out.println("Dados do médico:");
        System.out.println();
        System.out.println("Código: " + medico.getCodigo());
        System.out.println("Código: " + medico.getNome());
        System.out.println("Código: " + medico.getSexo());
        System.out.println("Código: " + medico.getEspecialidade());
        System.out.println();
        System.out.println("Endereço do médico: ");
        System.out.println();
        System.out.println("Rua: " + endereco.getRua());
        System.out.println("Número: " + endereco.getNumero());
        System.out.println("Complemento: " + endereco.getComplemento());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Cidade: " + endereco.getCidade());
        System.out.println("UF: " + endereco.getUf());
        System.out.println("CEP: " + endereco.getCep());

        endereco.setRua("Rua Nova");
        endereco.setNumero(25);
        endereco.setComplemento("25 B");

        medico.setCodigo(1);
        medico.setNome("Diego");
        medico.setEspecialidade("Psicólogo");

        System.out.println("---=---=---=---=---=---=---");

        System.out.println("Endereço da clínica:");
        System.out.println();
        System.out.println("Rua: " + endereco.getRua());
        System.out.println("Número: " + endereco.getNumero());
        System.out.println("Complemento: " + endereco.getComplemento());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Cidade: " + endereco.getCidade());
        System.out.println("UF: " + endereco.getUf());
        System.out.println("CEP: " + endereco.getCep());
        System.out.println();
        System.out.println("Dados do médico:");
        System.out.println();
        System.out.println("Código: " + medico.getCodigo());
        System.out.println("Código: " + medico.getNome());
        System.out.println("Código: " + medico.getSexo());
        System.out.println("Código: " + medico.getEspecialidade());
        System.out.println();
        System.out.println("Endereço do médico: ");
        System.out.println();
        System.out.println("Rua: " + endereco.getRua());
        System.out.println("Número: " + endereco.getNumero());
        System.out.println("Complemento: " + endereco.getComplemento());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Cidade: " + endereco.getCidade());
        System.out.println("UF: " + endereco.getUf());
        System.out.println("CEP: " + endereco.getCep());
    }
}
