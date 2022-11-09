
package prova01;

import java.util.ArrayList;
import java.util.Date;

public class Compra {
    private String data;
    private ArrayList<Item> itens = new ArrayList<>();

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public double obterValorTotal(){
        double valor = 0;
        for (Item item : itens) {
            valor += item.getQuantidade() * item.getProduto().getPreco();
        }
        return valor;
    }
    public void adicionarItem(int quantidade, Produto produto){
        itens.add(new Item(quantidade, produto));
    }
    public ArrayList<Item> getItens(){
        return this.itens;
    }
    
}
