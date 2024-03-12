package Exercicio1;

public class Carrinho
{
    double total;
    Produto[] produtos = new Produto[50];



    void exibirInfo()
    {
        for (int i = 0; i < produtos.length; i++)
        {
            if (produtos[i] != null)
            {
                System.out.println("Nome: " + produtos[i].nome);
                System.out.println("Fabricante: " + produtos[i].fabricante);
                System.out.println("Descrição: " + produtos[i].descricao);
                System.out.println("Preço: " + produtos[i].preco);
                System.out.println("Quantidade: " + produtos[i].qtd);
                System.out.println(" ");
            }
        }
    }

    double calculaTotal()
    {
        total = 0;

        for (int i = 0; i < produtos.length; i++)
        {
            if (produtos[i] != null)
            {
                total = total + (produtos[i].preco * produtos[i].qtd);
            }
        }

        return total;
    }
}
