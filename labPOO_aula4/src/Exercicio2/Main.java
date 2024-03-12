package Exercicio2;

public class Main
{
    public static void main(String[] args)
    {
        Empresa empresa = new Empresa();

        Contato contato1 = new Contato();

        contato1.nome = "Kamden";
        contato1.email = "kamden@ampersandone.fnc";
        contato1.telefone = "+00(00)000-00000";
        contato1.dataNascimento = "2001. 06. 09";
        empresa.contatos[0] = contato1;


        Contato contato2 = new Contato();
        contato2.nome = "Mackiah";
        contato2.email = "mackiah@ampersandone.fnc";
        contato2.telefone = "+11(11)111-11111";
        contato2.dataNascimento = "2006. 01. 21";
        empresa.contatos[1] = contato2;

        Contato contato3 = new Contato();
        contato3.nome = "Kyrell";
        contato3.email = "kyrell@ampersandone.fnc";
        contato3.telefone = "+22(22)222-22222";
        contato3.dataNascimento = "2005. 07. 03";
        empresa.contatos[2] = contato3;

        Contato contato4 = new Contato();
        contato4.nome = "Brian";
        contato4.email = "brian@ampersandone.fnc";
        contato4.telefone = "+33(33)333-33333";
        contato4.dataNascimento = "2002. 08. 27";
        empresa.contatos[3] = contato4;

        empresa.nome = "FNC Entertainment";
        empresa.endereco = "Dosan-daero-85-gil Gangnam-gu Seoul";
        empresa.exibirInfos();
    }
}
