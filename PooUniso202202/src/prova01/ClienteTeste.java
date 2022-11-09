
package prova01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteTeste {
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("Edson", "123456");
        Produto p1 = new Produto();
        p1.setNome("notebook");
        p1.setPreco(3000.0);
        
        Produto p2 = new Produto();
        p2.setNome("caderno");
        p2.setPreco(10.0);
        
        Compra cp1 = new Compra();
        cp1.setData("01/01/2021");
        cp1.adicionarItem(1, p1);
        cp1.adicionarItem(4, p2);
        c1.compras.add(cp1);
        System.out.println(c1.imprimir());
        
        Produto p3 = new Produto();
        p3.setNome("régua");
        p3.setPreco(1.5);
        Produto p4 = new Produto();
        p4.setNome("caneta");
        p4.setPreco(3.0);
        
        Compra cp2 = new Compra();
        cp2.setData("02/02/2021");
        cp2.adicionarItem(1, p2);
        cp2.adicionarItem(2, p4);
        
        c1.compras.add(cp2);
        
        System.out.println(c1.imprimir());
        
        System.out.println("Total gasto pelo "+c1.getNome() + ": "+c1.totaldeGastos());
        
    }
}
