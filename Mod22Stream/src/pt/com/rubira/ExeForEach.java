package pt.com.rubira;

import java.util.List;

public class ExeForEach {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        lista.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));

        System.out.println("****************");

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Portugal"))
                .forEach(pessoa -> System.out.println(pessoa.getNome()));

        System.out.println("****************");

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .map(Pessoa::getIdade)
                .forEach(p -> System.out.println(p));
    }


}
