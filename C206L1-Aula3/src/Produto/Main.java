package Produto;

public class Main {
    public static void main(String[] args)
    {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.codigoSerie = 541;
        produto1.codigoProduto = "QQ3321556";
        produto1.nome = "Wafer de Chocolate";
        produto1.categoria = "Comida";
        produto1.quantidade = 2500;

        produto2.codigoSerie = 9761;
        produto2.codigoProduto = "DKA697A1";
        produto2.nome = "Suco de Maracujá";
        produto2.categoria = "Bebida";
        produto2.quantidade = 843;

        // nota mental: não programar com fome

        produto1.mostraInfo();
        produto2.mostraInfo();
    }
}