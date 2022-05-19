package unidadeII;

//A classe Turma possui uma associação (agregação) com a classe Alunos.
//A navegabilidade no relacionamento entre as classes Turma e Alunos é unidirecional,
// ou seja, apenas a classe Turma precisa enxergar a classe Aluno. ?? COMO ASSIM?

import java.util.ArrayList;

public class Turma {
    private String sala;
    private String disciplina;

    public Turma(String sala, String disciplina) {
        this.sala = sala;
        this.disciplina = disciplina;
    }

    void dizerTurma(){
        System.out.println("A sala : " + this.sala);
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


}
