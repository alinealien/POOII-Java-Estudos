package unidadeII;

public class Gerente {
    private String sala;

    public Gerente(String sala) {
        this.sala = sala;
    }

    public String GetSala() {
        return sala;
    }

    public void SetSala(String sala) {
        this.sala = sala;
    }

    void imprimir(){
        //super.imprimir();
        System.out.println("Sala: " + this.sala);
    }
}
