public class Piloto {

    // Atributos
    private String nome;
    private int cpf;
    private int numAc;

    public Piloto(String nome, int cpf, int numAc) {
        this.nome = nome;
        this.cpf = cpf;
        this.numAc = numAc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getNumAc() {
        return numAc;
    }

    public void setNumAc(int numAc) {
        this.numAc = numAc;
    }
}
