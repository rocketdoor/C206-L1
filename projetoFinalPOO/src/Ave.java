public class Ave extends Vertebrado
{
    private double envergadura;

    public Ave (String nomeCientifico, String nomePopular, double peso, double comprimento, double altura, double envergadura)
    {
        super(nomeCientifico,nomePopular, peso, comprimento, altura);
        this.envergadura = envergadura;
    }

    public double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }
}
