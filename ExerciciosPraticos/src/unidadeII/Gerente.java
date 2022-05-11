package unidadeII;

//ESPECIALIZAÇÃO DA CLASSE FUNCIONARIO
public class Gerente extends Funcionario {
    private String sala;

    public Gerente(String nome, double salario,String sala) {
        super(nome, salario);
        this.sala = sala;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String GetSala() {
        return sala;
    }

    public void SetSala(String sala) {
        this.sala = sala;
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Sala: " + this.sala);
    }
}
