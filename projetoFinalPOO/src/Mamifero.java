public class Mamifero extends Vertebrado
{
    private int tempoGestacao;

    public Mamifero (String nomeCientifico, String nomePopular, double peso, double comprimento, double altura, int tempoGestacao)
    {
        super(nomeCientifico,nomePopular, peso, comprimento, altura);
        this.tempoGestacao = tempoGestacao;
    }

    public int getTempoGestacao() {
        return tempoGestacao;
    }

    public void setTempoGestacao(int tempoGestacao) {
        this.tempoGestacao = tempoGestacao;
    }
}
