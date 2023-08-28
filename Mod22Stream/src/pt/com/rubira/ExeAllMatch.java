package pt.com.rubira;

import java.util.List;

public class ExeAllMatch {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        boolean result = lista.stream()
                .allMatch(pessoa -> pessoa.getNacionalidade().equals("Brasil"));

        System.out.println(result);
    }
}
