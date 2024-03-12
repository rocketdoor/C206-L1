package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int aux = 0;
        int escolha;
        int quantidade;
        int continuar = 1;
        Produto[] produtoAux = new Produto[50];

        Estoque estoque = new Estoque();

        System.out.println("Boas vindas ao KShop! O que deseja realizar?");
        System.out.println("Modificar estoque: 1");
        System.out.println("Comprar: 2");
        System.out.println("Sair: 3");

        int login = scanner.nextInt();

        while (login == 1)
        {
            estoque.adicionarEstoque(i);

            i++;

            System.out.println("Deseja continuar? Se sim, digite 1");
            System.out.println("Caso contrário, digite 2 para ir para a compra ou 3 para sair");
            login = scanner.nextInt();
            while (login > 3 || login < 0)
            {
                System.out.println("Digite um valor válido");
                System.out.println("1 para continuar, 2 para compra, 3 para sair");
                login = scanner.nextInt();
            }
        }

        while (login == 2)
        {
            Carrinho carrinho = new Carrinho();

            System.out.println("O que deseja comprar?");
            for (i = 0; i < estoque.produtos.length; i++)
            {
                if (estoque.produtos[i] != null)
                {
                System.out.print(estoque.produtos[i].nome + " $");
                System.out.print(estoque.produtos[i].preco);
                System.out.println(" ID: " + i);
                }
            }

            while(continuar == 1)
            {
                escolha = scanner.nextInt();

                carrinho.produtos[aux] = estoque.produtos[escolha];

                System.out.println("Quantos deseja comprar?");
                quantidade = scanner.nextInt();

                carrinho.produtos[aux].qtd = quantidade;

                aux++;

                System.out.println("Deseja continuar?");
                System.out.println("Sim - 1");
                System.out.println("Não - 2");

                continuar = scanner.nextInt();
            }

            double total = carrinho.calculaTotal();

            System.out.println("Seu total foi: $" + total);

            System.out.println("Deseja pagar e sair? Se sim, digite 3");
            System.out.println("Caso contrário, digite 1 para ir ao estoque e 2 para recomeçar a compra");

            while (login > 3 || login < 0)
            {
                System.out.println("Digite um valor válido");
                System.out.println("1 para estoque, 2 para recomeçar a compra, 3 para sair");
                login = scanner.nextInt();
            }

            login = scanner.nextInt();
        }

    }
}