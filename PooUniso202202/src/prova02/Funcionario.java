package prova02;

public class Funcionario extends Pessoa {

    private int chapa;
    private double salario;

    public Funcionario() {
        Double num = Math.random() * 1000;
        this.chapa = num.intValue();
    }

    public int getChapa() {
        return chapa;
    }

    public void setChapa(int chapa) {
        this.chapa = chapa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }

    public void setBonificacao() {
        this.salario += this.salario + (this.salario * 0.1);
    }
    
}
