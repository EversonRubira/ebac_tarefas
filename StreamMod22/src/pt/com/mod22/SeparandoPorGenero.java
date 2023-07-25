package pt.com.mod22;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SeparandoPorGenero {
    public static void main(String[] args) {
        List<Genero> list = new Genero().populaGeneros();

        list.stream()
                        .map(Genero -> "Nome: " + Genero.getNome() + " Genero: " + Genero.getGenero() + " Idade: " + Genero.getIdade())
                        .forEach(System.out::println);

        System.out.println("****************");

        list.stream()
                .filter(genero -> genero.getGenero().equals("Feminino"))
                .forEach(genero -> System.out.println("A Sra " + genero.getNome() + " esta na lista e seu genero consta como do sexo feminino"));

        System.out.println("****************");


    }
}
