package CarroMotor;

public class Main
{
    public static void main(String[] args)
    {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.cor = "Vermelho";
        carro1.marca = "Subaru";
        carro1.modelo = "2002 Impreza";
        carro1.velocidadeMax = 350D;
        carro1.motor.tipo = "Motor V2";
        carro1.motor.potencia = 227;

        carro2.cor = "Azul";
        carro2.marca = "Williams";
        carro2.modelo = "2001 FW23";
        carro2.velocidadeMax = 600D;
        carro2.motor.tipo = "Motor V6";
        carro2.motor.potencia = 780;

        carro1.mostraInfo();
        carro2.mostraInfo();

        carro1.ligar();
        carro1.acelerar();

        carro2.ligar();
        carro2.acelerar();
        carro2.acelerar();
    }
}
