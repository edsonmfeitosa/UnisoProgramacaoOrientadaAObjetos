
package prova02;

public class Conta implements ContaDeBanco{
    protected double saldo;
    private double limite;
    private Cliente titular;

    public Conta(double saldo, double limite, Cliente dono) {
        this.saldo = saldo;
        this.limite = limite;
        this.titular = dono;
    }
    
    
    
    public void deposita(double valor){
        saldo += valor;
    }
    public String sacar(double valor){
        if (this.saldo + this.limite < valor) {
            return "Valor indisponível";
        }
        else
            this.saldo -= valor;
            return "OK";
    }
    public String transferir(Conta conta, double valor){
        String saque = this.sacar(valor);
        if (saque.equals("OK")) {
            conta.deposita(valor);
        }
        return  saque;
    }

    public double getSaldo() {
        return saldo;
    }
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa;
    }
}
