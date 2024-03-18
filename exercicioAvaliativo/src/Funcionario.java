public class Funcionario
{
    int matricula;
    boolean alocado = false;


    Pessoa pessoa = new Pessoa();

    void mostraInfo()
    {
        System.out.println("Matricula: " + this.matricula);
        System.out.print("Disponivel: ");
        if (this.alocado == false)
            System.out.print(" Sim" + "\n");
        else
          System.out.println(" Não" + "\n");

        pessoa.mostraInfo();
    }
}
