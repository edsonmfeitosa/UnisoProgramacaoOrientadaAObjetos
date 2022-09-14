package poo;

/**
 *
 * @author edson
 */
public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc c1 = new AreaCirc( 10);
        System.out.println("resultado: "+c1.calcular());
        AreaCirc c2 = new AreaCirc();
        //c2.setPi(3.14);
        //AreaCirc.pi = 3.14;
        c2.setRaio(15);
        System.out.println("resultado2: "+c2.calcular());
        System.out.println("resultado static: "+ AreaCirc.calcular(50.0));
        System.out.println(Math.PI);
        System.out.println(AreaCirc.pi);

    }
}