import javax.swing.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        InputStream fluxoEntrada = null;
        InputStreamReader leitorFluxoEntrada = null;
        BufferedReader bufferEntrada = null;
        String linha = null;

        OutputStream fluxoSaida = null;
        OutputStreamWriter geradorFluxoSaida = null;
        BufferedWriter bufferSaida = null;

        Scanner sc = new Scanner(System.in);

        ArrayList<Jogo> lista = new ArrayList<>();
        Jogo jogo = new Jogo();

        ArrayList<Jogo> lista2 = new ArrayList<>();

        String nome;
        double preco;
        String genero;

        while(JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Continuar?", JOptionPane.YES_NO_OPTION) != JOptionPane.NO_OPTION){

            nome = sc.nextLine();
            jogo.setNome(nome);
            try
            {
                preco = sc.nextDouble();
                sc.nextLine();
                jogo.setPreco(preco);
                if (preco <= 0)
                    throw new PrecoNegativoException("Erro");
            }catch(PrecoNegativoException e)
            {
                System.err.printf("O preço deve ser positivo!" + "\n", e);
                break;
            }
            genero = sc.nextLine();
            jogo.setGenero(genero);

            lista.add(jogo);
        }
            for (Jogo jogos:lista)
            {
                try
                {
                    fluxoSaida = new FileOutputStream("C:\\Users\\romul\\IdeaProjects\\prova2labPOO\\saidaDados.txt");
                    geradorFluxoSaida = new OutputStreamWriter(fluxoSaida);
                    bufferSaida = new BufferedWriter(geradorFluxoSaida);
                    bufferSaida.write(jogos.getNome());
                    bufferSaida.newLine();
                    bufferSaida.write(jogos.getPreco());
                    bufferSaida.newLine();
                    bufferSaida.write(jogos.getGenero());
                    bufferSaida.newLine();
                }
                catch (FileNotFoundException e)
                {
                    System.err.printf("FileNotFoundException: %s.%n", e);
                }
                catch (IOException e) {
                    System.err.printf("IOException: %s.%n", e);
                }
                finally {
                    try
                    {
                        bufferSaida.close();

                    }
                    catch (IOException e) {
                        System.err.printf("IOException: %s.%n", e);
                    }
                }
            }

            try
            {
                fluxoEntrada = new FileInputStream("C:\\Users\\romul\\IdeaProjects\\prova2labPOO\\saidaDados.txt");
                leitorFluxoEntrada = new InputStreamReader(fluxoEntrada);
                bufferEntrada = new BufferedReader(leitorFluxoEntrada);
                linha = bufferEntrada.readLine();
                while(linha != null)
                {
                    jogo.setNome(linha);
                    linha = bufferEntrada.readLine();
                    preco = Double.parseDouble(linha);
                    jogo.setPreco(preco);
                    linha = bufferEntrada.readLine();
                    jogo.setGenero(linha);
                    linha = bufferEntrada.readLine();
                    lista2.add(jogo);
                }

                for (Jogo jogos : lista2)
                {
                    System.out.println(jogos.getNome());
                    System.out.println(jogos.getPreco());
                    System.out.println(jogos.getGenero());
                }

            }
            catch (FileNotFoundException e)
            {
                System.err.printf("FileNotFoundException: %s.%n", e);
            }
            catch (IOException e) {
                System.err.printf("IOException: %s.%n", e);
            }
            finally {
                try
                {
                    bufferEntrada.close();

                }
                catch (IOException e) {
                    System.err.printf("IOException: %s.%n", e);
                }
            }


    }
}