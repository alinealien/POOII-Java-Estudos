package unidadeIII;
/*
POLIMORFISMO: Capacidade de um objeto poder ser referenciado de varias formas

ASSINATURA DO METODO: Quantidade de parametros e tipos de parametros
(Caso a quantidade e tipos de parametros forem deferentes se diz que a assinatura do metodo é diferente)

TIPOS DE POLIMOSFIRMO:
Ad-hoc (Polimosfirmo de aparencia)
 I - Coersão: Permite que um argumento seja convertido para o tipo esperado por uma função, evitando erros de tipos.
II - Sobrecarga: Um mesmo metodo pode assumir várias formas dependendo da quantidade e do tipo do parametro
     Um metodo pode assumir varias formas desde que tenham assinaturas diferentes


Universal (Polimorfismo verdadeiro): Sobreposição , Inclusão e Paramétrico
 */


     //AULA DE CLASSES ABSTRATAS

    public abstract class Animal { private String tipo;

    public Animal(String tipo1) {
       tipo = new String(tipo1);
    }

    public void exibir(){  //Metodo
        System.out.println("Eu sou um: " + tipo);

    }

    //Metodo abstrato
   // public abstract void som();

    public void som(){  //Metodo
        System.out.println("Som do Animal");
        }
        }


/*

//INTERFACE
public interface  Animal {

    public void exibir();
    public  void som();


}

 */
