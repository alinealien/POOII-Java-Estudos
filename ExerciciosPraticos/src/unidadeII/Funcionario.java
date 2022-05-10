package unidadeII;

public class Funcionario {

    private String nome;
    private double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    String GetNome() {
        return nome;
    }

    void SetNome(String nome) {
        this.nome = nome;
    }

    double GetSalario() {
        return salario;
    }

    void SetSalario(double salario) {
        this.salario = salario;
    }
    void imprimir () {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
    }
}


