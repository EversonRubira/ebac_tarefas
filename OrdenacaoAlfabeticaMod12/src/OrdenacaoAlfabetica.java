import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoAlfabetica {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Digite os nomes separados por vírgula: ");
            String input = sc.nextLine();
            String[] nomes = input.split(",");
            Arrays.sort(nomes, String.CASE_INSENSITIVE_ORDER);
            System.out.println("Nomes em ordem alfabética:");
            for (String nome : nomes) {
                System.out.println(nome.trim());
            }
        }
    }


