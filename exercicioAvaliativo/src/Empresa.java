import java.util.Scanner;

public class Empresa
{
    String nome;
    String cnpj;
    String endereco;
    int funcionariosDisponiveis = 0;
    Funcionario[] funcionarios = new Funcionario[50];
    int i = 0;
    Scanner in = new Scanner(System.in);
    float total;

    void mostraInfo()
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Endereço: " + this.endereco);
    }

    void adicionarFuncionario(Funcionario funcionario)
    {
        funcionarios[i] = new Funcionario();

        System.out.println("Insira a matricula deste funcionario");
        funcionarios[i].matricula = in.nextInt();
        in.nextLine();

        System.out.println("Insira o CPF deste funcionario");
        funcionarios[i].pessoa.cpf = in.nextLine();

        System.out.println("Insira o nome deste funcionario");
        funcionarios[i].pessoa.nome = in.nextLine();

        System.out.println("Insira a idade deste funcionario");
        funcionarios[i].pessoa.idade = in.nextInt();
        in.nextLine();
    }

    void alocarFuncionarios(int index)
    {
        funcionarios[index].alocado = true;
        System.out.println("Este funcionario foi alocado!");
    }

    float contarFuncionariosDisponiveis()
    {
        for (int aux = 0; aux < funcionarios.length; aux++)
        {
            if(funcionarios[aux] != null)
                if (funcionarios[aux].alocado != true)
                    funcionariosDisponiveis++;
        }

        total = (funcionariosDisponiveis/funcionarios.length) * 100F;

        System.out.println(total + "% dos funcionarios estao disponiveis");

        return total;
    }
}
