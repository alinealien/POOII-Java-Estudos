package unidadeIII;


//AULAS CLASSES ABSTRATAS E AS DEMAIS
public class Gato extends Animal{

    private  String nome;

    public Gato(String nome) {
        super("Gato");
        this.nome = nome;
    }

    @Override //Sobreescrita
    public void som () {
        System.out.println("Miau");
    }
}


/*
public class Gato implements Animal{
    private  String nome;

    public void exibir(){
        System.out.println("Eu sou um Gato");
    }

    public void som(){
        System.out.println("Miau");
    }
 */