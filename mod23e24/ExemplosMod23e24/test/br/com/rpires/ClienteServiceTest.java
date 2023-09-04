package br.com.rpires;

import br.com.rpires.dao.ClienteDao;
import br.com.rpires.dao.ClienteDaoMock;
import br.com.rpires.dao.IClienteDao;
import br.com.rpires.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author rodrigo.pires
 */
public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }


    @Test
    public void testBuscaPorId() {
        IClienteDao clienteDaoMock = new ClienteDaoMock();
        ClienteService clienteService = new ClienteService(clienteDaoMock);
        int retorno = clienteService.buscaPorId();
        assertEquals(1, retorno);


    }

    @Test
    public void testAtualizar() {
        IClienteDao clienteDaoMock = new ClienteDaoMock();
        ClienteService clienteService = new ClienteService(clienteDaoMock);
        String retorno = clienteService.atualizar();
        assertEquals("Cliente atualizado com sucesso", retorno);


    }

    @Test
    public void testExcluir() {
        IClienteDao clienteDaoMock = new ClienteDaoMock();
        ClienteService clienteService = new ClienteService(clienteDaoMock);
        String retorno = clienteService.excluir();
        assertEquals("cliente excluido", retorno);


    }

}