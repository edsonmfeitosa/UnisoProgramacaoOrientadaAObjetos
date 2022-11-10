package poo.heranca;

import java.util.ArrayList;
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
        
        Automovel a3 = new Ferrari();
        //todos os objetos são Automóveis, logo consigo colocar
        //todos em um ArrayList de automóveis
        ArrayList<Automovel> carros = new ArrayList<>();
        carros.add(auto1);
        carros.add(on);
        carros.add(f);
        carros.add(f2);
        carros.add(a3);
        for (Automovel carro : carros) {
            System.out.println("Cor ----->" +carro.getCor());
        }

    }
}
