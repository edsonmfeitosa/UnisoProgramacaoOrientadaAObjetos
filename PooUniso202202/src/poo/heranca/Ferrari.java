package poo.heranca;

import poo.associacao.Automovel;

public class Ferrari extends Automovel implements Esportivo, Luxo{
    private int codigoFerrari;
    
    public Ferrari(String cor, int ano) {
        super(cor, ano);
    }

    public Ferrari() {
        this("", 0);
    }

    public int getCodigoFerrari() {
        return codigoFerrari;
    }

    public void setCodigoFerrari(int codigoFerrari) {
        this.codigoFerrari = codigoFerrari;
    }
    
    
    @Override
    public void acelerar() {
        super.acelerar(); 
        super.acelerar();
        super.acelerar();
    }

    @Override
    public String toString() {
        return "A cor da ferrari é " +getCor();
    }

    @Override
    public String ligarTurbo() {
        return "turbo ligado";
    }

    @Override
    public String desligarTurbo() {
        return "turbo desligado";
    }

    @Override
    public String ligarArCondicionado() {
        return "ar ligado";
    }

    @Override
    public String desligarArCondicionado() {
        return "ar desligado";
    }
    
    
}
