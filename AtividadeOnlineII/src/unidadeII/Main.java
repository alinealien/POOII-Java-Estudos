package unidadeII;

/*
Na classe Main:

1. Instanciar pelo menos 2 objetos da classe Aluno.

2. Instanciar pelo menos 1 objeto da classe Turma.

3. Associar pelo menos 2 objetos da classe Aluno a um único objeto da classe Turma.

4. Imprimir uma lista com o nome de todos os Alunos que fazem parte de uma Turma. Dica: Implemente um método GetAlunos.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Atividade Online II");
        System.out.println("-----------------------------------------------------------------------");

        // Instanciar pelo menos 2 objetos da classe Aluno.
        //Lista Alunos
        System.out.println("Lista dos Alunos: \n"  );

        Alunos A1 = new Alunos("090909", 2018, "Computação", "Aline Antunes", "Areia Branca", "0909087654");
        A1.imprimir();
        System.out.println("\n");
        Alunos A2 = new Alunos("090908", 2018, "Computação", "Sirius Black", "Areia Branca", "0909087655");
        A2.imprimir();

        System.out.println(A1.GetAlunos() + " ");


        System.out.println("_____________________________________________");
        //Imprimir uma lista com o nome de todos os Alunos que fazem parte de uma Turma.
        System.out.println("Lista de todas as Turmas: "  );
        //System.out.println(T1.getDisciplina());
        //System.out.println(T2.getDisciplina());


        //Instanciar pelo menos 1 objeto da classe Turma.
        Turma T1 = new Turma("0202", "POO II");
        T1.imprimir();
        Turma T2 = new Turma("0303", "Estrutura de Dados");
        T2.imprimir();





        A1.getTurma().getDisciplina();


        //System.out.println(T1.getDisciplina(A1));






        //System.out.println(T1.getTurmas() + " ");


        //Associar pelo menos 2 objetos da classe Aluno a um único objeto da classe Turma. COMO ASSIM?







    }


}
