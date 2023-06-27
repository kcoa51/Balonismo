public class Balão {
    // Atributos
    private int id;
    private String registro;
    private String cor;
    private String tipo;
    private double altura;
    private double peso;
    private String porte;
    int capacidadePessoa;

    public Balão(){}

    public Balão(int id, String registro, String cor, String tipo, double altura, double peso, String porte, int capacidadePessoa) {
        this.id = id;
        this.registro = registro;
        this.cor = cor;
        this.tipo = tipo;
        this.altura = altura;
        this.peso = peso;
        this.porte = porte;
        this.capacidadePessoa = capacidadePessoa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public int getCapacidadePessoa() {
        return capacidadePessoa;
    }

    public void setCapacidadePessoa(int capacidadePessoa) {
        this.capacidadePessoa = capacidadePessoa;
    }

    // metodos
    public String voar(Combustivel gasPropano) {
        return "voando com" + gasPropano;
    }
}
