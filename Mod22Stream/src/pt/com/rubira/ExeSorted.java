package pt.com.rubira;

import java.util.Comparator;
import java.util.List;

public class ExeSorted {
    public static void main(String[] args) {

        List<Pessoa> lista = new Pessoa().popularPessoas();
        lista.stream()
                .filter(pessoa -> pessoa.getNome().equals("Rubira"))
                .sorted(Comparator.comparing(Pessoa::getNome));

        lista.stream()
                .sorted(Comparator.comparing(Pessoa::getIdade));
    }
}
