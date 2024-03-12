package Exercicio2;

public class Empresa
{
    String nome;
    String endereco;
    Contato[] contatos = new Contato[50];

    void exibirInfos()
    {
        System.out.println("Nome da Empresa: " + nome);
        System.out.println("Endereço da Empresa: " + endereco);

        for (int i = 0; i < contatos.length; i++)
        {
            if (contatos[i] != null) {
                System.out.println("Nome: " + contatos[i].nome);
                System.out.println("E-mail: " + contatos[i].email);
                System.out.println("Data de Nascimento: " + contatos[i].dataNascimento);
                System.out.println("Telefone: " + contatos[i].telefone);
            }
        }
    }
}
