import java.util.Scanner;

public class NotasEscola {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota1, nota2, nota3, nota4;


        System.out.println("Digite a primeira nota:  ");
        nota1 = scan.nextDouble();

        System.out.println("Digite a Segunda nota:  ");
        nota2 = scan.nextDouble();

        System.out.println("Digite a Terceira nota:  ");
        nota3 = scan.nextDouble();

        System.out.println("Digite a Ultima nota:  ");
        nota4 = scan.nextDouble();

        scan.close();

        double media = (nota1+nota2+nota3+nota4) / 4;
        System.out.println("Sua Media/Nota Final é " + media);

        String notaFinal = getNotaFinal(media);
        System.out.println(notaFinal);

    }
        private static String getNotaFinal(double media) {
            if(media >= 7) {
                return "Parabens, voce foi aprovado";
            } else if (media >= 5) {
                return "Infelizmente, voce ficou em recuperacao";
            } else {
                return "Reprovado";

            }
        }

}
