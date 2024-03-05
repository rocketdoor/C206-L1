package Produto;

public class Produto
{
    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;

    void mostraInfo()
    {
        System.out.println(codigoSerie);
        System.out.println(codigoProduto);
        System.out.println(nome);
        System.out.println(categoria);
        System.out.println(quantidade);
        System.out.println("\n");
    }
}
