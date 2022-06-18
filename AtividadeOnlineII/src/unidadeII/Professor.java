package unidadeII;

import java.util.ArrayList;

public class Professor extends Pessoa {

    private Integer titulacao;
    private Integer n_registro;

    private ArrayList<Turma> turma;


    public Professor(String nome, String endereco, String cpf, Integer titulacao, Integer n_registro) {
        super(nome, endereco, cpf);
        this.titulacao = titulacao;
        this.n_registro = n_registro;

        ArrayList<Turma> turma = new ArrayList<Turma>();
    }

    void GetTurma() {
        StringBuilder t = new StringBuilder(" ");
        for (int i = 0; i < this.turma.size(); i++) {
            t.append(this.turma.get(i).getDisciplina());
            System.out.println(this.turma.get(i).getDisciplina());

        }
    }

    public Integer getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = Integer.valueOf(titulacao);
    }

    public Integer getN_registro() {
        return n_registro;
    }

    public void setN_registro(Integer n_registro) {
        this.n_registro = n_registro;
    }

    @Override
        //Sobreescrever - Sobresescrevendo
    void imprimir() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("CPF:" + this.getCpf());
        System.out.println("Titulação:" + this.getTitulacao());
        System.out.println("Numero do Registro:" + getN_registro());

        //System.out.println("Turma :" + this.getDisciplina());

    }

}

