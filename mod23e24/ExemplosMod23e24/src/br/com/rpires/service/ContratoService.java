package br.com.rpires.service;

import br.com.rpires.dao.IContratoDao;

/**
 * @author rodrigo.pires
 */
public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public int buscarPorId() {
        contratoDao.buscarPorId();
        return 1;
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "cliente excluido";
    }

    @Override
    public String atualizar() {

        return "cliente atualizado";
    }
}
