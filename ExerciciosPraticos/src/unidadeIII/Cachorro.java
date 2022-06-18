package unidadeIII;

/*
POLIMORFISMO DE SOBREPOSIÇÃO || Sobre escrita de metodos
Acontece quando substituimos um metodo de uma superclasse na sua subclasse,
usando a mesma assinatura.

POLIMORFISMO DE INCLUSÃO
Um ponteiro que aponta para a classe mãe pode apontar para uma instância de uma classe filha


 */

//AULAS CLASSES ABSTRATAS E AS DEMAIS
public class Cachorro extends Animal {
    private String nome, raca;

    //Construtor de Animal
    public Cachorro(String nome1, String raca1) {
        super("Cachorro"); //superclasse
        this.nome = nome1;
        this.raca = raca1;

    }


    //Polimorfirmo de sobrecarga

    public void reagir(String frase) {
        if (frase.equals("Toma comida") || frase.equals("Ola")) {
            System.out.println("Abanar e Latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    //Polimorfirmo de sobrecarga
    public void reagir(Boolean  dono) {
        if (dono) {

            System.out.println("Abanar");
        } else{
            System.out.println("Rosnar e latir");
        }
    }

    @Override //Sobreescrita
    public void som () {
        System.out.println("AuAu");
    }
}

/*
public class Cachorro implements Animal{
    private String nome, raca;

    public void exibir(){
        System.out.println("Eu sou um Cachorro");
    }

    public void som(){
        System.out.println("Auau");
    }
}

 */