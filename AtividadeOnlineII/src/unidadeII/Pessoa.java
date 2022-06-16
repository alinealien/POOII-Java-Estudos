package unidadeII;

//Classe MÃE
//A classe Pessoa é uma generalização da classe Alunos.

import java.util.ArrayList;

    public class Pessoa {

    private String nome;
    private String endereco;
    private String cpf;


    public Pessoa(String nome, String endereco, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;



    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    void imprimir(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("CPF:" + this.getCpf());


    }


}
