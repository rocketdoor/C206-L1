public class Jogo
{
    private String nome;
    private double preco;
    private String genero;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getPreco() {
        return String.valueOf(preco);
    }

    public double valor()
    {
        return preco;
    }

    public String getGenero() {
        return genero;
    }
}
