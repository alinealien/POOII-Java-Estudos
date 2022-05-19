package unidadeII;

/*
Na classe Main:

1. Instanciar pelo menos 2 objetos da classe Aluno.

2. Instanciar pelo menos 1 objeto da classe Turma.

3. Associar pelo menos 2 objetos da classe Aluno a um único objeto da classe Turma.

4. Imprimir uma lista com o nome de todos os Alunos que fazem parte de uma Turma. Dica: Implemente um método GetAlunos.
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n Atividade Online II");
        System.out.println("\n");

        // Instanciar pelo menos 2 objetos da classe Aluno.
        Alunos A1 = new Alunos("090909", 2018, "Computação", "Aline Antunes", "Areia Branca", "0909087654");
        Alunos A2 = new Alunos("090908", 2018, "Computação", "Sirius Black", "Areia Branca", "0909087655");


        //Instanciar pelo menos 1 objeto da classe Turma.
        Turma T1 = new Turma("0202", "POO II");
        Turma T2 = new Turma("Sala A2", "Estrutura de Dados");

        //Associar pelo menos 2 objetos da classe Aluno a um único objeto da classe Turma. COMO ASSIM?


        //Imprimir uma lista com o nome de todos os Alunos que fazem parte de uma Turma.
        System.out.println("Lista das Turmas: \n"  );

        A1.addTurmas(T1);
        A2.addTurmas(T2);


    }


}
