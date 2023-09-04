package br.com.rpires.dao;

/**
 * @author rodrigo.pires
 */
public class ClienteDaoMock implements IClienteDao {


    @Override
    public String salvar() {
        return null;

    }

    @Override
    public int buscarPorId() {
        return 1;
    }

    @Override
    public String excluir() {
        return "cliente excluido";
    }

    @Override
    public String atualizar() {

        return "Cliente atualizado com sucesso";
    }


}
