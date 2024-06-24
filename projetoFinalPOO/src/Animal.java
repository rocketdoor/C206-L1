public abstract class Animal
{
    private double peso;
    private double comprimento;
    private String nomeCientifico;
    private String nomePopular;

    public Animal()
    {

    }
    public Animal(String nomeCientifico, String nomePopular, double peso, double comprimento)
    {
        this.nomeCientifico = nomeCientifico;
        this.nomePopular = nomePopular;
        this.peso = peso;
        this.comprimento = comprimento;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getNomePopular() {
        return nomePopular;
    }

    public void setNomePopular(String nomePopular) {
        this.nomePopular = nomePopular;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
}
