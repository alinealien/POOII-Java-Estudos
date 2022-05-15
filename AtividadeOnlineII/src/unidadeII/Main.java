package unidadeII;

/*
Na classe Main:

1. Instanciar pelo menos 2 objetos da classe Aluno.

2. Instanciar pelo menos 1 objeto da classe Turma.

3. Associar pelo menos 2 objetos da classe Aluno a um único objeto da classe Turma.

4. Imprimir uma lista com o nome de todos os Alunos
   que fazem parte de uma Turma. Dica: Implemente um método GetAlunos.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("\n Atividade Online II");
        System.out.println("\n");

        // Instanciar pelo menos 2 objetos da classe Aluno.
        Alunos A1 = new Alunos("090909", 2018, "Computação", "Aline Antunes", "Areia Branca", "0909087654");

        //Instanciar pelo menos 1 objeto da classe Turma.
        Turma T1 = new Turma("Sala A1", "Computação");
        Turma T2 = new Turma("Sala A2", "Física");

        //Associar pelo menos 2 objetos da classe Aluno a um único objeto da classe Turma. - COMO ASSIM?
        


        System.out.println("Lista dos Alunos: ");
        System.out.println();
        //System.out.println(A1.getNome());



    }
}
