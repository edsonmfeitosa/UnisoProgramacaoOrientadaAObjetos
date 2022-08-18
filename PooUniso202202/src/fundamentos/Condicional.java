package fundamentos;

import java.util.Scanner;

/**
 *
 * @author edson
 */
public class Condicional {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int numero;
        //Condicional Se
        // Se simples
        System.out.println("Digite seu nome:");
        nome = teclado.nextLine();
        System.out.println("Digite um número:");
        numero = teclado.nextInt();
        
        if (nome.toLowerCase().contains("eds")) {
            System.out.println("O nome começa com as letrad eds");
        }
        
        // Condicional Se composto
        if (numero == 10) {
            System.out.println("O número é igual a 10");
        }
        else{
            System.out.println("O número é diferente de 10");
        }
        
        //condicional Se encadeado
        if (numero == 10) {
            System.out.println("10");
        }
        else if (numero == 15) {
            System.out.println("15");
        }
        else if (numero > 20) {
            System.out.println("maior que 20");
        }
        else{
            System.out.println("não definido");
        }
        
        // Condicional switch
        switch (numero) {
            case 10:
                System.out.println("igual a 10");
                break;
            case 15:
                System.out.println("igual a 15");
                break;
            default:
                System.out.println("não definido");
        }
        System.out.printf("O nome digitado foi %s. O número foi %d", nome, numero);
        
        teclado.close();
    }
}
