package pt.com.fabricante;

public class Teste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("B", false);
        Montadora montadora = getCarroMontadora(cliente);
        Carro carro = montadora.criar(cliente.getSolicitacaoDeNota());
        carro.ligaMotor();
    }

    private static Montadora getCarroMontadora(Cliente cliente) {
        if(cliente.contratoEmpresarial()) {
            return new ContratosMontadora();
        }else {
            return new SemContratosMontadora();
        }
    }
}
