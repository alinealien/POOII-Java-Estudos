package unidadeII;

/*
Na classe Main:

1. Instanciar pelo menos 2 objetos da classe Aluno.

2. Instanciar pelo menos 1 objeto da classe Turma.

3. Associar pelo menos 2 objetos da classe Aluno a um único objeto da classe Turma.

4. Imprimir uma lista com o nome de todos os Alunos que fazem parte de uma Turma. Dica: Implemente um método GetAlunos.
 */

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Atividade Online II");
        System.out.println();

        System.out.println(" _ _ _ _ _ _ _ _ _ _ CADASTRO ALUNOS (LISTA)  _ _ _ _ _ _ _ _ _ _ "  );
        System.out.println();

        //1. Instanciar pelo menos 2 objetos da classe Aluno.
        Alunos A1 = new Alunos("090909", 2018, "Computação", "Aline Antunes", "Areia Branca", "0909087654");

        Alunos A2 = new Alunos("090908", 2018, "Computação", "Sirius Black", "Areia Branca", "0909087655");

        Alunos A3 = new Alunos("090907", 2018, "Biologia", "Betty", "Areia Branca", "0909087653");

        A1.imprimir();
        System.out.println();
        A2.imprimir();
        System.out.println();
        A3.imprimir();


        System.out.println();

       // System.out.println("---------------------------------------------------------------------");


        //Imprimir uma lista com o nome de todos os Alunos que fazem parte de uma Turma.
        //Associar pelo menos 2 objetos da classe Aluno a um único objeto da classe Turma.

        Turma turma1 = new Turma("01", "Programação Orientada a Objetos ");

        Turma turma2 = new Turma("02", "Programação De Jogos ");

        Turma turma3 = new Turma("03", "Estrutura de Dados");

        System.out.println("_ _ _ _ _ _ _ _ _ _TODAS AS TURMAS_ _ _ _ _ _ _ _ _ _");
        System.out.println(turma1.getDisciplina());
        System.out.println(turma2.getDisciplina());
        System.out.println(turma3.getDisciplina());




        System.out.println(" _ _ _ _ _ _ _ _ _ _ ALUNOS EM TURMAS _ _ _ _ _ _ _ _ _ _  "  );
        System.out.println();

        //2. Instanciar pelo menos 1 objeto da classe Turma.
        turma1.AddAlunos(A1);
        turma1.AddAlunos(A2);
        turma1.imprimir();

        turma2.AddAlunos(A1);
        turma2.imprimir();

        turma3.AddAlunos(A3);
        turma3.imprimir();














    }



}


    // PROJETO INICIAL


    /*
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

        /* //PARTE OCULTA
        //System.out.println(A1.GetAlunos() + " ");


        System.out.println("_____________________________________________");

        System.out.println("Lista de todas as Turmas: "  );
        //System.out.println(T1.getDisciplina());
        //System.out.println(T2.getDisciplina());



        //Instanciar pelo menos 1 objeto da classe Turma.
        //Turma T1 = new Turma("0202", "POO II", A1.getNome()+A1.getMatricula());
        //T1.AddAlunos(A1);
        //T1.imprimir();
        //Turma T2 = new Turma("0303", "Estrutura de Dados", A2.getNome());
        //T2.AddAlunos(A2);
        //T2.imprimir();


//PARTE CERTA ABAIXO
        //Imprimir uma lista com o nome de todos os Alunos que fazem parte de uma Turma.
        //Associar pelo menos 2 objetos da classe Aluno a um único objeto da classe Turma.

        System.out.println("_____________________________________________");
        //Imprimir uma lista com o nome de todos os Alunos que fazem parte de uma Turma.
        System.out.println("Alunos Associados a uma lista"  );
        Turma T1 = new Turma("0202", "POO II", A1.getNome()+A1.getMatricula());
        T1.AddAlunos(A1);
        T1.imprimir();

        Turma T2 = new Turma("0303", "Estrutura de Dados", A2.getNome()+A2.getMatricula());
        T2.AddAlunos(A2);
        T2.imprimir();

                }


                }*/