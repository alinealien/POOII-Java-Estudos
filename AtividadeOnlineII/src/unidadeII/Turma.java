package unidadeII;

//A classe Turma possui uma associação (agregação) com a classe Alunos.
//A navegabilidade no relacionamento entre as classes Turma e Alunos é unidirecional,
// ou seja, apenas a classe Turma precisa enxergar a classe Aluno. ?? COMO ASSIM?



import java.util.ArrayList;

public class Turma {
    private String sala;
    private String disciplina;


    private ArrayList<Turma> turmas;


    private ArrayList<Alunos> alunos;


    public Turma(String sala, String disciplina) {
        this.sala = sala;
        this.disciplina = disciplina;


        this.alunos = new ArrayList<Alunos>();

        this.turmas = new ArrayList<Turma>();

    }

    void AddAlunos(Alunos alunos) {
        this.alunos.add(alunos);
    }


    String GetAlunos() {
        String a = " ";
        for (int i = 0; i < this.alunos.size(); i++) {
            a = a + this.alunos.get(i).getNome() + " | " + " Matricula:  " + this.alunos.get(i).getMatricula() + "\n";
        }
        return a;

    }

    String GetTurmas(){
        String t = " ";
        for(int i = 0; i < this.turmas.size(); i++){
            t = t + this.turmas.get(i).getDisciplina();
            System.out.println(this.turmas.get(i).getDisciplina());

        }
        return t;
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
            System.out.println("Alunos nesta Disciplina: " + this.GetAlunos());;
            //System.out.println("Aluno: " + this.GetAlunos() + "\n" + "Disciplina: " + this.getDisciplina());


        }
    }
