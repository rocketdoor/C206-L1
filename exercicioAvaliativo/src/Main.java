import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Empresa empresa = new Empresa();
        Scanner pedido = new Scanner(System.in);
        Scanner indice = new Scanner(System.in);
        int i = 0;
        int escolha;

        do
        {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Mostrar informações da Empresa");
            System.out.println("2 - Adicionar um funcionário");
            System.out.println("3 - Alocar um funcionário");
            System.out.println("4 - Mostrar o número de funcionários disponíveis");
            System.out.println("5 - Sair");

            escolha = pedido.nextInt();

            if (escolha == 1)
            {
                System.out.println("Aqui as informações da Empresa:");
                empresa.mostraInfo();
            }

            else if (escolha == 2) {
                System.out.println("Insira as informações pedidas");
                empresa.adicionarFuncionario(empresa.funcionarios[i]);
                i++;
            }

            else if (escolha == 3)
            {
                System.out.println("Qual o indice do funcionario a ser alocado?");
                int index = indice.nextInt();
                indice.nextLine();
                empresa.alocarFuncionarios(index);
            }

            else if (escolha == 4)
            {
                empresa.contarFuncionariosDisponiveis();
            }
        } while (escolha > 0 && escolha < 5);
    }
}