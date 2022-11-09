package poo.heranca;

import poo.associacao.Automovel;

public class Ferrari extends Automovel {
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
    
    
}
