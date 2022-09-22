package fundamentos;

import java.util.ArrayList;
import java.util.List;
import poo.Fornecedor;
import poo.Pessoa;
import poo.Produto;

public class AulaLista {
    public static void main(String[] args) {
        //Array
        /*
        int[] numeros = new int[3];
        numeros[0] = 10;
        numeros[1] = 5;
        numeros[2] = 7;
        System.out.println(numeros[1]);
        numeros[0] = 11;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("For ---->"+
                    numeros[i]);
        }
        for (int numero : numeros) {
            System.out.println("Foreach ---->" +
                    numero);
        }
        int numeroChefe = 6;
        int[] numeros2 = new int[4];
        for (int i = 0; i < 3; i++) {
            numeros2[i] = numeros[i];
        }
        numeros2[3] = numeroChefe;
        
        Pessoa[] pessoas = new Pessoa[100];
        Pessoa p = new Pessoa();
        p.setNome("Edson");
        pessoas[0] = p;
        */
        
        //Lista
        /*
        //List<String> nomes = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();
        //adiciona objetos na lista
        nomes.add("Edson");
        nomes.add("Renata");
        nomes.add("Victor");
        nomes.add("Vinícius");
        System.out.println(nomes);
        //adiciona na posição definida
        nomes.add(2, "José");
        System.out.println(nomes);
        
        //verifica se tem o objeto
        if (nomes.contains("Vinícius")) {
            System.out.println("tem Vinícius na lista");
        }
        
        //get - retorna o obj da posição definida
        System.out.println("Posição 2: "+
                nomes.get(1));
        
        //retorna o índice do obj passado
        System.out.println("O Victor está na "+
                "posição "+ nomes.indexOf("Victor"));
        //remover o obj
        nomes.remove("José");
        System.out.println(nomes);
        
        //set - troca o obj pelo indice passado
        nomes.set(1, "Maria");
        System.out.println(nomes);
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("for--> "+nomes.get(i));
        }
        for (String nome : nomes) {
            System.out.println("foreach--> "+
                    nome);
        }
        nomes.clear();
        System.out.println(nomes);
        */
        Fornecedor f1 = new Fornecedor();
        f1.setNome("Bic");
        Produto p1 = new Produto("Caneta", 2, 0);
        //f1.produtos.add(p1);
        f1.setProduto(p1);
        Produto p2 = new Produto("lápis", 5, 0);
        //f1.produtos.add(p2);
        f1.setProduto(p2);
        for (Produto produto : f1.getProdutos()) {
            System.out.println(produto.getNome());
        }
        Fornecedor f2 = new Fornecedor();
        //f2.nome = "hp";
        f2.setNome("hp");
        Produto p3 = new Produto("notebook", 5300, 0);
        //f2.produtos.add(p3);
        f2.setProduto(p3);
        ArrayList<Fornecedor> fornecedores = new ArrayList<>();
        fornecedores.add(f1);
        fornecedores.add(f2);
        for (Fornecedor forn : fornecedores) {
            System.out.println("----Fornecedor: "+ 
                    forn.getNome()+ " ----");
            for (Produto p : forn.getProdutos()) {
                System.out.println("-----------Produto: "+
                        p.getNome());
            }
        }
        
    }
}
