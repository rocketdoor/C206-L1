public class Guerreiro extends Personagem implements LutarComArmas
{
    private Arma arma;

    Guerreiro(String nome, int vida, int energia, int poder)
    {
        this.setNome(nome);
        this.setVida(vida);
        this.setEnergia(energia);
        this.setPoder(poder);
    }

    @Override
    public void atacar(Personagem personagem)
    {
        System.out.println(this.getNome() + " atacou " + personagem.getNome() + " usando a arma " + this.arma.getNome());
        System.out.println(personagem.getNome() + " tomou " + this.arma.getDano() + " de dano");
        personagem.setVida(personagem.getVida() - this.arma.getDano());
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}
