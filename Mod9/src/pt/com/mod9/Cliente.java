package pt.com.mod9;

public class Cliente {

    public static void main(String[] args) {

        int idade = 49;
        long cpf = 12345678900l;
        boolean status = false;
        double salario = 5.900;
        String nomeProprio = "Everson Rubira";
        char caracter = 'C';

        idade = Integer.valueOf(49);
        cpf = Long.valueOf(12345678900l);
        status = Boolean.valueOf(false);
        salario = Double.valueOf(5.900);
        nomeProprio = String.valueOf("Everson Rubira");
        caracter = Character.valueOf('C');

        System.out.println(idade);
        System.out.println(cpf);
        System.out.println(false);
        System.out.println(salario);
        System.out.println(nomeProprio);
        System.out.println(caracter);
    }

}
