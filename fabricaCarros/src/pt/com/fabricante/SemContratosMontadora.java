package pt.com.fabricante;

public class SemContratosMontadora extends Montadora{
    @Override
    Carro devolucaoCarro(String solicitacaoDeNota) {
        if("B".equals(solicitacaoDeNota)) {
            return new Toyota(100,"full","Branco");
        } else {
            return new Kia(90,"full","Preto");
        }
    }
}
