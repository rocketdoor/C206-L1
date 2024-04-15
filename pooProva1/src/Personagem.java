public abstract class Personagem
{
    protected String nome;
    protected int vida;
    protected int energia;
    protected int poder;

    void usarHabilidade()
    {
        System.out.println("O personagem está usando uma habilidade");
        energia--;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
