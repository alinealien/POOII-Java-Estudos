package unidadeII;

//A classe Turma possui uma associação (agregação) com a classe Alunos.
//A navegabilidade no relacionamento entre as classes Turma e Alunos é unidirecional,
// ou seja, apenas a classe Turma precisa enxergar a classe Aluno. ?? COMO ASSIM?



import java.util.ArrayList;

public class Turma implements Turmas {
    private String sala;
    private String disciplina;


    private ArrayList<Turma> turma;


    private ArrayList<Alunos> alunos;

    private ArrayList<Professor> professor;


    public Turma(String sala1, String disciplina2) {
        this.sala = sala1;
        this.disciplina = disciplina2;


        this.alunos = new ArrayList<Alunos>();

        this.turma = new ArrayList<Turma>();

        this.professor = new ArrayList<Professor>();

    }

    @Override
    public void AddAlunos(Alunos alunos) {
        this.alunos.add(alunos);
    }


    void AddTurma(Turma turma) {
        this.turma.add(turma);
    }
    String GetAlunos() {
        StringBuilder a = new StringBuilder(" ");
        for (int i = 0; i < this.alunos.size(); i++) {
            a.append(this.alunos.get(i).getNome()).append(" | ").append(" Matricula:  ").append(this.alunos.get(i).getMatricula()).append("\n");
        }
        return a.toString();

    }


    /*void GetTurma(){
        String t = " ";
        for(int i = 0; i < this.turma.size(); i++){
            t = t + this.turma.get(i).getDisciplina();
            System.out.println(this.turma.get(i).getDisciplina());

        }
    }*/

     @Override
     public void AddProfessor(Professor professor) {
        this.professor.add(professor);
    }

    String GetProfessor(){
        StringBuilder p = new StringBuilder(" ");
        for(int i = 0; i < this.professor.size(); i++){
            p.append(this.professor.get(i).getNome());
            System.out.println(this.professor.get(i).getNome());

        }
        return p.toString();
    }



        public String getSala () {
            return sala;
        }

        public void setSala (String sala){
            this.sala = sala;
        }

        public String getDisciplina () {
            return disciplina;
        }

        public void setDisciplina (String disciplina){
            this.disciplina = disciplina;
        }


       void imprimir () {
           System.out.println("Sala: " + this.getSala());
           System.out.println("Disciplina: " + this.getDisciplina());
           System.out.println("Alunos nesta Disciplina: " + this.GetAlunos());
           //System.out.println("Aluno: " + this.GetAlunos() + "\n" + "Disciplina: " + this.getDisciplina());


       }
    }
