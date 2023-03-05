import java.util.*;

public class Mod12SeparandoPorGenero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();


        while (true) {
            System.out.print("Digite o nome completo: ");
            String nomeCompleto = scanner.nextLine();

            if(nomeCompleto.trim().isEmpty()) {
                System.out.println("Por favor digite um nome valido.");
                continue;
            }
            System.out.print("Digite o gênero (M/F): ");
            String genero = scanner.nextLine();

            if (genero.equalsIgnoreCase("M")) {
                nomesMasculinos.add(nomeCompleto);
            } else if (genero.equalsIgnoreCase("F")) {
                nomesFemininos.add(nomeCompleto);
            } else {
                System.out.println("Gênero inválido! Tente novamente.");
                continue;
            }

            System.out.println("Deseja adicionar mais algum nome na lista? (Sim/Nao)");
                String resposta = scanner.nextLine();

               if (!resposta.equalsIgnoreCase("Sim")) {
                   break;  }


            System.out.println("Nomes masculinos:");
            for (String nome : nomesMasculinos) {
                System.out.println(nome);
            }

            System.out.println("Nomes femininos:");
            for (String nome : nomesFemininos) {
                System.out.println(nome);
            }


        }
        scanner.close();

        System.out.println("Lista do nomes Femininos: " +nomesFemininos);
        System.out.println("Lista do nomes Masculinos: " + nomesMasculinos);
    }

}