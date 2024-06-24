public class Vertebrado extends Animal
{
    private double altura;

    public Vertebrado(String nomeCientifico, String nomePopular, double peso, double comprimento, double altura)
    {
        super(nomeCientifico,nomePopular, peso, comprimento);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
