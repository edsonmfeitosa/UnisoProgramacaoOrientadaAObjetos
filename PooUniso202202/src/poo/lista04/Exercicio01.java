package poo.lista04;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);
        Pessoa p = new Pessoa();
        while(opcao != 3){
            System.out.println("Menu:");
            System.out.println("1 – Criar pessoa");
            System.out.println("2 – Mostrar pessoa");
            System.out.println("3 – Sair");
            opcao = Integer.parseInt(teclado.nextLine());
            switch (opcao) {
                case 1:
                    //criar pessoa
                    System.out.println("Digite o nome");
                    p.setNome(teclado.nextLine());
                    System.out.println("Digite o CPF");
                    p.setCpf(teclado.nextLine());
                    System.out.println("Digite o sexo");
                    p.setSexo(teclado.nextLine().charAt(0));
                    System.out.println("Digite a idade");
                    p.setIdade(Integer.parseInt(teclado.nextLine()));
                    break;
                case 2:
                    //mostrar pessoa
                    System.out.println(p.imprimir());
                    break;
                case 3:
                    System.out.println("O programa será fechado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        teclado.close();
    }
}
