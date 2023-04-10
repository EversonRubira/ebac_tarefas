package pt.com.fabricante;

public class Cliente {

    private String solicitacaoDeNota;
    private boolean contratoEmpresarial;

    public Cliente(String solicitacaoDeNota, boolean contratoEmpresarial) {
        this.solicitacaoDeNota = solicitacaoDeNota;
        this.contratoEmpresarial = contratoEmpresarial;
    }

    public boolean contratoEmpresarial() {
        return contratoEmpresarial;
    }

    public String getSolicitacaoDeNota() {
        return solicitacaoDeNota;
    }
}
