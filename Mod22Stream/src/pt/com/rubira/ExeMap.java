package pt.com.rubira;

import java.util.List;
import java.util.stream.Stream;

public class ExeMap {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        Stream<Integer> stream = lista.stream()
                .filter(pessoa -> pessoa.getNome().equals("Rubira"))
                .map(Pessoa::getIdade);
    }
}
