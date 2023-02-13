package pt.com.mod10;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Notas {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            double nota1, nota2, nota3, nota4;

            System.out.print("Digite a primeira nota: ");
            nota1 = scan.nextDouble();

            System.out.print("Digite a segunda nota: ");
            nota2 = scan.nextDouble();

            System.out.print("Digite a terceira nota: ");
            nota3 = scan.nextDouble();

            System.out.print("Digite a quarta nota: ");
            nota4 = scan.nextDouble();

            scan.close();

            double media = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println("Sua nota Media é " + media);

            String notaFinal = getNotaFinal(media);
            System.out.println(notaFinal);

        }


        private static String getNotaFinal(double media) {
              if (media >= 7) {
                return "Voce foi Aprovado, Parabens";
            } else if (media >= 5) {
                return "Voce ficou em Recuperaçao";
            } else {
                return "Reprovado";
            }
    }
    }








