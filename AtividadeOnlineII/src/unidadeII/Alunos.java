package unidadeII;

import java.util.ArrayList;

public class Alunos extends Pessoa {

    private String matricula;
    private Integer ano_ingresso;
    private String curso;

    //ArrayList<Turma> turmas;
    ArrayList<Alunos> alunos;


    public Alunos(String matricula, Integer ano_ingresso, String curso, String nome, String endereco, String cpf) {
        super(nome, endereco, cpf);
        this.matricula = matricula;
        this.ano_ingresso = ano_ingresso;
        this.curso = curso;
        //turmas = new ArrayList<>();
        alunos = new ArrayList<>();


    }

    void addAlunos(Alunos alunos) {
        this.alunos.add(alunos);
    }

    String GetAlunos() {
        String a = " ";
        for(int i = 0; i < this.alunos.size(); i++) {
            a = a + this.alunos.get(i).getNome() + "\n";
        }
        return a;

    }



    /*void addAlunos(Alunos a){
        alunos.add(a);
    }

    void  getAlunos() {
        for (int i = 0; i < alunos.size(); i++) {
            Alunos a = alunos.get(i);


        }
    }

    void addTurmas(Turma t) {
        turmas.add(t);
    }

    void getTurmas() {
        for (int i = 0; i < turmas.size(); i++) {
            Turma t = turmas.get(i);
            t.dizerTurma();

        }
    }

     */

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getAno_ingresso() {
        return ano_ingresso;
    }

    public void setAno_ingresso(Integer ano_ingresso) {
        this.ano_ingresso = ano_ingresso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


    void imprimir() {
        super.imprimir();
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Ano de Ingresso: " + this.getAno_ingresso());
        System.out.println("Curso: " + this.getCurso());


    }
}