package pt.com.rubira;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExeDistinct {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();
        Stream<Pessoa> stream = lista.stream().limit(2);
    }
}
