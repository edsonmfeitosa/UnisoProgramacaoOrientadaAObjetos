
package prova02;

public class ContaCorrente extends Conta{

    public ContaCorrente(double saldo, double limite, Cliente dono) {
        super(saldo, limite, dono);
    }

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

    @Override
    public void deposita(double valor) {
        super.deposita(valor - 0.1); 
    }

    
    
}
