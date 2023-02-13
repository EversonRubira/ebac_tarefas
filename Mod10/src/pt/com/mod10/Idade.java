package pt.com.mod10;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }

    public static String getIdade(int idade) {
        if (idade <= 17) {
            return "Infelizmente voce nao tem acesso a festa";
        } else if (idade >= 18) {
            return "Acesso permitido a festa, aproveite a noite";
        } else {
            return "Sem Documentos: Acesso Negado!";
        }

    }
}
