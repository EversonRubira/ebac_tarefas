package br.com.rpires.dao.mocks;


import br.com.rpires.dao.IContratoDao;
import br.com.rpires.service.IContratoService;

/**
 * @author rodrigo.pires
 */
public class ContratoDaoMock implements IContratoDao {

    @Override
    public String salvar() {
        return null;

    }

    @Override
    public int buscarPorId() {
        return -1;

    }

    @Override
    public String excluir() {
        return "cliente excluido";
    }

    @Override
    public String atualizar() {
        return "cliente atualizado";
    }
}
