import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        List<Animal> listaAnimais = new ArrayList<Animal>();
        Mamifero ursoPardo = new Mamifero("Ursus arctos", "Urso Pardo", 500, 2.5, 2, 12);
        int opcoes;

        listaAnimais.add(ursoPardo);

        for(Animal animal : listaAnimais)
        {
            System.out.println(animal.getNomeCientifico());
        }

        // adicionar novo animal
        int escolha;
        String nC;
        String nP;
        double weight;
        double length;
        double height;
        int tG;
        double span;
        int nLegs;
        int nSegms;

        do{
            System.out.println("1 - Adicionar");
            System.out.println("2 - Ler");
            System.out.println("3 - Modificar");
            System.out.println("4 - Deletar");
            opcoes = input.nextInt();
            input.nextLine();
            if(opcoes == 1)
            {
                do {
                    System.out.println("1 - Mamifero");
                    System.out.println("2 - Ave");
                    System.out.println("3 - Artropode");
                    escolha = input.nextInt();
                    input.nextLine();
                    if (escolha == 1) // mamifero
                    {
                        System.out.println("Insira o Nome Cientifico");
                        nC = input.nextLine();
                        System.out.println("Insira o Nome Popular");
                        nP = input.nextLine();
                        System.out.println("Insira o Peso");
                        weight = input.nextDouble();
                        System.out.println("Insira o Comprimento");
                        length = input.nextDouble();
                        System.out.println("Insira a Altura");
                        height = input.nextDouble();
                        System.out.println("Insira o Tempo Gestacional");
                        tG = input.nextInt();
                        input.nextLine();
                        Mamifero mam = new Mamifero(nC, nP, weight, length, height, tG);
                        listaAnimais.add(mam);
                    } else if (escolha == 2) // ave
                    {
                        System.out.println("Insira o Nome Cientifico");
                        nC = input.nextLine();
                        System.out.println("Insira o Nome Popular");
                        nP = input.nextLine();
                        System.out.println("Insira o Peso");
                        weight = input.nextDouble();
                        System.out.println("Insira o Comprimento");
                        length = input.nextDouble();
                        System.out.println("Insira a Altura");
                        height = input.nextDouble();
                        System.out.println("Insira a Envergadura");
                        span = input.nextDouble();
                        Ave ave = new Ave(nC, nP, weight, length, height, span);
                        listaAnimais.add(ave);
                    } else if (escolha == 3) // artropode
                    {
                        System.out.println("Insira o Nome Cientifico");
                        nC = input.nextLine();
                        System.out.println("Insira o Nome Popular");
                        nP = input.nextLine();
                        System.out.println("Insira o Peso");
                        weight = input.nextDouble();
                        System.out.println("Insira o Comprimento");
                        length = input.nextDouble();
                        System.out.println("Insira o Numero de Pernas");
                        nLegs = input.nextInt();
                        input.nextLine();
                        System.out.println("Insira o Numero de Segmentos");
                        nSegms = input.nextInt();
                        input.nextLine();
                        Artrópode art = new Artrópode(nC, nP, weight, length, nLegs, nSegms);
                        listaAnimais.add(art);
                    }
                } while (escolha == 1 || escolha == 2 || escolha == 3);
            }

            else if (opcoes == 2)
            {
                System.out.println("1 - Buscar um animal em especifico a partir do nome cientifico");
                System.out.println("2 - Mostrar todos os animais");

                escolha = input.nextInt();
                input.nextLine();
                if (escolha == 1) // buscar
                {
                    String busca = input.nextLine();
                    for (Animal animal : listaAnimais) {
                        if (animal.getNomeCientifico() == busca) {
                            System.out.println("Nome Cientifico: " + animal.getNomeCientifico());
                            System.out.println("Nome Popular: " + animal.getNomePopular());
                            System.out.println("Peso: " + animal.getPeso());
                            System.out.println("Comprimento: " + animal.getComprimento());
                            if (animal instanceof Mamifero) {
                                System.out.println("Altura: " + ((Mamifero) (animal)).getAltura());
                                System.out.println("Tempo Gestacional: " + ((Mamifero) (animal)).getTempoGestacao());
                            } else if (animal instanceof Ave) {
                                System.out.println("Altura: " + ((Ave) (animal)).getAltura());
                                System.out.println("Tempo Gestacional: " + ((Ave) (animal)).getEnvergadura());
                            } else if (animal instanceof Artrópode) {
                                System.out.println("Número de Pernas: " + ((Artrópode) (animal)).getnPernas());
                                System.out.println("Número de Segmentos: " + ((Artrópode) (animal)).getnSegmentos());
                            }
                        }
                    }
                } else if (escolha == 2) // mostrar todos
                {
                    for (Animal animal : listaAnimais) {
                        System.out.println("Nome Cientifico: " + animal.getNomeCientifico());
                        System.out.println("Nome Popular: " + animal.getNomePopular());
                        System.out.println("Peso: " + animal.getPeso());
                        System.out.println("Comprimento: " + animal.getComprimento());
                        if (animal instanceof Mamifero) {
                            System.out.println("Altura: " + ((Mamifero) (animal)).getAltura());
                            System.out.println("Tempo Gestacional: " + ((Mamifero) (animal)).getTempoGestacao());
                        } else if (animal instanceof Ave) {
                            System.out.println("Altura: " + ((Ave) (animal)).getAltura());
                            System.out.println("Envergadura: " + ((Ave) (animal)).getEnvergadura());
                        } else if (animal instanceof Artrópode) {
                            System.out.println("Número de Pernas: " + ((Artrópode) (animal)).getnPernas());
                            System.out.println("Número de Segmentos: " + ((Artrópode) (animal)).getnSegmentos());
                        }
                    }
                }
            }

            else if (opcoes == 3)
            {
                System.out.println("Qual o nome cientifico do animal que deseja atualizar?");
                String busca = input.nextLine();
                    for (Animal animal : listaAnimais) {
                        if (busca == animal.getNomeCientifico()) {
                            System.out.println("O que deseja atualizar?");
                            System.out.println("1 - Nome Cientifico");
                            System.out.println("2 - Nome Popular");
                            System.out.println("3 - Peso");
                            System.out.println("4 - Comprimento");
                            if (animal instanceof Mamifero) {
                                System.out.println("5 - Altura");
                                System.out.println("6 - Tempo Gestacional");
                                escolha = input.nextInt();
                                input.nextLine();

                                if (escolha == 1) {
                                    nC = input.nextLine();
                                    animal.setNomeCientifico(nC);
                                } else if (escolha == 2) {
                                    nP = input.nextLine();
                                    animal.setNomePopular(nP);
                                } else if (escolha == 3) {
                                    weight = input.nextDouble();
                                    animal.setPeso(weight);
                                } else if (escolha == 4) {
                                    length = input.nextDouble();
                                    animal.setComprimento(length);
                                } else if (escolha == 5) {
                                    height = input.nextDouble();
                                    ((Mamifero) (animal)).setAltura(height);
                                } else if (escolha == 6) {
                                    tG = input.nextInt();
                                    ((Mamifero) (animal)).setTempoGestacao(tG);
                                }
                            } else if (animal instanceof Ave) {
                                System.out.println("5 - Altura");
                                System.out.println("6 - Envergadura");
                                escolha = input.nextInt();
                                input.nextLine();

                                if (escolha == 1) {
                                    nC = input.nextLine();
                                    animal.setNomeCientifico(nC);
                                } else if (escolha == 2) {
                                    nP = input.nextLine();
                                    animal.setNomePopular(nP);
                                } else if (escolha == 3) {
                                    weight = input.nextDouble();
                                    animal.setPeso(weight);
                                } else if (escolha == 4) {
                                    length = input.nextDouble();
                                    animal.setComprimento(length);
                                } else if (escolha == 5) {
                                    height = input.nextDouble();
                                    ((Ave) (animal)).setAltura(height);
                                } else if (escolha == 6) {
                                    span = input.nextDouble();
                                    ((Ave) (animal)).setEnvergadura(span);
                                }
                            } else if (animal instanceof Artrópode) {
                                System.out.println("5 - Número de Pernas");
                                System.out.println("6 - Número de Segmentos");
                                escolha = input.nextInt();
                                input.nextLine();

                                if (escolha == 1) {
                                    nC = input.nextLine();
                                    animal.setNomeCientifico(nC);
                                } else if (escolha == 2) {
                                    nP = input.nextLine();
                                    animal.setNomePopular(nP);
                                } else if (escolha == 3) {
                                    weight = input.nextDouble();
                                    animal.setPeso(weight);
                                } else if (escolha == 4) {
                                    length = input.nextDouble();
                                    animal.setComprimento(length);
                                } else if (escolha == 5) {
                                    nLegs = input.nextInt();
                                    ((Artrópode) (animal)).setnPernas(nLegs);
                                } else if (escolha == 6) {
                                    nSegms = input.nextInt();
                                    ((Artrópode) (animal)).setnSegmentos(nSegms);
                                }
                            }
                        }
                    }
                }


            else if (opcoes == 4)
            {
                System.out.println("Qual o nome cientifico do animal que deseja remover?");
                String busca = input.nextLine();
                int i = 0;
                for (Animal animal : listaAnimais) {
                    if (busca == animal.getNomeCientifico()) {
                        listaAnimais.remove(i);
                    } else
                        i++;
                }
            }
        } while (opcoes <= 4);

        System.out.println("Obrigado por utilizar o sistema!");
    }
}