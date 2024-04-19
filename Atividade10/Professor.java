public class Professor extends Funcionario{
    
    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void lecionar(){
        //Em desenvolvimento
    }

    public void criarAtividades(){
        //Em desenvolvimento
    }

    @Override
    public String funcaoDesempenhar() {
        return "Dar aula referente à disciplina " + getDisciplina() + " e aplicar atividades avaliativas";
    }
}
