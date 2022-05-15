package unidadeII;


public class Alunos extends Pessoa {

    private String matricula;
    private Integer ano_ingresso;
    private String curso;

    public Alunos(String matricula, Integer ano_ingresso, String curso, String nome, String endereco, String cpf) {
        super(nome, endereco, cpf);
        this.matricula = matricula;
        this.ano_ingresso = ano_ingresso;
        this.curso = curso;
    }

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


}
