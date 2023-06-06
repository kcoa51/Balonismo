public class Balão {
    // Atributos
    int id;
    String registro;
    String cor;
    String tipo;
    double altura;
    double peso;
    String porte;
    int capacidadePessoa;

    // metodos
    public String voar(Combustivel gasPropano) {
        return "voando com" + gasPropano;
    }
}
