package Exercicio1;

import java.util.Scanner;

public class Estoque
{
    Produto[] produtos = new Produto[50];
    Scanner scanner = new Scanner(System.in);
    void adicionarEstoque(int i)
    {
        System.out.println("Insira as caracteristicas do produto");
        System.out.println("Nome:");
        produtos[i].nome = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Preco:");
        produtos[i].preco = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Fabricante:");
        produtos[i].fabricante = scanner.nextLine();
        System.out.println("Descricao:");
        produtos[i].descricao = scanner.nextLine();

    }
}
