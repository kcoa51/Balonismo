public class Pessoa {

    //Declaração de objetos

    private String nome;
    private int CPF;
    private int RG;
    private float Telefone;
    private float Telefone_cont;
    private String Endereco;
    public Pessoa(String nome, int CPF, int RG, float telefone, float telefone_cont, String endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        Telefone = telefone;
        Telefone_cont = telefone_cont;
        Endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public float getTelefone() {
        return Telefone;
    }

    public void setTelefone(float telefone) {
        Telefone = telefone;
    }

    public float getTelefone_cont() {
        return Telefone_cont;
    }

    public void setTelefone_cont(float telefone_cont) {
        Telefone_cont = telefone_cont;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereço(String endereco) {
        Endereco = endereco;
    }



    }

