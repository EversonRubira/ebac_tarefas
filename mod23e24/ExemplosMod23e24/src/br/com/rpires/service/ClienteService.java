package br.com.rpires.service;

import br.com.rpires.dao.ClienteDao;
import br.com.rpires.dao.ClienteDaoMock;
import br.com.rpires.dao.IClienteDao;



/**
 * @author rodrigo.pires
 */
public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }

    public int buscaPorId() {

        return 1;

    }

    public String atualizar() {
        return "Cliente atualizado com sucesso";
    }

    public String excluir() {

        return "cliente excluido";
    }


/*
    public int buscaPorId() {

        return clienteDao.buscarPorId();
    }



    public String atualizar() {

        return clienteDao.atualizar();
    }

 */
}
