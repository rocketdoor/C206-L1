package CarroMotor;

public class Carro
{
    String cor;
    String marca;
    String modelo;
    double velocidadeMax;
    double velocidadeAtual;
    Motor motor = new Motor();


    void ligar()
    {
        System.out.println("O carro esta ligado");
        velocidadeAtual = 0D;
    }

    void acelerar()
    {
        System.out.println("O carro esta acelerando");
        velocidadeAtual = (velocidadeMax+velocidadeAtual)/2D;
        System.out.println("A velocidade atual é de: " + velocidadeAtual + "km/h");
    }

    void mostraInfo()
    {
        System.out.println(cor);
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(velocidadeAtual);
        System.out.println(velocidadeMax);
        System.out.println("O motor tem potencia de " + motor.potencia + " cavalos");
        System.out.println("O tipo do motor é: " + motor.tipo);
        System.out.println("\n");
    }
}
