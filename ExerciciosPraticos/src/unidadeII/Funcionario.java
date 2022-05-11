package unidadeII;

//CLASSE MÃE
public class Funcionario {

    //ATRIBUTOS
    //CADA ATRIBUTO DEVE TER UM METODO GET E SET - RECUPERA OU ALTERA O VALOR DO ATRIBUTO.
    private String nome;
    private double salario;

    //NOVO ATRIBUTO DO TIPO DEPARTAMENTO
    private Departamento departamento;

    //IMPORTANTE:
    //TODO OBJETO QUE FOR CRIADO DO TIPO FUNCIONARIO NA CLASSE MAIN ELE CHAMARÁ O CONSTRUTOR DESSA CLASSE(FUNCIONARIO)

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

    //metodos puclicos que acessam os dados privados: Get e Set SÃO PUBLICOS(pertencem a mesma classa)
    //QUANDO OUTRA CLASSE PRECISA ACESSAR/MODIFICAR OS ATRIBUTOS DE OUTRA CLASSES DEVE-SE SER PELOS METODOS GET E SET
    //IMPRIME O VALOR DOS ATRIBUTOS DA CLASSE
    void imprimir () {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Departamento: " + this.departamento.Getdescricao()); //Getdescricao() ACESSA O VALOR QUE PERTENCE AO OBJ DESCRICAO
    }
}


