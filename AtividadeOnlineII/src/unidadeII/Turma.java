package unidadeII;

//A classe Turma possui uma associação (agregação) com a classe Alunos.

import java.util.ArrayList;

public class Turma {
    private String sala;
    private String disciplina;

    public Turma(String sala, String disciplina) {
        this.sala = sala;
        this.disciplina = disciplina;
    }

    private ArrayList<Alunos> alunos;

    public Turma(String sala, String disciplina, String alunos) {
        this.sala = sala;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<Alunos>();
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

    String GetAlunos() {
    String a = "";


}
