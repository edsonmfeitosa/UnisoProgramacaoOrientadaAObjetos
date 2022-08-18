package fundamentos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author edson
 */
public class EntradaSaida {
    public static void main(String[] args) {
        //1ª forma
        /*
        Scanner entrada = new Scanner(System.in);
        
        entrada.close();
        */
        //2ª forma de entrada e saída
        String nome;
        int idade;
        JOptionPane.showMessageDialog(null, "Exemplo de mensagem");
        
        nome = JOptionPane.showInputDialog(null, "Qual o seu nome?");
        JOptionPane.showMessageDialog(null, "Seja bem vindo " + nome);
        
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade?"));
        JOptionPane.showMessageDialog(null, "A idade do(a) " +
                nome + " é " + idade, "Demonstração", 
                JOptionPane.INFORMATION_MESSAGE);
    }
}
