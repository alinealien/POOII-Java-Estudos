package unidadeII;

//A classe Turma possui uma associação (agregação) com a classe Alunos.
//A navegabilidade no relacionamento entre as classes Turma e Alunos é unidirecional,
// ou seja, apenas a classe Turma precisa enxergar a classe Aluno. ?? COMO ASSIM?



import java.util.ArrayList;

public class Turma  {
    private String sala;
    private String disciplina;

    private ArrayList<Alunos> alunos;

    public Turma(String sala, String disciplina){
        this.sala = sala;
        this.disciplina = disciplina;

    }

    void adcionarAluno(){

    }

    public Turma(){
        alunos = new ArrayList<Alunos>();
    }

    public void addAlunos(Alunos alunos){
       // alunos.add(alunos);

    }

    private void dizerTurma( Turma turmas) {
       this.getDisciplina();

    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    void imprimir() {
        System.out.println("Sala: " + this.getSala());
        System.out.println("Disciplina: " + this.getDisciplina());


    }
}
