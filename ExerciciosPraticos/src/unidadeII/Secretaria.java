package unidadeII;

//HERANÇA DA CLASSE FUNCIONARIO
//VAI HERDAR OS ATRIBUTOS (NOME E SALARIO. ALEM DO RAMAL)
public class Secretaria extends Funcionario {
    private String ramal;

    Secretaria(String nome, double salario, String ramal) {
        super(nome, salario);// SUPER: ESTA CHAMANDO O CONSTRUTOR DA CLASSE MÃE(FUNCIONARIO)
        this.ramal = ramal; //RECEBE RAMAL
    }

    //GET E SET DOS 3 ATRIBUTOS - NOME, SALARIO E RAMAL

    void SetNome(String nome) {
        super.SetNome(nome);
    }

    String GetNome() {
        return (super.GetNome());
    }

    void SetSalario(double salario) {
        super.Setsalario(salario);
    }

    double Getsalario() {
        return (super.Getsalario());
    }

    void Setramal(String ramal) {
        this.ramal = ramal;
    }

    String Getramal() {
        return (this.ramal);
    }

    void imprimir() {
        super.imprimir(); //ACIONA A CLASSE MAE
        System.out.println("ramal: " + this.ramal);
    }


}