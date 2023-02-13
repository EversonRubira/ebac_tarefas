package pt.com.mod10;

import java.util.Scanner;

public class TabuadaWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Deseja gerar a tabuada de algum numero? ");
        String resposta = s.next();

        while (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Digite um numero para gerar a tabuada: ");
            int num = s.nextInt();
            for (int i = 0; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + num * 1);
            }
            System.out.println("Deseja gerar novamente a tabuada de algum numero? ");
            resposta = s.next();


        }

        System.out.println("Obrigado, e volte sempre!");

    }

}