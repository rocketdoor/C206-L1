public class Pessoa
{
    String nome;
    String cpf;
    int idade;

    void mostraInfo()
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
    }
}
