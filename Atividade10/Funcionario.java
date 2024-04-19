public class Funcionario{
    
    private String nome;
    private String inscricao;
    private double salario;
    private String turno;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void horariosDisponiveis(){
        System.out.println("A definir");
    }

    public String horarioTrabalho(){
        return getTurno();
    }

    public void informacoesFuncionario(){
        System.out.println("Nome: " + getNome());
        System.out.println("Inscrição: " + getInscricao());
        System.out.println("Salário: " + getSalario());
        System.out.println("Turno: " + getTurno());
    }

    public String funcaoDesempenhar(){
        return "";
    }
}