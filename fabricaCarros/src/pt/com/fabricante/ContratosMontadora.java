package pt.com.fabricante;

public class ContratosMontadora extends Montadora {
    @Override
    Carro devolucaoCarro(String solicitacaoDeNota) {
        if("A".equals(solicitacaoDeNota)) {
            return new MercedesBens(150,"full","Vermelho");
        } else {
            return new Bmw(110,"full","Prata");
        }
    }
}
