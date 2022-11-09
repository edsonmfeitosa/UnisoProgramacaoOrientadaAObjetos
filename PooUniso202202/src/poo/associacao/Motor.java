package poo.associacao;

public class Motor {
    private double fatorPotencia;
    private Automovel automovel;

    public Motor(Automovel auto) {
        this.fatorPotencia = 1000;
        this.automovel = auto;
    }

    public double getFatorPotencia() {
        return fatorPotencia;
    }

    public void setFatorPotencia(double fatorPotencia) {
        this.fatorPotencia = fatorPotencia;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }
    
}
