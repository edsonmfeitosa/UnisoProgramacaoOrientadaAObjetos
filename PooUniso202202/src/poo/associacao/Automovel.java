package poo.associacao;

public abstract class Automovel {
   //private String modelo;
   private String cor;
   protected int ano;
   private Motor motor;
   Pessoa dono;

   public Automovel(){
       this.motor = new Motor(this);
   }
   
    public Automovel(String cor, int ano) {
        //this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.motor = new Motor(this);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
/*
    public int getAno() {
        return ano;
    }
*/
    public void setAno(int ano) {
        this.ano = ano;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
   public void acelerar(){
       this.motor.setFatorPotencia(
               motor.getFatorPotencia() + 10
       );
   }
   public void frear(){
       double velocidade = motor.getFatorPotencia();
       if (velocidade > 0) {
           this.motor.setFatorPotencia(
               motor.getFatorPotencia() - 1
            );
       }
       
   }
}
