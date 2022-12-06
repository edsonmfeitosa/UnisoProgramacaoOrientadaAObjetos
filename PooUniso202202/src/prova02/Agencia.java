
package uniso.prova02;

import java.util.ArrayList;

public class Agencia {
    private String nome;
    private String endereco;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void cadastrarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }
    public void cadatrarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    public double valorTotalAgencia(){
        double total = 0;
        for (Cliente cliente : clientes) {
            for (Conta conta : cliente.getContas()) {
                total += conta.getSaldo();
            }
        }
        return  total;
    }
}
