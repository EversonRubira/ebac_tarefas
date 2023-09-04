package br.com.rpires.dao;

import br.com.rpires.Cliente;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rodrigo.pires
 */
public class ClienteDao implements IClienteDao {

    //private List<Cliente> clientes = new ArrayList<>();

    public String salvar() {
        throw new UnsupportedOperationException("Não funciona sem config de banco");

    }

    public int buscarPorId() {
        return -1;
    }

    public String excluir()  {
       return "cliente excluido";
    }

    public String atualizar() {

        return "Cliente atualizado com sucesso";
    }

}
