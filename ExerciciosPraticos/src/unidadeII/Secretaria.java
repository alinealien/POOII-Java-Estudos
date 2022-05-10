package unidadeII;


public class Secretaria extends Funcionario {
    private String ramal;

    Secretaria(String nome, double salario, String ramal) {
        super(nome, salario);
        this.ramal = ramal;
    }

    void SetNome(String nome) {
        super.SetNome(nome);
    }

    String GetNome() {
        return (super.GetNome());
    }

    void SetSalario(double salario) {
        super.SetSalario(salario);
    }

    double Getsalario() {
        return (super.GetSalario());
    }

    void Setramal(String ramal) {
        this.ramal = ramal;
    }

    String Getramal() {
        return (this.ramal);
    }

    void imprimir() {
        super.imprimir();
        System.out.println("ramal: " + this.ramal);
    }


}