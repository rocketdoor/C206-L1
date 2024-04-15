public class Main {
    public static void main(String[] args)
    {
        Personagem personagens[] = new Personagem[50];
        Arma arma1 = new Arma("Adaga", 50);
        Arma arma2 = new Arma("Espada", 30);

        personagens[0] = new Assassino("Riki", 150, 20, 60);
        personagens[1] = new Mago("Zhongli", 120, 60, 35);
        personagens[2] = new Guerreiro("Orion", 250, 15, 45);

        ((Assassino) personagens[0]).setArma(arma1);
        ((Guerreiro) personagens[2]).setArma(arma2);

        ((Assassino) personagens[0]).atacar(personagens[1]);
        ((Guerreiro) personagens[2]).atacar(personagens[0]);

        System.out.println(personagens[1].getVida());
        System.out.println(personagens[0].getVida());

        personagens[0].usarHabilidade();
        personagens[1].usarHabilidade();
        personagens[2].usarHabilidade();
    }
}