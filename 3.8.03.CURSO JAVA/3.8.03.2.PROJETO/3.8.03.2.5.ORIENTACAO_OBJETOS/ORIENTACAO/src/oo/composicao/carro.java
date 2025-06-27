package oo.composicao;

public class carro {
    Motor motor = new Motor();

    void acelerar (){
        motor.fatorInjecao += 0.4;
    }

    void frear(){
        motor.fatorInjecao -= 0.4;
    }
}
