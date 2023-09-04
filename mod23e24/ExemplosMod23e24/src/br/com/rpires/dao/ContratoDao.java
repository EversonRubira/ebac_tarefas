package br.com.rpires.dao;

/**
 * @author rodrigo.pires
 */
public class ContratoDao implements IContratoDao {

    @Override
    public String salvar() {

        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public int buscarPorId() {

        return -1;
    }

    @Override
    public String excluir() {
        return null;
    }

    @Override
    public String atualizar() {
        return null;
    }


}
