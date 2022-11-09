
package prova01;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String telefone;
    public ArrayList<Compra> compras = new ArrayList<>();

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public double totaldeGastos(){
        double total = 0;
        for (Compra compra : compras) {
            total += compra.obterValorTotal();
        }
        return total;
    }
    public String imprimir(){
        String impressao = "Cliente: "+ this.nome +
                "\nTelefone: "+this.telefone +
                "\nCompras:";
        for (Compra compra : compras) {
            impressao += "\n--Data: "+compra.getData();
            for (Item item : compra.getItens()) {
                impressao += "\n--Produto: "+item.getProduto().getNome()+
                        "\n--Preço: "+item.getProduto().getPreco();
            }
            impressao +="\nTotal da Compra: "+compra.obterValorTotal();
        }
        
        return impressao;
    }
    
}
