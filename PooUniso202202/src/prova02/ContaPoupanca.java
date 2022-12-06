package prova02;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(double saldo, double limite, Cliente dono) {
        super(saldo, limite, dono);
    }

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3; 
    }
    
}
