package poo.heranca;

import poo.associacao.Automovel;

public class Onix extends Automovel implements Luxo{

    public Onix() {
        
    }

    @Override
    public String toString() {
        return "Ano do Onix: "+ ano;
    }

    @Override
    public String ligarArCondicionado() {
        return "ligado";
    }

    @Override
    public String desligarArCondicionado() {
        return "desligado";
    }
    
    
}
