package br.com.rpires;

import br.com.rpires.dao.ContratoDao;
import br.com.rpires.dao.IContratoDao;
import br.com.rpires.dao.mocks.ContratoDaoMock;
import br.com.rpires.service.ContratoService;
import br.com.rpires.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author rodrigo.pires
 */
public class ContratoServiceTest {

    @Test
    public void testSalvar() {
        IContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void testBuscaPorId() {
        IContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoService(dao);
        int retorno = service.buscarPorId();
        assertEquals(1, retorno);

    }

    @Test
    public void testExcluir() {
        IContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        assertEquals("cliente excluido", retorno);
    }

    //TODO
    //Fazer métodos de buscar, excluir e atualizar
}
