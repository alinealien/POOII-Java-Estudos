package unidadeIII;

//AULAS CLASSES ABSTRATAS E AS DEMAIS
public class Pato extends Animal {

    private String nome;

    public Pato( String nome) {
        super("Pato");
        this.nome = nome;
    }

    @Override //Sobreescrita
    public void som () {
        System.out.println("QuaQua");
    }
}


/*
public class Pato implements Animal {
    private String nome;

    public void exibir(){
        System.out.println("Eu sou um Pato");
    }

    public void som(){
        System.out.println("QuaQua");
    }
}
 */