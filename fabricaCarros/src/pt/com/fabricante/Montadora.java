package pt.com.fabricante;

public abstract class Montadora {

    public Carro criar(String solicitacaoDeNota) {
        Carro carro = devolucaoCarro(solicitacaoDeNota);
        carro = prepararCarro(carro);
        return carro;
    }

    private Carro prepararCarro(Carro carro) {
        carro.limpeza();
        carro.mecanica();
        carro.combustivelDoCarro();
        return carro;
    }

    abstract Carro devolucaoCarro(String solicitacaoDeNota);
}
