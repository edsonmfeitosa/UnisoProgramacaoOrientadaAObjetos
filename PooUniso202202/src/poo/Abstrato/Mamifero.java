package poo.Abstrato;

public abstract class Mamifero extends Animal{

    @Override
    public abstract String mover();
    
    public String mamar(){
        return "leite";
    }
}
