public class Main {
    public static void main(String[] args) {
        // Construindo balões
        Balão b1 = new Balão();

        Balão b2 = new Balão(4,"lua","rosa" ,"redondo" ,43.50,8.00,"medio" , 2 );
        Balão b3 = new Balão(2,"rio","roxo","quadrado",55.30,10.0,"grande",4);

        // Construindo pessoa
        Pessoa p1 = new Pessoa("Karen",97612365,795435,1197635521,21922219,"Rua Noel Rosa ");
        Pessoa p2 = new Pessoa("Lira",965364789,867849,31985919,41934332,"Rua Tom Jobim");

        // Construindo piloto
        Piloto pi1= new Piloto("Joaquim",421876456, 5432);
        Piloto pi2= new Piloto("Anderson",853213987, 2106);
    }

}