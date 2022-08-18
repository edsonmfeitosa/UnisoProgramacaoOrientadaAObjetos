package fundamentos;

/**
 *
 * @author edson
 */
public class Operadores {
    public static void main(String[] args) {
        //exemplo de operadores relacionas
        System.out.println(2 >= 2);
        
        int x = 0;
        //somar valor nessa variável
        //exemplo de operadores de atribuição
        x = x + 2;
        x += 2;
        //tipos de operadores de atribuição
        //unário
        System.out.println(x ++);
        System.out.println(++ x);
        
        //binário
        x = 4;
        String texto;
        
        //terciário
        texto = x == 3 ? "Valor igual a 3" : 
                         "Valor diferente";
        System.out.println(texto);
        
        
        
    }
}
