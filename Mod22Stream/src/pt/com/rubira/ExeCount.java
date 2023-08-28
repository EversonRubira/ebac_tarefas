package pt.com.rubira;

import java.util.List;

public class ExeCount {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();
        long count = lista.stream()
                .filter(pessoa -> pessoa.getNome().startsWith("A"))
                .count();

        System.out.println(count);
    }
}
