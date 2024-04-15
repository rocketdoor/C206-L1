public class Mago extends Personagem
{
    Mago(String nome, int vida, int energia, int poder)
    {
        this.setNome(nome);
        this.setVida(vida);
        this.setEnergia(energia);
        this.setPoder(poder);
    }

    @Override
    void usarHabilidade()
    {
        System.out.println("O mago está castando uma habilidade");
        this.energia--;
    }
}
