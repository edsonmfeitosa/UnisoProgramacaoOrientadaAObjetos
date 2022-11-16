package poo.Abstrato;


public class AulaAbstrato {
    public static void main(String[] args) {
        Cachorro cao = new Cachorro();
        System.out.println(cao.mamar());
        System.out.println(cao.respirar());
    }
    
}
