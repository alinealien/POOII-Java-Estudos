package unidadeII;

//A classe Turma possui uma associação (agregação) com a classe Alunos.
//A navegabilidade no relacionamento entre as classes Turma e Alunos é unidirecional,
// ou seja, apenas a classe Turma precisa enxergar a classe Aluno. ?? COMO ASSIM?



import java.util.ArrayList;

public class Turma  {
    private String sala;
    private String disciplina;


    private ArrayList<Alunos> alunos;

    public Turma(String sala, String disciplina, String alunos){
        this.sala = sala;
        this.disciplina = disciplina;

        this.alunos = new ArrayList<Alunos>();

    }

    void AddAlunos(Alunos alunos){
        this.alunos.add(alunos);
    }


    String GetAlunos() {
        String a = " ";
        for(int i = 0; i < this.alunos.size(); i++) {
            a = a + this.alunos.get(i).getNome() + " | " + " Matricula:  " +  this.alunos.get(i).getMatricula() + "\n";
        }
        return a;

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
        //System.out.println("Sala: " + this.getSala());
        //System.out.println("Disciplina: " + this.getDisciplina());
        System.out.println("Aluno: " + this.GetAlunos() + "\n" + "Disciplina: " + this.getDisciplina() );




    }
}
