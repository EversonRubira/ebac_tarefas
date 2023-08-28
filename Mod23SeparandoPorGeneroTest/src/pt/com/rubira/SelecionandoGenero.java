package pt.com.rubira;

import java.util.*;

public class SelecionandoGenero {


    Scanner scanner = new Scanner(System.in);
    List<String> nomesMasculinos = new ArrayList<>();
    List<String> nomesFemininos = new ArrayList<>();
    List<String> nomesNaoBinario = new ArrayList<>();

    public void adicionarNome(String nomeCompleto, String genero) {

        if (genero.equalsIgnoreCase("M")) {
            nomesMasculinos.add(nomeCompleto);
        } else if (genero.equalsIgnoreCase("F")) {
            nomesFemininos.add(nomeCompleto);
        } else if (genero.equalsIgnoreCase("NB")) {
            nomesNaoBinario.add(nomeCompleto);

        } else {
            System.out.println("Gênero inválido! Tente novamente.");

        }
    }

    public List<String> getNomesFemininos() {
        return nomesFemininos;
    }

    public List<String> getNomesMasculinos() {
        return nomesMasculinos;
    }

    public List<String> getNomesNaoBinario() {
        return nomesNaoBinario;
    }

    public void imprimirNomes() {

        System.out.println("Nomes de pessoas Nao Binario:");
        for (String nome : nomesNaoBinario) {
            System.out.println(nome);
        }

        System.out.println("Nomes de pessoas do genero feminino:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }

        System.out.println("Nomes de pessoas do genero masculino:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }

        System.out.println("************************");

        System.out.println("pessoas do Genero Feminino: ");
        nomesFemininos.forEach(nome -> System.out.println(nome));
    }

    public static void main(String[] args) {
        SelecionandoGenero selecionandoGenero = new SelecionandoGenero();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome completo: ");
            String nomeCompleto = scanner.nextLine();

            if (nomeCompleto.trim().isEmpty()) {
                System.out.println("Por favor digite um nome valido.");
                continue;
            }
            System.out.print("Digite o gênero (M - Masc / F - Fem / NB - Nao Binario ): ");
            String genero = scanner.nextLine();


            selecionandoGenero.adicionarNome(nomeCompleto, genero);

            System.out.println("Deseja adicionar mais algum nome na lista? (Sim/Nao)");
            String resposta = scanner.nextLine();

            if (!resposta.equalsIgnoreCase("Sim")) {
                break;
            }
        }
        scanner.close();
        selecionandoGenero.imprimirNomes();


        System.out.println("************************");


    }
}


