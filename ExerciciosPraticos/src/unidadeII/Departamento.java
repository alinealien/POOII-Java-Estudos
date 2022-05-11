package unidadeII;

//ASSOCIAÇÃO A CLASSE FUNCIONARIO

//OBS:

public class Departamento {
    private String descricao;

    public Departamento(String descricao){
        this.descricao = descricao;
    }

    String Getdescricao(){
        return(this.descricao);
    }
    void Setdescricao(String descricao){
        this.descricao = descricao;
    }
}
