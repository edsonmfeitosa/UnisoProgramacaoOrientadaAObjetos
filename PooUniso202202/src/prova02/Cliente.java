package prova02;

import java.util.ArrayList;

public class Cliente extends Pessoa{
    private ArrayList<Conta> contas = new ArrayList<>();
    
    public ArrayList<Conta> getContas() {
        return contas;
    }
    
    public void setConta(Conta conta){
        contas.add(conta);
    }

    public void cadastraConta(double saldo, double limite){
        Conta conta = new Conta(saldo, limite, this);
        this.setConta(conta);
    }
}
