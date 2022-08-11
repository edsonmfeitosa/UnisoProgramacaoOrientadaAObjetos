package fundamentos;

import java.util.Scanner;

/**
 *
 * @author edson
 */
public class Wrappers {
    public static void main(String[] args) {
        String nome = "Edson";
        Integer x = 10;
        nome.length();
        System.out.println("O nome " + nome + " tem " + nome.length() +
                " caracteres");
        
        String n = "10";
        x = Integer.parseInt(n);
        
        n = Integer.toString(x);
        
        System.out.println(Math.pow(2, 3));
        
        //1º Exemplo de entrada de valor
        Scanner teclado = new Scanner(System.in);
        String name;
        int idade;
        System.out.println("Digite o seu nome");
        name = teclado.nextLine();
        System.out.println("Digite a idade");
        idade = Integer.parseInt(teclado.nextLine());
        System.out.println("Nome: "+ name +
                " Idade: "+ idade);
        
        teclado.close();
    }
}
