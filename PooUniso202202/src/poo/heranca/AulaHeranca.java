package poo.heranca;

import poo.associacao.Automovel;

public class AulaHeranca {

    public static void main(String[] args) {
        Automovel auto1 = new Automovel(
                "azul", 2020);
        System.out.println("Velocidade do auto: "
                + auto1.getMotor().getFatorPotencia());

        Onix on = new Onix();
        System.out.println("Velocidade do Onix: "
                + on.getMotor().getFatorPotencia());

        Ferrari f = new Ferrari();
        System.out.println("Velocidade do ferrari: "
                + on.getMotor().getFatorPotencia());
        f.setCor("vermelha");
        on.acelerar();
        on.acelerar();
        f.acelerar();
        System.out.println("Velocidade do Onix: "
                + on.getMotor().getFatorPotencia());
        System.out.println("Velocidade do ferrari: "
                + f.getMotor().getFatorPotencia());
        System.out.println(f.toString());
        Ferrari f2 = new Ferrari("preto", 2022);

    }
}
