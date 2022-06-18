package unidadeIII;

/*
CLASSES ABSTRATAS

- NÃO CONSEGUIMOS INSTANCIAR OS OBJETOS DESSA CLASSA, POIS ELAS SÃO ABSTRATAS
- PALAVRA CHAVE: ABSTRATC NO JAVA VAI INDICAR QUE UM METODO NÃO PODE SER ESPECIFICADO NESSA CLASSE
- UMA CLASSE COM UM OU MAIS METODOS ABSTRATOS DEVE SER DECLARADA COMO ABSTRATA (NÃO TEM CODIGO DENTRO)

NAS CLASSES ABSTRATAS
- AS CLASSES ABSTRATAS PODEM TER DADOS E METODOS CONCRETOS
- UM METODO ABSTRATO PROMETE QUE TODOS OS DESCEDENTES, NÃO ABSTRATOS, DESSA CLASSE ABSTRATA IRÃO IMPLEMENTAR ESSE METODOS ABSTRATO
- NÃO SE PODE CRIAR OBJETOS A PARTIR DE CLASSES ABSTRATAS
  EX:
  Menssagem msg = new Mensagem(); NÃO PODE!
 */

public class Main {

    public static void main(String[] args){

        System.out.println("---------- TIPOS DE POLIMORFISMO --------------");
        System.out.println();

        Cachorro c1 = new Cachorro("Sirius", "SRC");
        c1.exibir();
        c1.som();
        System.out.println();

        Gato g1 = new Gato("Gatinho");
        g1.exibir();
        g1.som();
        System.out.println();

        Pato p1 = new Pato("Patolino");
        p1.exibir();
        p1.som();
        System.out.println( );

        System.out.println("---------- POLIMORFISMO DE INCLUSÃO --------------");
        System.out.println();
        //Ponteiro que aponta para a classe mãe
        Animal [] bichos = {c1, g1, p1};
        for(int i  = 0; i < 3; i++){
            System.out.println("\n");
            bichos[i].exibir();
            bichos[i].som(); //polimorfismo de sobreposição

        }

    }
}
