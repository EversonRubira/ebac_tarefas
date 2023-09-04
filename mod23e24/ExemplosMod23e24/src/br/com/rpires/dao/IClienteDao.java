package br.com.rpires.dao;

import br.com.rpires.Cliente;

/**
 * @author rodrigo.pires
 */
public interface IClienteDao {

    public String salvar();

    int buscarPorId();

    String excluir();

    String atualizar();
    //public int buscarPorId();
    //public String excluir();
    //public String atualizar();
}
