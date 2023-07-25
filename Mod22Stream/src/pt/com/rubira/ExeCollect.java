package pt.com.rubira;

import java.util.List;
import java.util.stream.Collectors;

public class ExeCollect {
    public static void main(String[] args) {

        List<Pessoa> lista = new Pessoa().popularPessoas();
        List<Pessoa> listaB = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toList());
        listaB.forEach(System.out::println);

        System.out.println("************");

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }
}
