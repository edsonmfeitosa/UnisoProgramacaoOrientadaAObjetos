package fundamentos;

/**
 *
 * @author edson
 */
public class Repeticao {
    public static void main(String[] args) {
        //While
        int cont = 0;
        while (cont < 10) {   
            if (cont == 7) {
                break;
            }
            cont ++;
            if (cont == 5)
                continue;
            System.out.println(cont);
        }
        //Do...while
        cont = 1;
        do{
            System.out.println("Exemplo do..,while: " + cont);
            cont++;
        }while (cont <= 10);            

        //For
        for (int i = 0; i < 10; i++) {
            System.out.println("exemplo for: "+i);
        }
    }
}
