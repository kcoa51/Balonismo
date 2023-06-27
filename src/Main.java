public class Main {
    public static void main(String[] args) {
        // Construindo balões
        Balão b1 = new Balão();

        // Chamando o metodo voar()
        String resultado = b1.voar(new Combustivel());

        // Exibindo resultados do voo
        System.out.println(resultado);

        Balão b2 = new Balão(4,"lua","rosa" ,"redondo" ,43.50,8.00,"medio" , 2 );

    }
}