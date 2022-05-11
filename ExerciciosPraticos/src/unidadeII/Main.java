package unidadeII;

//CLASSE DE TESTES
public class Main {
    public static void main(String[] args){
        System.out.println("\n Aula de Herança");
        System.out.println("\n");

   //PARA TESTAR DEVE-SE CRIAR NA MAIN UM NOVO DEPARTAMENTO(ETC) -
   //PQ QUANDO CHAMA O CONSTRUTOR DE FUNCIONARIO FOR CHAMADO RPECISAMOS PASSAR OS TRES ATRIBUTOS QUE FOI PASSADO

    Departamento D1 = new Departamento("Departamento de informatica ");

    Funcionario F1 = new Funcionario("Aline", 2000, D1);
    F1.imprimir();
    System.out.println("\n");

    Secretaria S1 = new Secretaria("Sirius", 1500,"311", D1);
    S1.imprimir();
    System.out.println("\n");

    //Alterando o valor do atributo Nome do Obejto S1
    S1.SetNome("Veronica");
    System.out.println(S1.GetNome());
    }
}
