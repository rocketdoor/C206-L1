public class Artrópode extends Animal
{
    private int nPernas;
    private int nSegmentos;


    public Artrópode (String nomeCientifico, String nomePopular, double peso, double comprimento, int nPernas, int nSegmentos)
    {
        super(nomeCientifico,nomePopular, peso, comprimento);
        this.nPernas = nPernas;
        this.nSegmentos = nSegmentos;
    }

    public int getnPernas() {
        return nPernas;
    }

    public int getnSegmentos() {
        return nSegmentos;
    }

    public void setnPernas(int nPernas) {
        this.nPernas = nPernas;
    }

    public void setnSegmentos(int nSegmentos) {
        this.nSegmentos = nSegmentos;
    }
}
