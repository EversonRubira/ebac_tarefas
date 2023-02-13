package pt.com.Ebac;

public class Operadores {
    public static void main(String[] args) {

        operadoresAritmeticos();
    }

    private static void operadoresAritmeticos() {

        double nota1 = 6.5;
        double nota2 = 10.0;
        double nota3 = 7.8;
        double nota4 = 8.9;

        double nota = nota1 + nota2 + nota3 + nota4 / 4;


        System.out.println(nota);
    }
}
