package unidadeII;

//CLASSE DE TESTES
public class Main {
    public static void main(String[] args){
        System.out.println("\n Aula de Herança");
        System.out.println("\n");


    Funcionario F1 = new Funcionario("Aline", 2000);
    F1.imprimir();
    System.out.println("\n");

    Secretaria S1 = new Secretaria("Sirius", 1500,"311");
    S1.imprimir();
    System.out.println("\n");

    //Alterando o valor do atributo Nome do Obejto S1
    S1.SetNome("Veronica");
    System.out.println(S1.GetNome());
    }
}
