package unidadeII;

//ASSOCIAÇÃO A CLASSE FUNCIONARIO

//OBS:

import java.util.ArrayList;

public class Departamento {
    private String descricao;

    private ArrayList<Funcionario> funcionarios; //Atributo Funcionario que é um arraylist


    public Departamento(String descricao, String funcionario) { //Adcionou o atributo ao construtor
        this.descricao = descricao;
        this.funcionarios = new ArrayList<Funcionario>();

    }


    String Getdescricao() {
        return (this.descricao);
    }

    void Setdescricao(String descricao) {
        this.descricao = descricao;
    }

    void AddFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    String GetFuncionario() {
        String f = ""; //guarda o resultado
        for (int i = 0; i < this.funcionarios.size(); i++) {
            f = f + this.funcionarios.get(i).GetNome() + "\n"; //retorne o que esta na string do indice 0
        }
            return f;
        }

}
