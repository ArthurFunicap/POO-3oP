public class Diretor extends Funcionario{
    
    private String segTurno;

    public String getSegTurno() {
        return segTurno;
    }

    public void setSegTurno(String segTurno) {
        this.segTurno = segTurno;
    }

    public double criarDescontos(double valor){
        return valor * (10/100);
    }

    public void encomendarFardas(){
        //Em desenvolvimento
    }

    public void gerenciarProfessores(){
        //Em desenvolvimento
    }

    @Override
    public String funcaoDesempenhar() {
        return "Gerenciar atividades escolares";
    }
}
