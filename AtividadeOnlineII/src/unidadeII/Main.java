package unidadeII;

/*
Na classe Main:
ATIVIDADE UNIDADE II -

1. Instanciar pelo menos 2 objetos da classe Aluno.

2. Instanciar pelo menos 1 objeto da classe Turma.

3. Associar pelo menos 2 objetos da classe Aluno a um único objeto da classe Turma.

4. Imprimir uma lista com o nome de todos os Alunos que fazem parte de uma Turma. Dica: Implemente um método GetAlunos.
 */

/*
Na classe Main:

ATIVIDADE UNIDADE III -
    1. Instanciar pelo menos 2 objetos da classe Aluno. X
    2. Instanciar pelo menos 1 objeto da classe Professor.
    3. Criar um Array (ArrayList) do tipo Pessoa e alocar os 3 objetos instanciados (Alunos e Professor).
        3.1. Você deve usar o polimorfismo de inclusão
    4. Imprimir uma lista com os dados de todos os alunos e professores alocados no Array.
        4.1. Você deve percorrer todas as posições do Array e invocar o método imprimir.
 */

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Atividade Online II");
        System.out.println();

        System.out.println(" _ _ _ _ _ _ _ _ _ _ CADASTRO ALUNOS (LISTA)  _ _ _ _ _ _ _ _ _ _ ");
        System.out.println();

        //1. Instanciar pelo menos 2 objetos da classe Aluno.
        Alunos A1 = new Alunos("090909", 2018, "Computação", "Aline Antunes", "Areia Branca", "0909087654");

        Alunos A2 = new Alunos("090908", 2018, "Computação", "Sirius Black", "Areia Branca", "0909087655");

        Alunos A3 = new Alunos("090907", 2018, "Programação De Jogos", "Betty", "Areia Branca", "0909087653");

        Alunos A4 = new Alunos("090906", 2018, "Estrutura de Dados", "Veronica", "Areia Branca", "09090876877");

        Alunos A5 = new Alunos("090905", 2018, "Programação De Jogos", "Andromeda", "Areia Branca", "09090876896");


        A1.imprimir();
        System.out.println();
        A2.imprimir();
        System.out.println();
        A3.imprimir();
        System.out.println();
        A4.imprimir();
        System.out.println();
        A5.imprimir();


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


        System.out.println(" _ _ _ _ _ _ _ _ _ _ ALUNOS EM TURMAS _ _ _ _ _ _ _ _ _ _  ");
        System.out.println();

        //2. Instanciar pelo menos 1 objeto da classe Turma.
        turma1.AddAlunos(A1);
        turma1.AddAlunos(A2);
        turma1.imprimir();

        turma2.AddAlunos(A1);
        turma2.AddAlunos(A4);
        turma2.imprimir();

        turma3.AddAlunos(A3);
        turma3.AddAlunos(A5);
        turma3.imprimir();

        System.out.println(" _ _ _ _ _ _ _ _ _ _ PROFESSORES  _ _ _ _ _ _ _ _ _ _  ");
        System.out.println();

        Professor P1 = new Professor("Harry", "Alameda", "095874236854", 4587458, 456);

        Professor P2 = new Professor("MistyDay", "Castelo Branco", "09587428534712", 58585858, 485);

        Professor P3 = new Professor("Safira", "Alecrim", "095874854796314", 45878888, 488);


        P1.imprimir();
        System.out.println();
        P2.imprimir();
        System.out.println();
        P3.imprimir();
        System.out.println();

        turma1.AddProfessor(P1);
        turma2.AddProfessor(P2);
        turma3.AddProfessor(P3);


        System.out.println();

        System.out.println(" _ _ _ _ _ _ _ _ _ _ LISTA DE PESSOAS NA INSTITUIÇÃO  _ _ _ _ _ _ _ _ _ _  ");
        System.out.println();

        //Polimorfismo de inclusão
        Pessoa [] pess =  { A1, A2, A3, A4, A5};

        for(int i = 0; i < 3; i++){
            System.out.println("\n");
            pess[i].imprimir();

        }

        Professor [] prof  = {P1, P2, P3};

        for(int i = 0; i < 3; i++){
            System.out.println("\n");
            prof[i].imprimir();

        }




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