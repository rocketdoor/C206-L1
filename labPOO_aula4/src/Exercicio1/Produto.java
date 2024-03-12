package Exercicio1;

public class Produto
{
    String nome;
    String descricao;
    String fabricante;
    double preco;
    int qtd;

    void mostraInfo()
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço: " + this.preco);
        System.out.println(" ");
    }


}
