package poo;

import java.util.Scanner;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        //p1.nome = "Edson";
        p1.setNome("Edson");
        //p1.telefone = "15991555777";
        p1.setTelefone("15991555777");
        p1.idade = 30;
        var p2 = new Pessoa();
        //p2.nome = "Edu";
        p2.setNome("Edu");
        p1.perguntarONome(p2);
        p2.responderONome();
        
        
    }
}
