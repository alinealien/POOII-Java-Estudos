package unidadeII;

//CLASSE MÃE
public class Funcionario {

    //ATRIBUTOS
    //CADA ATRIBUTO DEVE TER UM METODO GET E SET - RECUPERA OU ALTERA O VALOR DO ATRIBUTO.
    private String nome;
    private double salario;

    //Novo atributo departamento
    private Departamento departamento;

    //IMPORTANTE:
    //SEMPRE QUE FOR CRIADO UM NOVO ATRIBUTO DEVE-SE

    //CONSTRUTOR
    Funcionario(String nome, double salario, Departamento departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    //METODOS GET E SET
    String GetNome() { //RESGATA O VALOR DO ATRIBUTO.
        return (this.nome); //O QUE VAI SER RETORNADO
    }

    void SetNome(String nome) { //ELE NÃO RETORNA NADA. RECEBE O VALOR QUE SERA ALTERADO NO ATRIBUTO
        this.nome = nome;
    }

    double Getsalario() {
        return (this.salario);
    }

    void Setsalario(double salario) {
        this.salario = salario; //O VALOR QUE SERA ALTERADO
    }

    //IMPRIME O VALOR DOS ATRIBUTOS DA CLASSE
    void imprimir () {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
    }
}


